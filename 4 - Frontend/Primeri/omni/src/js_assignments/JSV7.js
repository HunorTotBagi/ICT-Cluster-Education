/* 
    Zadatak 7
    a) Napisati funkciju koja za dati dan (1-31), mesec (1-12), i godinu (četiri cifre) koji predstavljaju datum rođenja, vrati koliko je osoba rođena na taj dan bila živa, u sekundama. Program ne treba da radi za datume pre 1970. 
    b) Napraviti React kontrolu koja omogucava da se unese datum i dobije vreme u sekundama kad se pritisne dugme.
    c) Prosiriti kontrl tako da se izracunato vreme osvezava u realnom vremenu.
*/

import React, { useState, useEffect } from "react";

const calculateSecondsAlive = (year, month, day) => {
  if (year < 1970) return "Year must be 1970 or later.";
  if (month < 1 || month > 12) return "Month must be between 1 and 12.";
  if (day < 1 || day > 31) return "Day must be between 1 and 31.";

  const birthDate = new Date(year, month - 1, day);
  const now = new Date();

  if (birthDate > now) return "Birthdate cannot be in the future.";

  const diffInMilliseconds = now - birthDate;
  return Math.floor(diffInMilliseconds / 1000);
};

const JSV7 = () => {
  const [year, setYear] = useState("");
  const [month, setMonth] = useState("");
  const [day, setDay] = useState("");
  const [secondsAlive, setSecondsAlive] = useState(null);
  const [errorMessage, setErrorMessage] = useState("");

  useEffect(() => {
    if (year && month && day) {
      const result = calculateSecondsAlive(year, month, day);
      if (typeof result === "string") {
        setErrorMessage(result);
        setSecondsAlive(null);
      } else {
        setSecondsAlive(result);
        setErrorMessage("");
      }
    }
  }, [year, month, day]);

  return (
    <div>
      <div>
        <label>Year: </label>
        <input
          type="number"
          value={year}
          onChange={(e) => setYear(e.target.value)}
        />
      </div>
      <div>
        <label>Month: </label>
        <input
          type="number"
          value={month}
          onChange={(e) => setMonth(e.target.value)}
        />
      </div>
      <div>
        <label>Day: </label>
        <input
          type="number"
          value={day}
          onChange={(e) => setDay(e.target.value)}
        />
      </div>
      {errorMessage && <p style={{ color: "red" }}>{errorMessage}</p>}
      {secondsAlive !== null && (
        <div>
          <h3>
            You have been alive for {secondsAlive.toLocaleString()} seconds.
          </h3>
        </div>
      )}
    </div>
  );
};

export default JSV7;
