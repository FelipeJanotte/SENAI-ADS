function validaFaleConosco() {
  let nome = document.frmfaleconosco.txtnome.value;
  const expRegNome = new RegExp("^[A-zÀ-ü]{3,}([ ]{1}[A-zÀ-ü]{2,})+$");

  if (!expRegNome.test(nome)) {
    alert("Preencha o campo Nome corretamente");
    document.frmfaleconosco.txtnome.focus();
    return false;
  }

  let fone = document.frmfaleconosco.txtfone.value;
  const expRegFone = new RegExp(
    "^[(]{1}[1-9]{2}[)]{1}[0-9}{4,5}[-]{1}[0-9]{4}$"
  );

  if (!expRegFone.test(fone)) {
    alert("Preencha o campo telefone");
    document.frmfaleconosco.txtfone.focus();
    return false;
  }

  let email = document.frmfaleconosco.txtemail.value;
  const expRegEmail = new RegExp("([a-z]+).(@[a-z]+.).");

  if (expRegEmail.test(email)) {
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
