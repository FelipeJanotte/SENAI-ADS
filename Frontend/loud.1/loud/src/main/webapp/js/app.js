const nameElement = document.getElementById("name");
const emailElement = document.getElementById("email");
const reasonSelectElement = document.getElementById("reason-select");
const genderMaleCheckboxElement = document.getElementById("gender-male");
const genderFemaleCheckboxElement = document.getElementById("gender-female");
const termCheckboxElement = document.getElementById("terms-checkbox");

function valideteForm() {
  const regexName = new RegExp("^([A-zÀ-ü]{3,})( *.*)$");

  if (!regexName.test(nameElement.value)) {
    let message = document.querySelector("#name + p");
    message.classList.add("display-block");
    nameElement.focus();

    return false;
  }

  const regexEmail = new RegExp(
    "^([a-z](.[a-z])*)+[@]{1}([a-z]{3,})([.]{1}[a-z]+)+$"
  );
  if (!regexEmail.test(emailElement.value)) {
    let message = document.querySelector("#email + p");
    message.classList.add("display-block");
    emailElement.focus();

    return false;
  }

  if (reasonSelectElement.value == "") {
    let message = document.querySelector(".reason p");
    message.classList.add("display-block");
    reasonSelectElement.focus();

    return false;
  }

  if (
    !genderMaleCheckboxElement.checked &&
    !genderFemaleCheckboxElement.checked
  ) {
    let message = document.querySelector(".gender p");
    message.classList.add("display-block");
    genderFemaleCheckboxElement.focus();
    genderMaleCheckboxElement.focus();

    return false;
  }

  if (!termCheckboxElement.checked) {
    let message = document.querySelector(".terms + p");
    message.classList.add("display-block");
    termCheckboxElement.focus();

    return false;
  }

  return true;
}

function removeInvalidMessage(el) {
  if (el === "terms-checkbox") {
    let message = document.querySelector("form p.term-invalid-text");
    message.classList.remove("display-bloc");
  } else if (el === "gender") {
    let message = document.querySelector(".gender > p");
    message.classList.remove("display-block");
  } else {
    let message = document.querySelector(`#${el} + p`);
    message.classList.remove("display-block");
  }
}


$(document).ready(function() {
	$("footer").load("/loud/pages/general/footer.html");
	$("header").load("/loud/pages/general/header.html");
})
