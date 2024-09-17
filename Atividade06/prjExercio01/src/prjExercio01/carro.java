package prjExercio01;

public class carro {

	//Atributos
 String modelo;
 String marca;
 String placa;
 int ano;
 
 // Construtores 
 public carro() {
	 
 }
 public carro(String modelo,String marca,String placa, int ano) {
	 this.modelo = modelo;
	 this.marca = marca;
	 this.placa = placa;
	 this.ano = ano;
 }
 // Metodos
 
 public void exibirInfo() {
 }
 
 public void exibirMarca() {
	System.out.println("Marca: " + this.marca);
 }
 
 public void exibirmodelo() {
		System.out.println("Modelo: " + this.modelo);
	 }
 
 public void exibirPlaca() {
		System.out.println("Placa: " + this.placa);
	 }
 
 public void exibirAno() {
		System.out.println("ano: " + this.ano);
	 }
 
 //carro
		public static void main(String[] args) {
			carro carro1 = new carro();
			carro1.modelo = "Celta";
			carro1.marca = "chevrolet";
			carro1.ano = 2008;
			carro1.placa = "BBB-0000";
		}
}
