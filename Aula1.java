public class HelloWorld //Nome da class
{
    public static int soma(int a, int b){ // tem que ter o static pois o main só poderá chamar funções que também são statics
        int c = a + b;
        return c;
    }
    public static int soma(double a, double b){ // sobrecarga, dois metodos com o mesmo nome porem com dois tipos de parametros diferentes
        return 0;
    }
    public static void main(String[] args) // void tipo de retorno(paramentros)
    {//static serve para agrupar as funções, ele não sofrerá alteração quando um objeto for criado, ele está ligado a classe por isso é declarada como static
        System.out.println("Hello, World");
        int x = 3;
        int y = 4;
        int z = soma(x,y); // chama a função
        System.out.println(soma(x,y));
        System.out.println("A soma de "+ x + "e" + y + "é" + z);
        //System.out.println(soma(3,4)); são equivalentes
    }
}

//Nome do arquivo tem que ser o mesmo nome da classe

//Para compilar no terminal:
//javac HelloWorld.java (cria o arquivo class)
// java HelloWorld (Roda o programa)
