package ud5.Calculadora;

public class CalculadoraAvanzada extends Calculadora{
    
    private double resultadoAnterior = 0;


      public void cuadrado(){
        double nuevoValor= getResultado()*getResultado();
        resultadoAnterior = getResultado();
        setResultado(nuevoValor);
    }

    public void raiz(){
        resultadoAnterior = getResultado();
        setResultado(Math.sqrt(getResultado()));
    }

    public void deshacer(){
        setResultado(resultadoAnterior);
    }

        @Override
        public void sumar(double x){
            this.resultadoAnterior = getResultado();
            super.sumar(x);
        }

        @Override
        public void restar(double x){
            this.resultadoAnterior = getResultado();
            super.restar(x);
        }

        @Override
        public void multiplicar(double x){
            this.resultadoAnterior = getResultado();
            super.multiplicar(x);
        }

        @Override
        public void dividir(double x){
            this.resultadoAnterior = getResultado();
            super.dividir(x);
        }

        @Override
        public void raiz(double x){
            this.resultadoAnterior = getResultado();
            setResultado(Math.sqrt(x));
        }


            @Override
        public void cuadrado(double x){
            this.resultadoAnterior = getResultado();
            setResultado(x * x);
        }


        @Override
        public void reset(double x){
            this.resultadoAnterior = getResultado();
            setResultado(x);
        }


}
