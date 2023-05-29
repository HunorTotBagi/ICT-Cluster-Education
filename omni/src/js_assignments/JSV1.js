/* 
    Zadatak 1
    Napiši funkciju koja prima ulazni niz proizvoljne dužine i sortira ga. 
*/

const zad1 = () => {

  // Zadatak 1. Proći kroz niz elemenata i ispisati sve parne elementa.
  // Zadatak 1.1. Dodati pronađene parne elemente u novi niz elemenata i ispisati taj novi niz
  // Zadatak 1.2. Dodati pronađene parne elemente u novi niz elemenata ali u suprotnom redosledu

  let A = [1, 5, 6, 7, 2, 90, 10, 25, 67, 8];

  //1. način: Klasičan prolazak kroz niz elemenata for petljom
  for (let i = 0; i < A.length; i++) {
    if (A[i] % 2 === 0) {
      console.log(A[i]);
    }
  }

  //2. način: Elegantniji način za prolazak kroz niz elemenata for-of
  for (let e of A) {
    if (e % 2 === 0) {
      console.log(e);
    }
  }

  //3. način: ForEach petlja za prolazak kroz niz elemenata 
  A.forEach(element => {
    if (element % 2 === 0){
      console.log(element);
    } 
  });

  //1.1. 
  let novi_niz1 = [];
  for (let e of A) {
    if (e % 2 === 0) {
      novi_niz1.push(e);
    }
  }
  console.log(JSON.stringify(novi_niz1));

  //1.2.
  let novi_niz2 = [];
  for (let e of A) {
    if (e % 2 === 0) {
      novi_niz2.unshift(e);
    }
  }
  console.log(JSON.stringify(novi_niz2));

  //alternativa je funkcija reverse()
  let primer1 = [1,2,3,4,5];
  primer1.reverse();
  console.log(JSON.stringify(primer1));

}

const zad2 = () => {

  // Zadatak 2. Proći kroz niz elemenata i ispisati sve elemente koji se nalaze na neparnim indeksima
  let A = [1, 5, 6, 7, 2, 90, 10, 25, 67, 8];

  //1. način: Običan prolazak for petljom 
  for (let i = 1; i < A.length; i += 2) {
    console.log(A[i]);
  }

  //2. način: ...
  for (let i = 0; i < A.length; i++) {
    if (i % 2 !== 0) {
      console.log(A[i]);
    }
  }

  //3. način: Primena filter metode
  let result = A.filter((elem, index) => index % 2 !== 0);
  console.log(result);


  //4. način: Prolazak forEach petljom
  A.forEach((elem, index) => {
    if (index % 2 !== 0) {
      console.log(elem);
    }
  });


}

const zad3 = () => {

/*Napraviti mini program za logovanje korisnika. Korisnika predstaviti kao objekat koji
ima atribute: ime, prezime, korisničko ime i šifru. Sve korisnike smestiti u mapu gde
je ključ korisničko ime, a vrednost objekat koji predstavlja korisnika. Zatim napraviti
dve promenljive koje predstavljaju korisničko ime i lozinku i dodeliti im neku vrednost.
Na osnovu korisničkog imena i lozinke pokušati da ulogujete korisnika, ako je
logovanje uspešno ispisati podatke o korisniku, a ako nije napisati poruku ‚‚Pogrešno
korisničko ime ili šifra‚‚.*/

  const k1 = {
    ime: "Petar",
    prezime: "Petrovic",
    username: "ppetar",
    password: "petar123"
  };

 const  k2 = {
    ime: "Nikola",
    prezime: "Nikolic",
    username: "nnikola",
    password: "nikola123"
  }

  const k3 = {
    ime: "Jovana",
    prezime: "Jovanovic",
    username: "jjovana",
    password: "jovana123"
  }
  
  let mapa = new Map();
  mapa.set(k1.username, k1);
  mapa.set(k2.username, k2);
  mapa.set(k3.username, k3);

  let mapa2 = new Map([
    [k1.username, k1],
    [k2.username, k2],
    [k3.username, k3]
  ])

  let username1 = "jjovana";
  let password1 = "jovana123";

  let username2 = "ppetar";
  let password2 = "petar";

  
  if(mapa.has(username1)){
    if (mapa.get(username1).password === password1){
      console.log(JSON.stringify(mapa.get(username1)));
    }else{
      console.log("Pogresno korisnicko ime ili sifra!");
    }
  }else{
    console.log("Pogresno korisnicko ime ili sifra!");
  }

  if(mapa.has(username2) && mapa.get(username2).password === password2){
    console.log(JSON.stringify(mapa.get(username1)));
  }else{
    console.log("Pogresno korisnicko ime ili sifra!");
  }

}

