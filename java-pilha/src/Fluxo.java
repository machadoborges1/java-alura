
public class Fluxo {

    public static void main(String[] args) {  
        System.out.println("Ini do main");
        metodo1();
        System.out.println("Fim do main");
    }

    private static void metodo1() {
        System.out.println("Ini do metodo2");
        metodo2();
        System.out.println("Fim do metodo2");
    }

    private static void metodo2() {
        System.out.println("Ini do metodo for");
        for(int i = 1; i <= 5; i++) {
            System.out.println(i);
        }
        System.out.println("Fim do metodo for");
    }
}

//Ini do main
//Ini do metodo2
//Ini do metodo for
//1
//2
//3
//4
//5
//Fim do metodo for
//Fim do metodo2
//Fim do main




public class Fluxo {  

    public static void main(String[] args) {
        System.out.println("Ini do main");
        metodo1();
        System.out.println("Fim do main");
    }

    private static void metodo1() {
        System.out.println("Ini do metodo1");
        metodo2();
        System.out.println("Fim do metodo1");
    }

    private static void metodo2() {
        System.out.println("Ini do metodo2");
        for(int i = 1; i <= 5; i++) {
            System.out.println(i);
            //vou add uma exeção à baixo
            int a = w/0;  // programa não sabe resolver isso.
        }
        System.out.println("Fim do metodo2");
    }
}

//Ini do main
//Ini do metodo1
//Ini do metodo2
//1
//Exception in thread "main" java.lang.ArithmeticException: / by zero
//        at Fluxo.metodo2(Fluxo.java:19)
//        at Fluxo.metodo1(Fluxo.java:11)
//        at Fluxo.main(Fluxo.java:5)





// TRY CATCH

public class Fluxo {  

    public static void main(String[] args) {
        System.out.println("Ini do main");
        metodo1();
        System.out.println("Fim do main");
    }

    private static void metodo1() {
        System.out.println("Ini do metodo1");
        metodo2();
        System.out.println("Fim do metodo1");
    }

    private static void metodo2() {
        System.out.println("Ini do metodo2");
        for(int i = 1; i <= 5; i++) {
            System.out.println(i);
            
            // fazendo com TRY CATCH
            try {
                int a = i / 0;
            } catch (ArithmeticException ex) {
                System.out.println("ArithmeticException");
            }
        }
        System.out.println("Fim do metodo2");
    }
}

//Ini do main
//Ini do metodo1
//Ini do metodo2
//1
//ArithmeticException
//2
//ArithmeticException
//3
//ArithmeticException
//4
//ArithmeticException
//5
//ArithmeticException
//Fim do metodo2
//Fim do metodo1
//Fim do main





//TRY CATCH	em outro local sem ser o laço, 
  //observe que ele entra no laço mas quando capta o erro vai direto ao CATCH e encerra o 'metodo2()'
	//metodo2() não tinha algo que conseguia resolver a "bomba"\'erro', então foi descartado, o proximo da PILHA era o metodo1(), cujo 
	  //tem o codigo que pode descartar e resolver o erro\bomba e retira-lo da pilha, e também continuar a execução
public class Fluxo {  

    public static void main(String[] args) {
        System.out.println("Ini do main");
        metodo1();
        System.out.println("Fim do main");
    }

    private static void metodo1() {
        System.out.println("Ini do metodo1");
        try {
            metodo2();
        } catch(ArithmeticException ex) {
            System.out.println("ArithmeticException");
        }
        System.out.println("Fim do metodo1");
    }

    private static void metodo2() {
        System.out.println("Ini do metodo2");
        for(int i = 1; i <= 5; i++) {
            System.out.println(i);
            //vou add uma exeção à baixo
            int a = w/0;
        }
        System.out.println("Fim do metodo2");
    }
}

//Ini do main
//Ini do metodo1
//Ini do metodo2
//1
//ArithmeticException
//Fim do metodo1
//Fim do main

