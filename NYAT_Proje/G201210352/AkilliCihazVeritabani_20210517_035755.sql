--
-- PostgreSQL database dump
--

-- Dumped from database version 13.1
-- Dumped by pg_dump version 13.1

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

SET default_tablespace = '';

SET default_table_access_method = heap;

--
-- Name: KullaniciBilgileri; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public."KullaniciBilgileri" (
    "KullaniciAdi" character varying(50) NOT NULL,
    "KullaniciSifresi" character varying NOT NULL,
    id character varying NOT NULL
);


ALTER TABLE public."KullaniciBilgileri" OWNER TO postgres;

--
-- Data for Name: KullaniciBilgileri; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public."KullaniciBilgileri" VALUES ('admin', 'pass', '1');
INSERT INTO public."KullaniciBilgileri" VALUES ('iso', '123', '2');


--
-- Name: KullaniciBilgileri id_kullanici; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public."KullaniciBilgileri"
    ADD CONSTRAINT id_kullanici PRIMARY KEY (id);


--
-- Name: KullaniciBilgileri unique_KullaniciBilgileri_id; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public."KullaniciBilgileri"
    ADD CONSTRAINT "unique_KullaniciBilgileri_id" UNIQUE (id);


--
-- PostgreSQL database dump complete
--

