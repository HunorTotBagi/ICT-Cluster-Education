/* 
    Zadatak 6
    a) Napisati funkciju koja računa koliko je dobar pangram neki string. Pangram je rečenica koja ima u sebi sva slova nekog jezika. Ovde nas samo zanima engleksi jezik radi jednostavnosti. Velika i mala slova ignorišemo, baš kao i apsolutno sve što nije slovo. Kvalitet pangrama definiše sledeće pravilo: ako nemamo sva slova, onda je kvalitet 0. Ako imamo sva slova, onda je kvalitet jednak broju slova u azbuci jezika (26 ovde) podeljenom sa brojem slova koji pangram u stvari ima. Savršen pangram (bez ponavljanja) onda ima rezultat 1. 
    b) Napraviti React kontrolu koja omogucava da se pangram otkuca u tekst polje i onda, na pritisak dugmeta racuna kvalitet i prikazuje ga pored kontrole.
    c) Prosirit kontrolu iz b) tako da ispod kontrole stoji lista svih slova koja jos nisu upotrebljena ta lista treba da se menja u toku kucanja. Ta lista treba da sadrzvi sva slova sa tim da su pristuna slova zelena a odsutna crvena.
*/
import { useState, useEffect } from "react";

const evaluate_pangram = (p) => {
  const cleanedStr = p.toLowerCase().replace(/[^a-z]/g, '');
  const uniqueLetters = new Set(cleanedStr);

  if (uniqueLetters.size < 26) {
    return 0;
  }

  return 26 / cleanedStr.length;
}

const PangramChecker = () => {
  const [inputText, setInputText] = useState("");
  const [result, setResult] = useState("");
  const [letterCounts, setLetterCounts] = useState({});

  useEffect(() => {
    if (inputText) {
      setResult(evaluate_pangram(inputText));

      const counts = {};
      for (let i = 0; i < 26; i++) {
        const char = String.fromCharCode(97 + i);
        counts[char] = (inputText.toLowerCase().match(new RegExp(char, "g")) || []).length;
      }
      setLetterCounts(counts);
    } else {
      setResult("");
      setLetterCounts({});
    }
  }, [inputText]);

  return (
    <div>
      <div style={{ display: "flex", alignItems: "center" }}>
        <input
          type="text"
          value={inputText}
          onChange={(e) => setInputText(e.target.value)}
          placeholder="Enter text"
          style={{ marginRight: "10px" }}
        />
        <div>{result}</div>
      </div>
      <div>
        {Object.keys(letterCounts).map((char) => (
          <div key={char} style={{ color: letterCounts[char] > 0 ? "green" : "red" }}>
            {char}: {letterCounts[char]}
          </div>
        ))}
      </div>
    </div>
  );
};

export default PangramChecker;
