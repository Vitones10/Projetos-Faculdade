$(document).ready(carregou);

function carregou() {
console.log("carregou o bagui mermao");
    
  var frase = "bom dia";  
    
    $("#resultado1").html(frase);
    $("#btn1").click(clicou1)
    function clicou1 () {
        frase = "boa tarde";
        $("#resultado1").html(frase);
        
    }
    var saudação = " Boa Noite"
    var nome = "vitor"
    var frase2 = saudação +", "+ nome +"!";
    $("#btn2").click(clicou2)
    function clicou2 (){
        $("#resultado2").html(frase2);
    }
    //Teste 3 = Resgatando string de input
    $("#btn3").click(clicou3);
    function clicou3() {
        var saudação_recebida = $("#saudacao").val();
        var Nome_recebido = $("#nome").val();
        //var frase_final =  saudacao_recebida + ", " + Nome_recebido;
        $("#resultado3").html(saudação_recebida + "," + Nome_recebido);
    }
}
