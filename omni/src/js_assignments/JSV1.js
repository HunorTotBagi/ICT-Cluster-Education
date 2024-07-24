/* 
    Zadatak 1
    Napiši funkciju koja prima ulazni niz proizvoljne dužine i sortira ga. 
*/

const zad1 = () => {
  let n = [3, 1, 4, 1, 5, 9, 2, 6];

  // Zadatak 1. Proći kroz niz elemenata i ispisati sve parne elementa.
  for (let i = 0; i < n.length; i++) {
    if (n[i] % 2 === 0) {
      console.log(n[i]);
    }
  }

  // Zadatak 1.1. Dodati pronađene parne elemente u novi niz elemenata i ispisati taj novi niz
  let evenElements = [];
  for (let i = 0; i < n.length; i++) {
    if (n[i] % 2 === 0) {
      evenElements.push(n[i]);
    }
  }

  return (
    <table border={1}>
      <tr>
        <th>Array</th>
        <th>Elements</th>
      </tr>
      <tr>
        <td>
          <pre>evenElements</pre>
        </td>
        <td>{JSON.stringify(evenElements)}</td>
      </tr>
    </table>
  );

  // Zadatak 1.2. Dodati pronađene parne elemente u novi niz elemenata ali u suprotnom redosledu
};

const zad3 = () => {
  /*Napraviti mini program za logovanje korisnika. Korisnika predstaviti kao objekat koji
ima atribute: ime, prezime, korisničko ime i šifru. Sve korisnike smestiti u mapu gde
je ključ korisničko ime, a vrednost objekat koji predstavlja korisnika. Zatim napraviti
dve promenljive koje predstavljaju korisničko ime i lozinku i dodeliti im neku vrednost.
Na osnovu korisničkog imena i lozinke pokušati da ulogujete korisnika, ako je
logovanje uspešno ispisati podatke o korisniku, a ako nije napisati poruku ‚‚Pogrešno
korisničko ime ili šifra‚‚.*/
};

const zad4 = () => {
  /*
    Od niza elemenata napraviti dva niza. Jedan niz treba da budu elementi koji se
    nalaze na parnim indeksima a njihova vrednost je neparan broj, a drugi elementi koji
    se nalaze na neparnim indeksima a njihova vrednost je paran broj.
  */
  let array = [3, 1, 4, 1, 5, 9, 2, 6];
  let a = [];
  let b = [];

  for (let i = 0; i < array.length; i++) {
    if (i % 2 === 0 && array[i] % 2 !== 0) {
      a.push(array[i]);
    } else if (i % 2 !== 0 && array[i] % 2 === 0) {
      b.push(array[i]);
    }
  }

  return (
    <table border={1}>
      <thead>
        <tr>
          <th>Array</th>
          <th>Elements</th>
        </tr>
      </thead>
      <tbody>
        <tr>
          <td>
            <pre>array</pre>
          </td>
          <td>{JSON.stringify(array)}</td>
        </tr>
        <tr>
          <td>
            <pre>a</pre>
          </td>
          <td>{JSON.stringify(a)}</td>
        </tr>
        <tr>
          <td>
            <pre>b</pre>
          </td>
          <td>{JSON.stringify(b)}</td>
        </tr>
      </tbody>
    </table>
  );
};

const zad5 = () => {
  /*
    Iz sledećeg teksta pomoću regularnog izraza izdvojiti sve e-mail adrese.
    Tekst: Petar Petrović ima naloge na nekoliko servisa koji omogućavaju razmenu
    poruka. Njegove adrese su pera.petrovic@gmail.com, petar@uns.ac.rs i
    petrovic@yahoo.com. Mina Mirković takođe ima nekoliko e-mail adresa. Za
    komunikaciju sa Petrom koristi adresu mina90.m@hotmail.com.
  */
};

const zad6 = () => {
  /*
    Napraviti program koji na osnovu podataka o pravougaoniku računa: dijagonalu,
    stranice pravougaonika, površinu i obim. Pravougaonik je predstavljen kao objekat
    koji za atribute ima koordinate temena. Koristiti destrukturiranje podataka.
    Primer:
    let pravougaonik = {
    A { x: 10, y: 30},
    B { x: 30, y: 30},
    C { x: 30, y: 45},
    D { x: 10, y: 45}
    }
  */
};