const zad4 = () => {
  /*
    Od niza elemenata napraviti dva niza. Jedan niz treba da budu elementi koji se
    nalaze na parnim indeksima a njihova vrednost je neparan broj, a drugi elementi koji
    se nalaze na neparnim indeksima a njihova vrednost je paran broj.
  */ 

    let niz = [1, 2, 3, 4, 5, 6, 7, 8, 9];

    let niz_parni_indeksi_neparni_brojevi = [];
    let niz_neparni_indeksi_parni_brojevi = [];

    for (let i = 0; i < niz.length; i++) {
      if (i % 2 === 0 && niz[i] % 2 === 1) {
        niz_parni_indeksi_neparni_brojevi.push(niz[i]);
      } else if (i % 2 === 1 && niz[i] % 2 === 0) {
        niz_neparni_indeksi_parni_brojevi.push(niz[i]);
      }
    }

    console.log("Niz sa elementima koji se nalaze na parnim indeksima a vrednost im je neparan broj:");
    console.log(niz_parni_indeksi_neparni_brojevi);

    console.log("Niz sa elementima koji se nalaze na neparnim indeksima a vrednost im je paran broj:");
    console.log(niz_neparni_indeksi_parni_brojevi);

}

const zad5 = () => {
  /*
    Iz sledećeg teksta pomoću regularnog izraza izdvojiti sve e-mail adrese.
    Tekst: Petar Petrović ima naloge na nekoliko servisa koji omogućavaju razmenu
    poruka. Njegove adrese su pera.petrovic@gmail.com, petar@uns.ac.rs i
    petrovic@yahoo.com. Mina Mirković takođe ima nekoliko e-mail adresa. Za
    komunikaciju sa Petrom koristi adresu mina90.m@hotmail.com.
  */

  let tekst = "Petar Petrović ima naloge na nekoliko servisa koji omogućavaju razmenu poruka. Njegove adrese su pera.petrovic@gmail.com, petar@uns.ac.rs i petrovic@yahoo.com. Mina Mirković takođe ima nekoliko e-mail adresa. Za komunikaciju sa Petrom koristi adresu mina90.m@hotmail.com.";

  let regex = /[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,}/g;

  let sve_email_adrese = tekst.match(regex);

  console.log(sve_email_adrese);

}

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

  let pravougaonik = {
    A: { x: 10, y: 30 },
    B: { x: 30, y: 30 },
    C: { x: 30, y: 45 },
    D: { x: 10, y: 45 }
  };
  
  // destrukturiranje podataka za dobijanje koordinata temena
  let { A, B, C, D } = pravougaonik;
  
  // računanje dužina stranica pravougaonika
  let duzinaAB = Math.sqrt(Math.pow(B.x - A.x, 2) + Math.pow(B.y - A.y, 2));
  let duzinaBC = Math.sqrt(Math.pow(C.x - B.x, 2) + Math.pow(C.y - B.y, 2));
  let duzinaCD = Math.sqrt(Math.pow(D.x - C.x, 2) + Math.pow(D.y - C.y, 2));
  let duzinaDA = Math.sqrt(Math.pow(A.x - D.x, 2) + Math.pow(A.y - D.y, 2));
  
  // računanje dijagonala pravougaonika
  let dijagonalaAC = Math.sqrt(Math.pow(C.x - A.x, 2) + Math.pow(C.y - A.y, 2));
  let dijagonalaBD = Math.sqrt(Math.pow(D.x - B.x, 2) + Math.pow(D.y - B.y, 2));
  
  // računanje površine i obima pravougaonika
  let povrsina = duzinaAB * duzinaDA;
  let obim = duzinaAB + duzinaBC + duzinaCD + duzinaDA;
  
  console.log(`Duzina stranice AB: ${duzinaAB}`);
  console.log(`Duzina stranice BC: ${duzinaBC}`);
  console.log(`Duzina stranice CD: ${duzinaCD}`);
  console.log(`Duzina stranice DA: ${duzinaDA}`);
  console.log(`Duzina dijagonale AC: ${dijagonalaAC}`);
  console.log(`Duzina dijagonale BD: ${dijagonalaBD}`);
  console.log(`Povrsina pravougaonika: ${povrsina}`);
  console.log(`Obim pravougaonika: ${obim}`);
  
}

