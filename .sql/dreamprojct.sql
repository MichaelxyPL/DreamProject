-- phpMyAdmin SQL Dump
-- version 5.0.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Czas generowania: 26 Kwi 2022, 22:46
-- Wersja serwera: 10.4.17-MariaDB
-- Wersja PHP: 8.0.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Baza danych: `dreamprojct`
--

-- --------------------------------------------------------

--
-- Struktura tabeli dla tabeli `tborderitems`
--

CREATE TABLE `tborderitems` (
  `id` int(6) UNSIGNED NOT NULL,
  `orderid` int(6) NOT NULL,
  `itemid` int(6) NOT NULL,
  `cnt` int(6) DEFAULT NULL,
  `price` float DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Zrzut danych tabeli `tborderitems`
--

INSERT INTO `tborderitems` (`id`, `orderid`, `itemid`, `cnt`, `price`) VALUES
(1, 1, 1, 2, 198);

-- --------------------------------------------------------

--
-- Struktura tabeli dla tabeli `tborders`
--

CREATE TABLE `tborders` (
  `id` int(6) NOT NULL,
  `userid` int(11) NOT NULL,
  `orderdt` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Zrzut danych tabeli `tborders`
--

INSERT INTO `tborders` (`id`, `userid`, `orderdt`) VALUES
(1, 1, 0);

-- --------------------------------------------------------

--
-- Struktura tabeli dla tabeli `tbproducts`
--

CREATE TABLE `tbproducts` (
  `id` int(6) UNSIGNED NOT NULL,
  `name` varchar(30) NOT NULL,
  `type` varchar(30) NOT NULL,
  `price` float DEFAULT NULL,
  `cnt` int(6) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Zrzut danych tabeli `tbproducts`
--

INSERT INTO `tbproducts` (`id`, `name`, `type`, `price`, `cnt`) VALUES
(1, 'Jak być nikim - techniki zaawa', 'book', 99, 100),
(2, 'Jak byc nikim - techniki zaawa', 'book', 99, 100);

-- --------------------------------------------------------

--
-- Struktura tabeli dla tabeli `tbuserroles`
--

CREATE TABLE `tbuserroles` (
  `id` int(6) UNSIGNED NOT NULL,
  `userid` int(6) NOT NULL,
  `roleid` int(6) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Zrzut danych tabeli `tbuserroles`
--

INSERT INTO `tbuserroles` (`id`, `userid`, `roleid`) VALUES
(1, 1, 1);

-- --------------------------------------------------------

--
-- Struktura tabeli dla tabeli `tbusers`
--

CREATE TABLE `tbusers` (
  `id` int(10) UNSIGNED NOT NULL,
  `firstname` varchar(30) NOT NULL,
  `lastname` varchar(30) NOT NULL,
  `email` varchar(50) DEFAULT NULL,
  `reg_date` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp(),
  `salt` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Zrzut danych tabeli `tbusers`
--

INSERT INTO `tbusers` (`id`, `firstname`, `lastname`, `email`, `reg_date`, `salt`, `password`) VALUES
(1, 'ktos', 'ktosiowy', 'aa@aa.aa', '2022-04-25 21:06:34', 'aaaa', 'MD5(\'aaaaaaa\')');

--
-- Indeksy dla zrzutów tabel
--

--
-- Indeksy dla tabeli `tborderitems`
--
ALTER TABLE `tborderitems`
  ADD PRIMARY KEY (`id`);

--
-- Indeksy dla tabeli `tborders`
--
ALTER TABLE `tborders`
  ADD PRIMARY KEY (`id`);

--
-- Indeksy dla tabeli `tbproducts`
--
ALTER TABLE `tbproducts`
  ADD PRIMARY KEY (`id`);

--
-- Indeksy dla tabeli `tbuserroles`
--
ALTER TABLE `tbuserroles`
  ADD PRIMARY KEY (`id`);

--
-- Indeksy dla tabeli `tbusers`
--
ALTER TABLE `tbusers`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT dla zrzuconych tabel
--

--
-- AUTO_INCREMENT dla tabeli `tborderitems`
--
ALTER TABLE `tborderitems`
  MODIFY `id` int(6) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT dla tabeli `tborders`
--
ALTER TABLE `tborders`
  MODIFY `id` int(6) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT dla tabeli `tbproducts`
--
ALTER TABLE `tbproducts`
  MODIFY `id` int(6) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT dla tabeli `tbuserroles`
--
ALTER TABLE `tbuserroles`
  MODIFY `id` int(6) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT dla tabeli `tbusers`
--
ALTER TABLE `tbusers`
  MODIFY `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
