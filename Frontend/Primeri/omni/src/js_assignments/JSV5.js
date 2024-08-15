/* 
    Zadatak 5
    Napisati funkciju koja za dati string kaže da li je palindrom (čita se isto i sa jedne i sa druge strane). Razmaci i mala/velika slova nisu bitni, a interpunkcija nije podržana. 

    b) realiovati react kontrolu koja se sastoji od texta polja i dugmeta, gde dugme proveri tekst unesen u polje i ispod ispise "Jeste palindrom ili nije palindrom u zavisnosti od toga sta je rezultat funkcije
    
    c) modifikovati react kontrolu tako da umesto da moram da pritisnem dugme jednostavno ispod kontrole pse da li je ono sto je uneto je alindrom ili ne
    
*/

import { useState, useEffect } from "react";

const is_palindrome = (s) => {
  s = s.replace(/\s+|[^a-zA-Z]/g, "").toLowerCase();

  let left_pointer = 0;
  let right_pointer = s.length - 1;

  while (left_pointer < right_pointer) {
    if (s[left_pointer] !== s[right_pointer]) {
      return false;
    }
    left_pointer += 1;
    right_pointer -= 1;
  }

  return true;
};

const PalindromeChecker = () => {
  const [inputText, setInputText] = useState("");
  const [result, setResult] = useState("");

  useEffect(() => {
    if (inputText) {
      if (is_palindrome(inputText)) {
        setResult("The word IS a palindrome!");
      } else {
        setResult("The word IS NOT a palindrome!");
      }
    } else {
      setResult("");
    }
  }, [inputText]);

  return (
    <div>
      <input
        type="text"
        value={inputText}
        onChange={(e) => setInputText(e.target.value)}
        placeholder="Enter text"
      />
      <div>{result}</div>
    </div>
  );
};

export default PalindromeChecker;
