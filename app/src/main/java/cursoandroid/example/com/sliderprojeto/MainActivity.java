package cursoandroid.example.com.sliderprojeto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.heinrichreimersoftware.materialintro.app.IntroActivity;
import com.heinrichreimersoftware.materialintro.slide.FragmentSlide;
import com.heinrichreimersoftware.materialintro.slide.SimpleSlide;

public class MainActivity extends IntroActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main); com o Slider esse layout não será necessário


        //usando Fragment customizado
        addSlide(new FragmentSlide.Builder()
            .background(android.R.color.white)
            .fragment(R.layout.intro_1)
            .build()
        );


        addSlide(new FragmentSlide.Builder()
                .background(android.R.color.white)
                .fragment(R.layout.intro_2)
                .build()
        );



        /*
        setButtonBackVisible(false); //desativa botão de voltar
        setButtonNextVisible(false); //desativa botão de proximo

        addSlide(new SimpleSlide.Builder()
                .title("Titulo")
                .description("Descrição")
                .image(R.drawable.um)
                .background(android.R.color.holo_orange_light)
                .build()
        );

        addSlide(new SimpleSlide.Builder()
                .title("Titulo2")
                .description("Descrição2")
                .image(R.drawable.dois)
                .background(android.R.color.holo_orange_light)
                .build()
        );

        addSlide(new SimpleSlide.Builder()
                .title("Titulo3")
                .description("Descrição3")
                .image(R.drawable.tres)
                .background(android.R.color.holo_orange_light)
                .build()
        );
*/

    }
}