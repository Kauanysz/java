package view;

import view.TelaPrincipal;

 class MainTela {
	  
	 public static void main(String[] args) {
		 javax.swing.SwingUtilities.invokeLater(new Runnable() {
			 public void run() {
				 TelaPrincipal tl = new TelaPrincipal(640, 780, "PetShop");
			 }
		 });
	 }

}
