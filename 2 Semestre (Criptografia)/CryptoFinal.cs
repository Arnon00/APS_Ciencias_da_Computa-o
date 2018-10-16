using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Security.Cryptography;
using System.Security;
using System.IO;

namespace Teste_novamente
{
    class MainClass
    {
        public static string EncryptString(string mensagem, string senha)//parte de cryptografia
        {

            byte[] results; System.Text.UTF8Encoding UTF8 = new System.Text.UTF8Encoding();
            // Calculo o hash da senha (key) usando MD5
            // Usando gerador de hash como o resultado é um array de bytes de 128 bts que é um comprimento válido para o codificador TripleDES usado abaixo
            MD5CryptoServiceProvider hashProvider = new MD5CryptoServiceProvider();
            byte[] tDESKey = hashProvider.ComputeHash(UTF8.GetBytes(senha));

            // Criando um objeto new TripleDESCryptoServiceProvider ( o nome ja diz qual o tipo de crypto abordada, um de des normal seria "DESCryptorServiceProvider")
            TripleDESCryptoServiceProvider tDESAlgorithm = new TripleDESCryptoServiceProvider();

            //começo da Configuração do codificador
            tDESAlgorithm.Key = tDESKey;                //
            tDESAlgorithm.Mode = CipherMode.ECB;        //
            tDESAlgorithm.Padding = PaddingMode.PKCS7;  //

            // PConvertendo a seqüência de entrada para bytes [] "utf8" é um encording 
            byte[] dataToEncrypt = UTF8.GetBytes(mensagem);
            // Tentativa para criptografar a seqüência de caracteres
            try
            {
                ICryptoTransform encryptor = tDESAlgorithm.CreateEncryptor();
                results = encryptor.TransformFinalBlock(dataToEncrypt, 0, dataToEncrypt.Length);
            }
            finally
            {
                // Limpe as tripleDES e serviços hashProvider de qualquer informação sensível (Aqui começa a aparecer os comando clear, eles juntamente com o close são muitos importantes quando se trabalha com arquivos.)
                tDESAlgorithm.Clear();
                hashProvider.Clear();
            }
            // retornando a seqüência criptografada como uma string base64 codificada
            return Convert.ToBase64String(results);
        }

        public static string DecryptString(string mensagem, string senha)//parte de descriptografia;
        {
            byte[] results;
            System.Text.UTF8Encoding UTF8 = new System.Text.UTF8Encoding();

            // Calculamos o hash da senha usando MD5 (Mesmos processos feitos para a cryptografia)
            
            MD5CryptoServiceProvider hashProvider = new MD5CryptoServiceProvider();
            byte[] tDESKey = hashProvider.ComputeHash(UTF8.GetBytes(senha));

            // Criando outro objeto new TripleDESCryptoServiceProvider 
            TripleDESCryptoServiceProvider tDESAlgorithm = new TripleDESCryptoServiceProvider();

            // Mais uma vez configuando o codificador, atenção! cuidado com os nomes
            tDESAlgorithm.Key = tDESKey;
            tDESAlgorithm.Mode = CipherMode.ECB;
            tDESAlgorithm.Padding = PaddingMode.PKCS7;
            // Convertendo a seqüência de entrada para um byte []
            byte[] dataToDecrypt = Convert.FromBase64String(mensagem);
            // Tentativa para criptografar a seqüência de caracteres
            try
            {   //aqui começa começa a diferendo entre os dois processos, no primeiro, era criado o TDESAlgorithm.CreateEncryptor 
                // ja nesta parte fazemos o contrario, criamos o tDES...Decryptor;
                ICryptoTransform Decryptor = tDESAlgorithm.CreateDecryptor();
                //jogamos o resultado na variavel results, mas os dados ainda não estão usaveis.
                results = Decryptor.TransformFinalBlock(dataToDecrypt, 0, dataToDecrypt.Length);
            }
            finally
            {
                // Limpado novamente o tripleDES e serviços hashProvider de qualquer informação sensível
                tDESAlgorithm.Clear();
                hashProvider.Clear();
            }

            // agora Encodamos a seqüência criptografada como uma string base64 codificada, agora sim, os dados estão ultilizaveis.  
            return UTF8.GetString(results);
        }
         
