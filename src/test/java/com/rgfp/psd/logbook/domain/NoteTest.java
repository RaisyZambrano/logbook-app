package com.rgfp.psd.logbook.domain;

import com.rgfp.psd.logbook.service.NoteRepository;
import com.rgfp.psd.logbook.service.NoteService;
import org.hibernate.query.criteria.internal.expression.function.SubstringFunction;
import org.junit.Test;
import org.mockito.Mock;
import org.springframework.data.repository.Repository;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class NoteTest {
    private Note notaNueva;
    private ArrayList<Note> notas;
    private String contenido ="es simplemente el texto de relleno de las imprentas y archivos de texto. Lorem Ipsum ha sido el texto de relleno estándar de las industrias desde el año 1500, cuando un impresor (N. del T. persona que se dedica a la imprenta) desconocido usó una galería de textos y los mezcló de tal manera que logró hacer un libro de textos especimen. No sólo sobrevivió 500 años, sino que tambien ingresó como texto de relleno en documentos electrónicos, quedando esencialmente igual al original. Fue popularizado en los 60s con la creación de las hojas \"Letraset\", las cuales contenian pasajes de Lorem Ipsum, y más recientemente con software de autoedición, como por ejemplo Aldus PageMaker, el cual incluye versiones de Lorem Ipsum.";

    @Test
    public void sumaryReturnText240() {
        //Declaro
        notas = new ArrayList<>();
        Note nota1 = new Note();
        nota1.setTitle("Titulo 1");
        nota1.setContent(contenido);
        //Ejecuto
        String sumary = nota1.getSumary();
        //Valido
        assertEquals(240, sumary.length());
    }
}