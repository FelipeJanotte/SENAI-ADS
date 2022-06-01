function validaFaleConosco() {
  if (document.frmfaleconosco.txtnome.value == "") {
    alert("Preencha o campo nome");
    document.frmfaleconosco.txtnome.focus();
    return false;
  }
  if (document.frmfaleconosco.txtfone.value == "") {
    alert("Preencha o campo telefone");
    document.frmfaleconosco.txtfone.focus();
    return false;
  }
  if (document.frmfaleconosco.txtemail.value == "") {
    alert("Preencha o campo email");
    document.frmfaleconosco.txtemail.focus();
    return false;
  }
  if (document.frmfaleconosco.selmotivo.value == "") {
    alert("Preencha selecione uma opção no motivo do contato");
    document.frmfaleconosco.selmotivo.focus();
    return false;
  }
  if (document.frmfaleconosco.txtcomentario.value == "") {
    alert("Preencha o campo de comentário");
    document.frmfaleconosco.txtcomentario.focus();
    return false;
  }

  return true;
}

function verificaMotivo(motivo) {
  const elemento = document.getElementById("opcaoProduto");

  if (motivo == "PR") {
    const select = document.createElement("select");
    select.setAttribute("name", "selproduto");

    let option = document.createElement("option");
    option.setAttribute("value", "");

    let texto = document.createTextNode("Escolha");

    option.appendChild(texto);

    select.appendChild(option);

    option.setAttribute("value", "FR");
    texto = document.createTextNode("Freezer");

    let option1 = document.createElement("option");

    option1.appendChild(texto);

    select.appendChild(option1);

    let option2 = document.createElement("option");
    option2.setAttribute("value", "GE");

    texto = document.createTextNode("Geladeira");

    option2.appendChild(texto);
    select.appendChild(option2);

    elemento.appendChild(select);
  } else {
    if (elemento.firstChild) {
      elemento.removeChild(elemento.firstChild);
    }
  }
}