const zad7 = () => {
  // Za dati niz elemenata izračunati: zbir, srednju vrednost i proizvod.

  let array = [3, 1, 4, 1, 5, 9, 2, 6];
  let arraySum = 0;
  let arrayAverageValue = 0;
  let arrayProduct = 1;

  for (let i = 0; i < array.length; i++) {
    arraySum += array[i];
    arrayProduct *= array[i];
  }

  arrayAverageValue = arraySum / array.length;

  return (
    <table border={1}>
      <tr>
        <th>Array</th>
        <th>Elements</th>
      </tr>

      <tr>
        <td>
          <pre>arraySum</pre>
        </td>
        <td>{JSON.stringify(arraySum)}</td>
      </tr>

      <tr>
        <td>
          <pre>arrayAverageValue</pre>
        </td>
        <td>{JSON.stringify(arrayAverageValue)}</td>
      </tr>

      <tr>
        <td>
          <pre>arrayProduct</pre>
        </td>
        <td>{JSON.stringify(arrayProduct)}</td>
      </tr>
    </table>
  );
};

const zad8 = () => {
  /*
    Za dati niz elemenata pronaći element u nizu koji se najčešće pojavljuje.
    Primer niza: arr1=[3, 'a', 'a', 'a', 2, 3, 'a', 3, 'a', 2, 4, 9, 3]
  */

  let array = [3, "a", "a", "a", 2, 3, "a", 3, "a", 2, 4, 9, 3];

  let dictionary = {};
  let maxCount = 0;
  let mostFrequentElement;

  for (let i = 0; i < array.length; i++) {
    let element = array[i];
    if (dictionary[element] === undefined) {
      dictionary[element] = 1;
    } else {
      dictionary[element]++;
    }

    if (dictionary[element] > maxCount) {
      maxCount = dictionary[element];
      mostFrequentElement = element;
    }
  }

  return (
    <div>
      <table border={1}>
        <tr>
          <th>Most frequent element</th>
          <th>Max count</th>
        </tr>
        <tr>
          <td>
            <pre>{JSON.stringify(mostFrequentElement)}</pre>
          </td>
          <td>{JSON.stringify(maxCount)}</td>
        </tr>
      </table>

      <h2>Histogram</h2>
      <div style={{ display: "flex", alignItems: "flex-end" }}>
        {Object.keys(dictionary).map((key) => (
          <div key={key} style={{ margin: "0 10px", textAlign: "center" }}>
            <div
              style={{
                height: `${dictionary[key] * 20}px`,
                width: "20px",
                backgroundColor: "blue",
              }}
            ></div>
            <div>{key}</div>
            <div>{dictionary[key]}</div>
          </div>
        ))}
      </div>
    </div>
  );
};

const zad9 = () => {
  /*
    Proći kroz dati niz elemenata i ispisati imena i prezime studenata.
    let studenti = [
    {indeks: "XY 409/2072", ime: "Alice", prezime: "Alferson"},
    {indeks: "ZW 133/2072", ime: "Bob", prezime: "Bobbert"},
    {indeks: "XY 112/2073", ime: "Carol", prezime: "Creed"},
    {indeks: "XY 507/2071", ime: "Drew", prezime: "Danger"},
    {indeks: "ZW 233/2070", ime: "Eve", prezime: "Emmerson"},
    {indeks: "ZW 57/2072", ime: "Trent", prezime: "Tweed"},
    {indeks: "XY 111/2071", ime: "Fred", prezime: "Franks"},
    {indeks: "ZW 404/2073", ime: "George", prezime: "Green"}
    ];
  */
};

const zad10 = () => {
  /*
    Ispisati sve stringove koji se pojavljuju u sledećem nizu elemenata: [1, 34, ‘1’, ‘abc’, 347, ‘false’, ‘s’, 123]
  */

  let array = [1, 34, "1", "abc", 347, "false", "s", 123];

  // let strings = [];
  // for (let i = 0; i < array.length; i++) {
  //   if (typeof array[i] === "string") {
  //     strings.push(array[i]);
  //   }
  // }

  let strings = array.filter((element) => typeof element === "string");

  return (
    <table border={1}>
      <tr>
        <th>Every element of the array</th>
        <th>Only strings</th>
      </tr>
      <tr>
        <td>
          <pre>{JSON.stringify(array)}</pre>
        </td>
        <td>{JSON.stringify(strings)}</td>
      </tr>
    </table>
  );
};

const JSV1 = () => {
  return (
    <div>
      <h3>Zadatak 1</h3> {zad1()} <br />
      <h3>Zadatak 4</h3> {zad4()} <br />
      <h3>Zadatak 7</h3> {zad7()} <br />
      <h3>Zadatak 8</h3> {zad8()} <br />
      <h3>Zadatak 10</h3> {zad10()} <br />
    </div>
  );
};

export default JSV1;
