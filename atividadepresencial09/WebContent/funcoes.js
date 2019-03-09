/**
 * 
 */
function getValor() {
	valor = prompt("Insira um valor: ");
	sequencianumerica(valor);
}
function sequencianumerica(v) {
	document.write(v+" ");
	while(v != 1){
	   if (v%2==0) {
		   v = v/2;
	        document.write(v+" ");
	    }else{
	    	v=(v*3)+1;
	        document.write(v+" ");
	    }
	}
}