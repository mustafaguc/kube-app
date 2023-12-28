package com.easy.kubeapp.post;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class TextPopulator {
    private final Random random = new Random();

    String titles = """
            Nullam congue purus ac eleifend egestas.
            Maecenas imperdiet leo vel molestie facilisis.
            Sed gravida neque vel condimentum egestas.
            Vivamus nec lorem accumsan, porta libero vel, tristique mauris.
            Cras id mi porttitor, rhoncus ante a, ultrices sem.
            Vestibulum ultricies felis in lectus porta, in imperdiet eros finibus.
            Quisque convallis nisl sed diam rutrum faucibus.
            Etiam ultricies eros et ipsum pharetra vestibulum.
            Morbi vulputate augue sed malesuada fringilla.
            Sed venenatis felis sed libero sollicitudin maximus.
            Praesent venenatis leo eu tincidunt porta.
            Duis ultricies elit non semper pharetra.
            Etiam laoreet sapien ut augue porta fermentum.
            Nulla vel orci tincidunt, malesuada nisi quis, pharetra lacus.
            Duis eget velit bibendum, dictum sapien non, tristique elit.
            Vestibulum nec lectus nec tortor sodales bibendum vel sed massa.
            Phasellus tempor leo condimentum laoreet lacinia.
            In id nisi quis metus euismod pulvinar vel vel mauris.
            Curabitur consequat nisi eu massa pellentesque, ac tristique arcu feugiat.
            Duis semper felis id convallis varius.
            Donec interdum libero ac lacinia iaculis.
            Morbi nec enim sagittis, dignissim elit nec, porttitor magna.
            Morbi placerat nisi sit amet metus scelerisque, sit amet fringilla sem sagittis.
            Phasellus a ante tincidunt, varius urna at, porttitor lacus.
            Donec elementum enim nec lacinia posuere.
            Fusce ut velit posuere ipsum convallis dignissim egestas eu tellus.
            Cras vestibulum ipsum eu eros pharetra, id volutpat risus cursus.
            Curabitur ultrices lorem a nisl euismod pulvinar.
            """;
    private final String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit.\n" +
            "Phasellus vitae purus ut felis feugiat aliquet.\n" +
            "Vivamus vehicula ante et lobortis facilisis.\n" +
            "Quisque a dui a tortor fermentum eleifend vitae in justo.\n" +
            "Duis hendrerit lectus non magna tincidunt, nec luctus ante tristique.\n" +
            "Pellentesque a augue vel ante elementum iaculis molestie quis purus.\n" +
            "Fusce maximus urna vitae volutpat varius.\n" +
            "Donec maximus turpis a luctus varius.\n" +
            "Etiam suscipit nisl sed purus tempor laoreet.\n" +
            "Sed in odio ac est mattis suscipit.\n" +
            "Aenean laoreet elit vel est congue lobortis quis eget libero.\n" +
            "In non nisl ut dui fringilla faucibus dapibus at arcu.\n" +
            "Curabitur fringilla dui tincidunt, laoreet orci lacinia, posuere sapien.\n" +
            "Phasellus semper sem vel mauris elementum dapibus.\n" +
            "Integer bibendum lacus nec justo consectetur ornare.\n" +
            "Duis mollis libero id nibh cursus, id tempus nulla ultricies.\n" +
            "Aliquam lacinia eros et massa porta porta.\n" +
            "Vestibulum sed ipsum auctor, dapibus felis id, dapibus tellus.\n" +
            "Vivamus sit amet nulla quis quam suscipit pretium.\n" +
            "Sed fermentum tellus ut purus convallis scelerisque.\n" +
            "Cras volutpat ex sit amet lectus feugiat, quis ullamcorper risus placerat.";

    private final List<String> titleList = Arrays.asList(titles.split("\n"));
    private final List<String> lines = Arrays.asList(text.split("\n"));


    public String randomContent() {
        return randomText(lines);
    }

    public String randomTitle() {
        return randomText(titleList);
    }

    private String randomText(List<String> list) {
        return list.get(random.nextInt(list.size() - 1));
    }

}
