/* 
    Zadatak 4
    Napisati funkciju koja za dva stringa odredi da li su anagrami ili ne. Razmaci nisu bitni, velika i mala slova nisu bitna, interpunkcija nije podržana.
*/

function bubbleSort(arr) {
  let n = arr.length;
  let swapped;
  do {
    swapped = false;
    for (let i = 1; i < n; i++) {
      if (arr[i - 1] > arr[i]) {
        let temp = arr[i - 1];
        arr[i - 1] = arr[i];
        arr[i] = temp;
        swapped = true;
      }
    }
    n--;
  } while (swapped);
  return arr;
}

const is_anagram = (a, b) => {
  a = a.replace(/\s+|[^a-zA-Z]/g, '').toLowerCase();
  b = b.replace(/\s+|[^a-zA-Z]/g, '').toLowerCase();
  
  if (a.length !== b.length)
    return false;

  let aSorted = bubbleSort(a.split("")).join("");
  let bSorted = bubbleSort(b.split("")).join("");

  return aSorted === bSorted;
};

const JSV4 = () => {
  let word_1 = "hello";
  let word_2 = "eholl";

  let word_3 = "asdfwseg";
  let word_4 = "hello";

  let word_5 = "I vaN";
  let word_6 = "Va;N;i;";

  let word_7 = "asdf";
  let word_8 = "asdg";

  return (
    <div>
      The word "{word_1}" and "{word_2}" is anagram?{" "} {is_anagram(word_1, word_2) ? "True" : "False"} <br />
      The word "{word_3}" and "{word_4}" is anagram?{" "} {is_anagram(word_3, word_4) ? "True" : "False"} <br />
      The word "{word_5}" and "{word_6}" is anagram?{" "} {is_anagram(word_5, word_6) ? "True" : "False"} <br />
      The word "{word_7}" and "{word_8}" is anagram?{" "} {is_anagram(word_7, word_8) ? "True" : "False"} <br />
    </div>
  );
};

export default JSV4;
