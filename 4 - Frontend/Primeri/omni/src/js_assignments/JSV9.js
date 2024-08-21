/* 
    Zadatak 9
    a) Napisati funkciju koja za dati tekst vrati procenat upotrebe svih slova u redosledu abecede. Mala i velika slova se ignorišu, razmaci i znakovi interpunkcije se ignorišu. Za potrebe ovoga, samo se razmatra engleska abeceda. 
    b) Napisati kontrolu koja kako kucam string tako osvezava display procenata upotrebe svih slova abecede.
    BONUS) Modifikovati zadatak pod b) tako da ima i displej grafikona koji prikazuje istu stvar
*/

import React, { useState } from "react";

const calculateLetterPercentages = (text) => {
  const counts = Array(26).fill(0);
  let totalLetters = 0;

  for (let char of text.toLowerCase()) {
    if (/[a-z]/.test(char)) {
      counts[char.charCodeAt(0) - 97]++;
      totalLetters++;
    }
  }

  return { counts, totalLetters };
};

const JSV9 = () => {
  const [input, setInput] = useState("");
  const { counts, totalLetters } = calculateLetterPercentages(input);

  return (
    <div>
      <input
        type="text"
        value={input}
        onChange={(e) => setInput(e.target.value)}
        placeholder="Type something..."
      />
      <div>
        <h3>Letter Usage Percentages</h3>
        <ul>
          {counts.map((count, index) => (
            <li key={index} style={{ color: count > 0 ? "green" : "red" }}>
              {String.fromCharCode(65 + index)}:{" "}
              {count > 0 ? ((count / totalLetters) * 100).toFixed(2) : 0}%
            </li>
          ))}
        </ul>
      </div>
    </div>
  );
};

export default JSV9;