        /*public static string dados (string msg, string sn) 
          {
            
          }
        */
        public static void Main(string[] args)
        {
            char gat1; // gatilho de comando para transitar pelo codigo;
           
            Console.WriteLine("\n ************************** Crypto Programa! ************************\n"); // apresentação;
            Console.WriteLine("\n\n Trabalho de APS do grupo... Não temos nome!! ");
            Console.WriteLine("\n\nMenbros... \n\n\n \n Arnon. \n Patricia. \n Ranny. ");
            Console.WriteLine("\n\nPrecione qualquer tecla para continuar!");
            Console.ReadLine();
 gambi:
            Console.Clear();
            Console.WriteLine("************** Digite sua mensagem ****************\n");
            string msgm = Console.ReadLine();
            if (!File.Exists(@"mensagem.txt")) // Aqui verifica se o Arquivo especifico ja existe no diretorio, caso não...
            { File.Create(@"mensagem.txt").Close(); }
            using (StreamWriter sw = File.AppendText("mensagem.txt"))
            {
                sw.WriteLine(msgm);                  // jogando infos do msgm para sw que por sua vez, grava no arquivo txt.
            }                                        //Cria-se o mesmo, atenção ao operador de negação "!"
                                                    //o close() no final garante que o arquivo não continue aberto, porque ao se criar um 
                                                    //arquivo com *file.Create ele retorna um *FileStream
            Console.WriteLine("\n\nAgora Digite sua chave de segurança para a cryptografia. (8 letras)");
          
            string snh = Console.ReadLine();
            if (!File.Exists(@"Chave.txt")) //
            { File.Create(@"Chave.txt").Close(); }
            using (StreamWriter sw = File.AppendText("Chave.txt"))
            {
                sw.WriteLine(snh); // jogando infos do msgm para sw que por sua vez, grava no arquivo txt.
            }
   
            if (!File.Exists(@"MengCrypt.txt")) //
            { File.Create(@"MengCrypt.txt").Close();

                    using (StreamWriter sw = File.AppendText("MengCrypt.txt"))
                    {
                     sw.WriteLine("0"); // jogando infos do msgm para sw que por sua vez, grava no arquivo txt.
                    }
            
            }

            Stream m1 = File.Open("mensagem.txt", FileMode.Open);
            StreamReader mg = new StreamReader(m1);
            string mssg = mg.ReadLine();
           

            Stream m2 = File.Open("Chave.txt", FileMode.Open);
            StreamReader cg = new StreamReader(m2);
            string cssg = cg.ReadLine();
            


            string mensagem = mssg;
            string senha = cssg;
            string stringEncriptada = EncryptString(mensagem, senha);
            string stringDescriptograda = DecryptString(stringEncriptada, senha);
           
            mg.Close();
            m1.Close();
            cg.Close();
            m2.Close(); 
            
        /*
        Para localização!
        Mensagem: msg;
        Senha: Senha; / Key
        String encriptada: stringEncriptada;
        String descriptografada: stringDescriptograda;
        */
        ret: // primeiro ponto de retorno. Menu principal;
            Console.Clear();//limpa a tela toda vez que o usuario volte para essa area;
            //começo do menu;

            Console.WriteLine("\nOque deseja fazer agora? \n\n[1] Escrever mensagem novamente. \n\n[2] Enviar mensagem. \n\n[3] Descriptografar arquivo \n\n[4] Status do codigo. \n\n[o] Sair.");
            gat1 = Convert.ToChar(Console.ReadLine());
            //começo das escolhas no menu.
            if (gat1 == '1')
              {
                goto gambi; // vai para o segundo ponto mais importante, entrada de dados do usuario;
              } 
                if (gat1 == '2')
                   {   //ainda trabalhando nisso; talvez usar a ajuda do windonsforms (Pode ser uma boa e deixara mais facil e visualmente bonito);
                    Console.WriteLine("\nDesculpe o transtorno, ainda estamos trabalhando nesta parte.");
                    // A ideia aqui é, usar o movefile e dar a opção do usuario escolher a pasta (claro, em criterio de ser so para teste)
                   
                    Console.ReadLine();
                
                    goto ret; // volta para o começo.
                   } 
                    if (gat1 == '3')
                       {
                        Console.Clear(); //começo das opções apos digitar a mensagem;
                        Console.WriteLine(" \n\nEscolha um arquivo especifico.");

                        /*if (File.Exists("entrada.txt"))
                   {
                       Stream entrada = File.Open("entrada.txt", FileMode.Open);
                       StreamReader leitor = new StreamReader(entrada);
                       string linha = leitor.ReadLine();
                       while (linha != null)
                       {
                           MessageBox.Show(linha);
                           linha = leitor.ReadLine();
                       }
                       leitor.Close();
                       entrada.Close();
                   }
                        
                              Aqui com certeza terei que usar o forms... para que inventei isso?? (''- ;)
                            
                              caso usuario tente digitar um numero diferente das opçoes. algo que daria break(esse nem é o nome); 
                              esto não impede o mesmo, mas dificulta que ocorra; 
                                    

                        // começo novamente;*/
                       }
            if (gat1 == '4')
               {   
                //para uso proprio, porder verificar em tempo real se o codigo esta como deveria.
                Console.Clear();
                string t1 = System.IO.File.ReadAllText(@"mensagem.txt");
                System.Console.WriteLine("Mensagem: {0}", t1);

                string t2 = System.IO.File.ReadAllText(@"Chave.txt");
                System.Console.WriteLine("Chave: {0}", t2);

                Console.WriteLine("\nString encriptada: {0}", stringEncriptada);
                Console.WriteLine("\nString descriptografada: {0}", stringDescriptograda);
                Console.WriteLine("\nDeseja limpar os dados? \n\n[1]Sim. \n\n[0]Não");
                int zis = int.Parse(Console.ReadLine());
                switch (zis)
                    {
                     case 1:
                   
                       File.Delete(@"mensagem.txt");
                       File.Delete(@"Chave.txt");
                       File.Delete(@"MengCrypt.txt");
                       //parte da rotina para testes, limpar o arquivo para recomeçar, sem precisar fechar o programa;
                       File.Create(@"mensagem.txt").Close();
                       File.Create(@"Chave.txt").Close();
                       File.Create(@"MengCrypt.txt");
                       Console.WriteLine("Limpo...");
                       Console.ReadLine();
                       goto ret; 
                    
                    case 0: 
                     
                      Console.WriteLine("\n\nPrecione qualquer tecla para voltar ao menu prencipal");
                      Console.ReadLine();//modo de voltar rapido para o menu principal.
                      goto ret;
                    
                     }
              }
            if (gat1 == '0')
            {
                goto fim; //pula ja para o encerramento do programa
            }
            else
            {
                Console.WriteLine("Opção não existe"); // tentando evitar break;
                Console.ReadLine();
                goto ret;
            }
       
            Console.WriteLine("************** Digite sua mensagem ****************\n");
            
            /*
            //Criando a string que vai armazenar o texto temporariamente
            //abrindo StreamWriter; criando sw (Vai fazer a gravação do msgm no arquivo txt.)
            using (StreamWriter sw = File.AppendText("mensagem.txt"))
            {
                sw.WriteLine(msgm); // jogando infos do msgm para sw que por sua vez, grava no arquivo txt.
                
            }


            //criando o arquivo de texto para a chave
            using (StreamWriter sk = File.AppendText("Chave.txt"))
            {
                sk.WriteLine(snh);
                
            } 
            //Parte pos digitação da mensagem*/
        a1: 
            gat1 = '0';
            Console.WriteLine("\n\n[1] Visualizar texto criptografado?  \n\n[2] Voltar para o menu inicial?");
            gat1 = char.Parse(Console.ReadLine());
            switch (gat1)
            {
                case '1':
                a2:
                    Console.Clear();
                    Console.WriteLine("\n*********************Cryptografado*********************\n");
                    //string Crypt = System.IO.File.ReadAllText(@"Encrypted.txt");
                    Console.WriteLine("\n{0}", stringEncriptada);
                    Console.WriteLine("\nEste e seu texto criptografado");
                    Console.WriteLine("\n\n\n\n\n[1] Voltar para o menu principal. \n\n ou \n\n[0] Para sair...");
                    gat1 = char.Parse(Console.ReadLine());
                    if (gat1 == '1')
                    { goto ret; }//volta para o menu principal.
                    if (gat1 == '0')
                    { goto fim; } //fecha o console.
                    else
                        goto a2; //caso digitem outra opção, volta sem sair do menu "Cryptografado"
                    

                case '2':
                    goto ret; // volta para o menu principal

                default:
                    Console.WriteLine("Opção inexistente"); //evitando break 
                    goto a1; //volta para a parte "Cryptografado" novamente

            }

        fim: // retorno comando de sair; 
            //final do programa;
            
            //Por questão de segurança, logicamente os arquivos de texto são apagados quando o programa e fechado;
            File.Delete(@"mensagem.txt");
            File.Delete(@"Chave.txt");
            File.Delete(@"MengCrypt.txt");
            
            Console.ReadKey();
        }

    }
}
