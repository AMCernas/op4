public class main {
    public static void main(String[] args) {

        //OBJETO CLIENTE
        Cliente cliente = new Cliente();
        cliente.setNombre("Arnoldo");
        cliente.setEdad(22);
        cliente.setTelefono("31200001111");
        cliente.setCredito("800");

        System.out.println("***Cliente***");
        System.out.println(cliente.getNombre());
        System.out.println(cliente.getEdad());
        System.out.println(cliente.getTelefono());
        System.out.println(cliente.getCredito());

        //OBJETO TRABAJADOR
        Trabajador trabajador = new Trabajador();
        trabajador.setNombre("Francisco");
        trabajador.setEdad(33);
        trabajador.setTelefono("321200001111");
        trabajador.setSalario("$3200");

        System.out.println("***Trabajador***");
        System.out.println(trabajador.getNombre());
        System.out.println(trabajador.getEdad());
        System.out.println(trabajador.getTelefono());
        System.out.println(trabajador.getSalario());
    }

}

    // CLASE PERSONA
    class persona{

        String nombre;
        int edad;
        String telefono;


        //SET Y GET DE NOMBRE, EDAD Y TELEFONO
        public String getNombre(){
            return this.nombre;
        }

        public void setNombre(String nombre){
            this.nombre = nombre;
        }

        public int getEdad(){
            return this.edad;
        }

        public void setEdad(int edad){
            this.edad = edad;
        }

        public String getTelefono(){
            return this.telefono;
        }

        public void setTelefono(String telefono){
            this.telefono = telefono;
        }

    }

//CLASE CLIENTE QUE HEREDA DE PERSONA CON VARIABLE CREDITO UNICA
    final class Cliente extends persona{

        String credito;

        public String getCredito(){
            return this.credito;
        }

        public void setCredito(String credito){
            this.credito = credito;
        }

    }
    //CLASE TRABAJADOR QUE HEREDA DE PERSONA CON VARIABLE SALARIO UNICA
    final class Trabajador extends persona{
        String salario;

        public String getSalario(){
            return this.salario;
        }

        public void setSalario(String salario){
            this.salario = salario;
        }
    }








