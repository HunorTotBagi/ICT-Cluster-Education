/* 
    Zadatak 6
    a) Napisati funkciju koja računa koliko je dobar neki pangram. Pangram je rečenica koja sadrži sva slova nekog jezika. Ovde nas zanima samo engleski jezik radi jednostavnosti. Velika i mala slova ignorišemo, baš kao i apsolutno sve što nije slovo. Kvalitet pangrama definiše sledeće pravilo: ako nemamo sva slova, kvalitet je 0. Ako imamo sva slova, kvalitet je jednak broju slova u azbuci jezika (26 ovde) podeljenom sa brojem slova koji pangram zapravo ima. Savršen pangram (bez ponavljanja) ima rezultat 1.

    b) Napraviti React kontrolu koja omogućava da se pangram otkuca u tekstualno polje i zatim, na pritisak dugmeta, računa kvalitet i prikazuje ga pored kontrole.

    c) Proširiti kontrolu iz b) tako da ispod kontrole stoji lista svih slova koja još nisu upotrebljena. Ta lista treba da se menja tokom kucanja. Lista treba da sadrži sva slova, s tim da su prisutna slova zelena, a odsutna crvena.
*/
import { useState, useEffect } from "react";

const evaluate_pangram = (p) => {
  const cleanedStr = p.toLowerCase().replace(/[^a-z]/g, "");
  const uniqueLetters = new Set(cleanedStr);

  if (uniqueLetters.size < 26) {
    return 0;
  }

  return 26 / cleanedStr.length;
};

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
        counts[char] = (
          inputText.toLowerCase().match(new RegExp(char, "g")) || []
        ).length;
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
          <div
            key={char}
            style={{ color: letterCounts[char] > 0 ? "green" : "red" }}
          >
            {char}: {letterCounts[char]}
          </div>
        ))}
      </div>
    </div>
  );
};

export default PangramChecker;
