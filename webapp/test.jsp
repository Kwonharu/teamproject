<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>수아앗!</title>
<script type="text/javascript" src="/teamp/assets/js/jquery/jquery-1.12.4.js"></script>

</head>

<body>

<p>
  An example demonstrating the use of the
  <code>&lt;input type="color"&gt;</code> control.
</p>

<label for="color-picker">Color:</label>
<input type="color" value="#ff0000" id="color-picker" style="width: 100px; height: 50px;"/>

<p>
  Watch the paragraph colors change when you adjust the color picker. As you
  make changes in the color picker, the first paragraph's color changes, as a
  preview (this uses the <code>input</code> event). When you close the color
  picker, the <code>change</code> event fires, and we detect that to change
  every paragraph to the selected color.
</p>

a
<div id="asdf"></div>

<script>

let colorPicker;
const defaultColor = "#0000ff";

window.addEventListener("load", startup, false);

function startup() {
	  colorPicker = document.querySelector("#color-picker");
	  colorPicker.value = defaultColor;
	  colorPicker.addEventListener("input", updateFirst, false);
	  colorPicker.addEventListener("change", updateAll, false);
	  colorPicker.select();
	}
	
function updateFirst(event) {
	  const p = document.querySelector("p");
	  if (p) {
	    p.style.color = event.target.value;
	  }
	  console.log($("#color-picker").val());
	}

function updateAll(event) {
	  document.querySelectorAll("p").forEach((p) => {
	    p.style.color = event.target.value;
	  });
	  console.log($("#color-picker").val());
	  $("#asdf").css({"width":"300px", "height":"200px", "background-color":$("#color-picker").val()});
	}





</script>

</body>
</html>





