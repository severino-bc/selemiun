package robo;

/*package robo;




import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ZeraBanco {

    public static void ExecutaShell(String comand) {
        try {
            final ShellBanco shell = new ShellBanco();
            shell.executeCommand(comand);
            
        } catch (IOException ex) {
            Logger.getLogger(ShellBanco.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void ExecutaShellBancoRobo() throws IOException{
        final ShellBanco shell = new ShellBanco();
    
System.out.println("cheguei aqui");
        // derruba conexão de usuários (banco sistema)
shell.executeCommand("psql -U postgres -h 192.168.1.69 -c \"select pg_terminate_backend(procpid) from pg_stat_activity where datname = 'robo_homologacao'\"");
// apaga banco antigo (banco sistema)
shell.executeCommand("psql -U postgres -h 192.168.1.69 -c \"DROP DATABASE IF EXISTS robo_homologacao\"");
// derruba conexão de usuários (banco template)
shell.executeCommand("psql -U postgres -h 192.168.1.69 -c \"select pg_terminate_backend(procpid) from pg_stat_activity where datname = 'robo_carga_template_crud'\"");
// criar banco usando templante
shell.executeCommand("psql -U postgres -h 192.168.1.110 -c \"CREATE DATABASE teste_severino12 TEMPLATE testes_qualiddade\"");
 
        System.out.println("Passou");
        
    }
}
*/


import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.logging.Logger;

public class ZeraBanco {

    private static final Logger log = Logger.getLogger(ZeraBanco.class.getName());    

    public void executeCommand(final String command) throws IOException {
        
        final ArrayList<String> commands = new ArrayList<String>();
        commands.add("/bin/bash");
        commands.add("-c");
        commands.add(command);
        
        BufferedReader br = null;        
        
        try {                        
            final ProcessBuilder p = new ProcessBuilder(commands);
            final Process process = p.start();
            final InputStream is = process.getInputStream();
            final InputStreamReader isr = new InputStreamReader(is);
            br = new BufferedReader(isr);
            
            String line;            
            while((line = br.readLine()) != null) {
                System.out.println("Retorno do comando = [" + line + "]");
            }
        } catch (IOException ioe) {
            log.severe("Erro ao executar comando shell" + ioe.getMessage());
            throw ioe;
        } finally {
            secureClose(br);
        }
    }
    
    private void secureClose(final Closeable resource) {
        try {
            if (resource != null) {
                resource.close();
            }
        } catch (IOException ex) {
            log.severe("Erro = " + ex.getMessage());
        }
    }
    
    public static void execute() throws IOException {
        final ZeraBanco shell = new ZeraBanco();
   String database = "robo_qualidade";
   String templateBanco;
   String pgDump = "robo";
        // derruba conexão de usuários (banco sistema)
//shell.executeCommand("psql -U postgres -h 192.168.1.110 -c \"select pg_terminate_backend(pid) from pg_stat_activity where datname = " +database);
// apaga banco antigo (banco sistema)
//shell.executeCommand("psql -U postgres -h 192.168.1.110 -c \"DROP DATABASE IF EXISTS \"+database");
// derruba conexão de usuários (banco template)
//shell.executeCommand("psql -U postgres -h 192.168.1.69 -c \"select pg_terminate_backend(pid) from pg_stat_activity where datname = " +database);
//shell.executeCommand("psql -U postgres -h 192.168.1.110 -c \"CREATE DATABASE"+ pgDump);
shell.executeCommand("./robo.sh");


    }
}

