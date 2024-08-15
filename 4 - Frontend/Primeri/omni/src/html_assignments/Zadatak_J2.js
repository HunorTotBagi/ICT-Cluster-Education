/*
Zadatak 2: Na stranici ispisati sledecu pesmu. 

Опрости, мајко света, опрости,
што наших гора пожалих бор,
на ком се, устук свакоје злости,
блаженој теби подиже двор;
презри, небеснице, врело милости,
што ти земаљски сагреши створ:
Кајан ти љубим пречисте скуте,
Santa Maria della Salute.

Зар није лепше носит лепоту,
сводова твојих постати стуб,
него грејући светску грехоту
у пепо спалит срце и луб;
тонут о броду, трнут у плоту,
ђаволу јелу а врагу дуб?
Зар није лепше вековат у те,
Santa Maria della Salute?

Iznad stihova pesme treba da pise:
    - Santa Maria della Salute
    - Laza Kostic, treba da bude link, klikom na link otvori se stranica o pesniku
Ispod pesme staviti sliku crkve Santa Maria della Salute


CSS DEO ZADATKA (ovo radite tek kada budemo uradili CSS)
Zahtevi:
    - DONE: tekst pesme i slika treba da se prikazu jedno pored drugog, sa leve strane tekst pesme, a sa desne slika
    - DONE: tekst pesme centrirati i uokviriti okvirom debljine 2px koji je obojen po zelji
    - DONE: recenicu 'Santa Maria della Salute?' obojiti bojom po izboru i slova podebljati 
    - DONE: ime pesnika i naziv pesme takodje centrirati i podebljati
    - DONE: ime pesnika prikazati zelenom bojom
*/

import "./zadatak2.css";
const Zadatak_J2 = () => {
  return (
    <div>
      <div className="center">
        <h1 className="header_color">Santa Maria della Salute</h1>
      </div>

      <div className="center">
        <a
          className="author_color"
          href="https://sh.wikipedia.org/wiki/Laza_Kosti%C4%87"
        >
          Laza Kostic
        </a>
      </div>

      <div className="two_container">
        <div className="style_text center">
          <p>
            Опрости, мајко света, опрости, <br />
            што наших гора пожалих бор,
            <br />
            на ком се, устук свакоје злости,
            <br />
            блаженој теби подиже двор;
            <br />
            презри, небеснице, врело милости,
            <br />
            што ти земаљски сагреши створ:
            <br />
            Кајан ти љубим пречисте скуте,
            <br />
            Santa Maria della Salute.
            <br />
          </p>

          <p>
            Зар није лепше носит лепоту,
            <br />
            сводова твојих постати стуб,
            <br />
            него грејући светску грехоту
            <br />
            у пепо спалит срце и луб;
            <br />
            тонут о броду, трнут у плоту,
            <br />
            ђаволу јелу а врагу дуб?
            <br />
            Зар није лепше вековат у те,
            <br />
            Santa Maria della Salute?
            <br />
          </p>
        </div>

        <div className="center">
          <img
            src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRLOlcId83lAP0SxoiWG98xPxhLPdR8EWVD2Q&s"
            alt="santa maria della salute church"
          ></img>
        </div>
      </div>
    </div>
  );
};
export default Zadatak_J2;