const zad7 = () => {
  // Za dati niz elemenata izračunati: zbir, srednju vrednost i proizvod.

  let A = [1, 5, 6, 7, 2, 90, 10, 25, 67, 8];

  // izracunavanje zbira niza
  let zbir = A.reduce((akumulator, vrednost) =>  akumulator += vrednost);
  console.log("Zbir niza je: " + zbir);

  // izracunavanje srednje vrednosti niza
  let srednja_vrednost = zbir / A.length;
  console.log("Srednja vrednost niza je: " + srednja_vrednost);

  // izracunavanje proizvoda niza
  let proizvod = A.reduce((akumulator, vrednost) => akumulator *= vrednost);
  console.log("Proizvod niza je: " + proizvod);
  } 

const zad8 = () => {
  /*
    Za dati niz elemenata pronaći element u nizu koji se najčešće pojavljuje.
    Primer niza: arr1=[3, 'a', 'a', 'a', 2, 3, 'a', 3, 'a', 2, 4, 9, 3]
  */

  let niz = [3, 'a', 'a', 'a', 2, 3, 'a', 3, 'a', 2, 4, 9, 3];
  let brojac = {};
  for (let i = 0; i < niz.length; i++) {
    if (brojac[niz[i]]) {
      brojac[niz[i]]++;
    } else {
      brojac[niz[i]] = 1;
    }
  }
  console.log(brojac);
  let najcesci_element = niz[0];
  let najcesci_broj_pojavljivanja = 1;
  for (let element in brojac) {
    if (brojac[element] > najcesci_broj_pojavljivanja) {
      najcesci_element = element;
      najcesci_broj_pojavljivanja = brojac[element];
    }
  }
  console.log(najcesci_element);
}

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

  let studenti = [  
    { indeks: "XY 409/2072", ime: "Alice", prezime: "Alferson" },  
    { indeks: "ZW 133/2072", ime: "Bob", prezime: "Bobbert" },  
    { indeks: "XY 112/2073", ime: "Carol", prezime: "Creed" },  
    { indeks: "XY 507/2071", ime: "Drew", prezime: "Danger" },  
    { indeks: "ZW 233/2070", ime: "Eve", prezime: "Emmerson" },  
    { indeks: "ZW 57/2072", ime: "Trent", prezime: "Tweed" },  
    { indeks: "XY 111/2071", ime: "Fred", prezime: "Franks" },  
    { indeks: "ZW 404/2073", ime: "George", prezime: "Green" }];

  for (let i = 0; i < studenti.length; i++) {
    console.log(studenti[i].ime + " " + studenti[i].prezime);
  }

}


const zad10 = () => {
  /*
    Ispisati sve stringove koji se pojavljuju u sledećem nizu elemenata: [1, 34, ‘1’, ‘abc’, 347, ‘false’, ‘s’, 123]
  */

  let niz = [1, 34, '1', 'abc', 347, 'false', 's', 123];

  niz.filter(elem => typeof(elem) === 'string').forEach(str => console.log(str));

  //demonstracija toga da se niz ne izmeni zapravo 
  //console.log(JSON.stringify(niz));

}


const JSV1 = () => {
  return <div>{zad7()}</div>;
};

export default JSV1;
