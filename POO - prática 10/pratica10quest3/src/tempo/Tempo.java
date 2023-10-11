package tempo;

public class Tempo {

	 private int hora;
	    private int minuto;
	    private int segundo;

	    public Tempo() {
	        this(0, 0, 0);
	    }

	    public Tempo(int hora) {
	        this(hora, 0, 0);
	    }

	    public Tempo(int hora, int minuto) {
	        this(hora, minuto, 0);
	    }

	    public Tempo(int hora, int minuto, int segundo) {
	        setTime(hora, minuto, segundo);
	    }

	    public void setTime(int hora, int minuto, int segundo) {
	        if (hora >= 0 && hora <= 23 && minuto >= 0 && minuto <= 59 && segundo >= 0 && segundo <= 59) {
	            this.hora = hora;
	            this.minuto = minuto;
	            this.segundo = segundo;
	        } else {
	            System.out.println("Valores de tempo inválidos. O tempo não foi atualizado.");
	        }
	    }

	    public void setHora(int hora) {
	        if (hora >= 0 && hora <= 23) {
	            this.hora = hora;
	        } else {
	            System.out.println("Hora inválida. O valor não foi atualizado.");
	        }
	    }

	    public int getHora() {
	        return hora;
	    }

	    public void setMinuto(int minuto) {
	        if (minuto >= 0 && minuto <= 59) {
	            this.minuto = minuto;
	        } else {
	            System.out.println("Minuto inválido. O valor não foi atualizado.");
	        }
	    }

	    public int getMinuto() {
	        return minuto;
	    }
	    
	    public void setSegundo(int segundo) {
	        if (segundo >= 0 && segundo <= 59) {
	            this.segundo = segundo;
	        } else {
	            System.out.println("Segundo inválido. O valor não foi atualizado.");
	        }
	    }

	    public int getSegundo() {
	        return segundo;
	    }

	    public String toString() {
	        return hora + ":" + minuto + ":" + segundo;
	    }

	    public static void main(String[] args) {
	        Tempo tempo1 = new Tempo(); 
	        System.out.println("Tempo 1: " + tempo1.toString());

	        Tempo tempo2 = new Tempo(12); 
	        System.out.println("Tempo 2: " + tempo2.toString());

	        Tempo tempo3 = new Tempo(8, 45); 
	        System.out.println("Tempo 3: " + tempo3.toString());

	        Tempo tempo4 = new Tempo(15, 30, 25); 
	        System.out.println("Tempo 4: " + tempo4.toString());

	        tempo1.setTime(1, 2, 3); 
	        System.out.println("Tempo 1 (após setTime): " + tempo1.toString());

	        tempo1.setHora(25); 
	        tempo1.setMinuto(70); 
	        tempo1.setSegundo(-10); 
	        System.out.println("Tempo 1 (após tentativas inválidas): " + tempo1.toString());

	}

}
