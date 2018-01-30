package com.example.raul.lolbuilds;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class BuildActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_champ);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Intent intent = getIntent();
        int champId = intent.getIntExtra("champId", 0);
        Champ champ = MainActivity.champs.get(champId);

        ImageView imageView1 = findViewById(R.id.build_image1);
        TextView textView1 = findViewById(R.id.build_porciento);
        TextView textView2 = findViewById(R.id.build_papel);
        TextView textView3 = findViewById(R.id.build_año);
        TextView textView4 = findViewById(R.id.textview4);
        ImageView imageView2 = findViewById(R.id.build_image2);
        ImageView imageView3 = findViewById(R.id.build_image3);
        ImageView imageView4 = findViewById(R.id.build_image4);
        ImageView imageView5 = findViewById(R.id.build_image5);
        ImageView imageView6 = findViewById(R.id.build_image6);
        ImageView imageView7 = findViewById(R.id.build_image7);
        ImageView imageView8 = findViewById(R.id.build_image8);
        ImageView imageView9 = findViewById(R.id.build_image9);
        ImageView imageView10 = findViewById(R.id.build_image10);
        ImageView imageView11 = findViewById(R.id.build_image11);
        ImageView imageView12 = findViewById(R.id.build_image12);
        ImageView imageView13 = findViewById(R.id.build_image13);
        ImageView imageView14 = findViewById(R.id.build_image14);
        ImageView imageView15 = findViewById(R.id.build_image15);
        ImageView imageView16 = findViewById(R.id.build_image16);
        ImageView imageView17 = findViewById(R.id.build_image17);
        ImageView imageView18 = findViewById(R.id.build_image18);
        ImageView imageView19 = findViewById(R.id.build_image19);
        ImageView imageView20 = findViewById(R.id.build_image20);
        ImageView imageView21 = findViewById(R.id.build_image21);
        ImageView imageView22 = findViewById(R.id.build_image22);
        ImageView imageView23 = findViewById(R.id.build_image23);
        ImageView imageView24 = findViewById(R.id.build_image24);
        ImageView imageView25 = findViewById(R.id.build_image25);
        ImageView imageView26 = findViewById(R.id.build_image26);
        ImageView imageView27 = findViewById(R.id.build_image27);
        ImageView imageView28 = findViewById(R.id.build_image28);
        ImageView imageView29 = findViewById(R.id.build_image29);
        ImageView imageView30 = findViewById(R.id.build_image30);
        ImageView imageView31 = findViewById(R.id.build_image31);
        ImageView imageView32 = findViewById(R.id.build_image32);
        ImageView imageView33 = findViewById(R.id.build_image33);
        ImageView imageView34 = findViewById(R.id.build_image34);
        ImageView imageView35 = findViewById(R.id.build_image35);
        ImageView imageView36 = findViewById(R.id.build_image36);
        ImageView imageView37 = findViewById(R.id.build_image37);
        ImageView imageView38 = findViewById(R.id.build_image38);
        ImageView imageView39 = findViewById(R.id.build_image39);
        ImageView imageView40 = findViewById(R.id.build_image40);
        ImageView imageView41 = findViewById(R.id.build_image41);
        ImageView imageView42 = findViewById(R.id.build_image42);

        if (champId == 0)
        {
            this.setTitle(R.string.title_aatrox);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);

            toolbar.setNavigationOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(getApplicationContext(),MainActivity.class));
                    BuildActivity.this.finish();
                }
            });

            imageView1.setImageResource(R.drawable.ic_aatrox);
            textView1.setText("50,87 %");
            textView2.setText("Top");
            textView3.setText("2013");
            imageView2.setImageResource(R.drawable.ic_rey_arruinado);
            imageView3.setImageResource(R.drawable.ic_tabi_ninja);
            imageView4.setImageResource(R.drawable.ic_cuchilla_negra);
            imageView5.setImageResource(R.drawable.ic_bailarin_espectral);
            imageView6.setImageResource(R.drawable.ic_randuin);
            imageView7.setImageResource(R.drawable.ic_rostro_espiritual);
            imageView8.setImageResource(R.drawable.ic_flash);
            imageView9.setImageResource(R.drawable.ic_teleport);
            imageView10.setImageResource(R.drawable.ic_espada_de_doran);
            imageView11.setImageResource(R.drawable.ic_pocion);
            imageView12.setImageResource(R.drawable.ic_aatrox_lvl);
            imageView13.setImageResource(R.drawable.ic_precision_round);
            imageView14.setImageResource(R.drawable.ic_domination);
            imageView15.setImageResource(R.drawable.ic_brujeria);
            imageView16.setImageResource(R.drawable.ic_valor);
            imageView17.setImageResource(R.drawable.ic_inspiracion);
            imageView18.setImageResource(R.drawable.ic_domination);
            imageView19.setImageResource(R.drawable.ic_brujeria);
            imageView20.setImageResource(R.drawable.ic_valor_round);
            imageView21.setImageResource(R.drawable.ic_inspiracion);
            imageView22.setImageResource(R.drawable.ic_ataque_intesificado_round);
            imageView23.setImageResource(R.drawable.ic_super_curacion);
            imageView24.setImageResource(R.drawable.ic_leyenda_presteza_round);
            imageView25.setImageResource(R.drawable.ic_golpe_de_gracia_round);
            imageView26.setImageResource(R.drawable.ic_compas_letal);
            imageView27.setImageResource(R.drawable.ic_triumfo_round);
            imageView28.setImageResource(R.drawable.ic_leyenda_tenacidad);
            imageView29.setImageResource(R.drawable.ic_derribado);
            imageView30.setImageResource(R.drawable.ic_pies_ligeros);
            imageView31.setImageResource(R.drawable.ic_claridad_mental);
            imageView32.setImageResource(R.drawable.ic_leyenda_linaje);
            imageView33.setImageResource(R.drawable.ic_ultimo_esfuerzo);
            imageView34.setImageResource(R.drawable.ic_inquebrantable);
            imageView35.setImageResource(R.drawable.ic_piel_de_hierro);
            imageView36.setImageResource(R.drawable.ic_sobrecrecimiento_round);
            imageView37.setImageResource(R.drawable.ic_demoler);
            imageView38.setImageResource(R.drawable.ic_concha_espejo);
            imageView39.setImageResource(R.drawable.ic_revitalizar);
            imageView40.setImageResource(R.drawable.ic_fuente_de_vida);
            imageView41.setImageResource(R.drawable.ic_condicionamiento_round);
            imageView42.setImageResource(R.drawable.ic_fuentes_renovadas);

        }
        if (champId == 1)
        {
            this.setTitle(R.string.title_ahri);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);

            toolbar.setNavigationOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(getApplicationContext(),MainActivity.class));
                    BuildActivity.this.finish();
                }
            });

            imageView1.setImageResource(R.drawable.ic_ahri);
            textView1.setText("52,22 %");
            textView2.setText("Mid");
            textView3.setText("2011");
            textView4.setText("x2");
            imageView2.setImageResource(R.drawable.ic_sable_pistola);
            imageView3.setImageResource(R.drawable.ic_botas_hechizero);
            imageView4.setImageResource(R.drawable.ic_morellonomicon);
            imageView5.setImageResource(R.drawable.ic_baston_del_vacio);
            imageView6.setImageResource(R.drawable.ic_eco_de_luden);
            imageView7.setImageResource(R.drawable.ic_rabadon);
            imageView8.setImageResource(R.drawable.ic_flash);
            imageView9.setImageResource(R.drawable.ic_ignite);
            imageView10.setImageResource(R.drawable.ic_anillo_de_doran);
            imageView11.setImageResource(R.drawable.ic_pocion);
            imageView12.setImageResource(R.drawable.ic_ahri_lvl);
            imageView13.setImageResource(R.drawable.ic_precision);
            imageView14.setImageResource(R.drawable.ic_domination_round);
            imageView15.setImageResource(R.drawable.ic_brujeria);
            imageView16.setImageResource(R.drawable.ic_valor);
            imageView17.setImageResource(R.drawable.ic_inspiracion);
            imageView18.setImageResource(R.drawable.ic_precision);
            imageView19.setImageResource(R.drawable.ic_brujeria_round);
            imageView20.setImageResource(R.drawable.ic_valor);
            imageView21.setImageResource(R.drawable.ic_inspiracion);
            imageView22.setImageResource(R.drawable.ic_electrocutar_round);
            imageView23.setImageResource(R.drawable.ic_golpe_bajo);
            imageView24.setImageResource(R.drawable.ic_guardian_zombi_round);
            imageView25.setImageResource(R.drawable.ic_cazador_voraz);
            imageView26.setImageResource(R.drawable.ic_depredador);
            imageView27.setImageResource(R.drawable.ic_sabor_a_sangre);
            imageView28.setImageResource(R.drawable.ic_poro_fantasmal);
            imageView29.setImageResource(R.drawable.ic_cazador_ingenioso);
            imageView30.setImageResource(R.drawable.ic_cosecha_oscura);
            imageView31.setImageResource(R.drawable.ic_impacto_repentino_round);
            imageView32.setImageResource(R.drawable.ic_coleccion_de_globos_oculares);
            imageView33.setImageResource(R.drawable.ic_cazador_incesante_round);
            imageView34.setImageResource(R.drawable.ic_orbe_anulador);
            imageView35.setImageResource(R.drawable.ic_trascendencia_round);
            imageView36.setImageResource(R.drawable.ic_pirolaser);
            imageView37.setImageResource(R.drawable.ic_banda_de_mana);
            imageView38.setImageResource(R.drawable.ic_celeridad);
            imageView39.setImageResource(R.drawable.ic_caminar_sobre_agua);
            imageView40.setImageResource(R.drawable.ic_sombrero_definitivo_round);
            imageView41.setImageResource(R.drawable.ic_concentracion_absoluta);
            imageView42.setImageResource(R.drawable.ic_se_avecina_tormenta);

        }
        if (champId == 2)
        {
            this.setTitle(R.string.title_akali);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);

            toolbar.setNavigationOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(getApplicationContext(),MainActivity.class));
                    BuildActivity.this.finish();
                }
            });

            imageView1.setImageResource(R.drawable.ic_akali);
            textView1.setText("49,94 %");
            textView2.setText("Mid");
            textView3.setText("2010");
            imageView2.setImageResource(R.drawable.ic_tabi_ninja);
            imageView3.setImageResource(R.drawable.ic_tabi_ninja);
            imageView4.setImageResource(R.drawable.ic_tabi_ninja);
            imageView5.setImageResource(R.drawable.ic_tabi_ninja);
            imageView6.setImageResource(R.drawable.ic_tabi_ninja);
            imageView7.setImageResource(R.drawable.ic_tabi_ninja);
            imageView8.setImageResource(R.drawable.ic_tabi_ninja);
            imageView9.setImageResource(R.drawable.ic_tabi_ninja);
            imageView10.setImageResource(R.drawable.ic_tabi_ninja);
            imageView11.setImageResource(R.drawable.ic_tabi_ninja);
            imageView12.setImageResource(R.drawable.ic_aatrox_lvl);
            imageView13.setImageResource(R.drawable.ic_precision);
            imageView14.setImageResource(R.drawable.ic_domination_round);
            imageView15.setImageResource(R.drawable.ic_brujeria);
            imageView16.setImageResource(R.drawable.ic_valor);
            imageView17.setImageResource(R.drawable.ic_inspiracion);
            imageView18.setImageResource(R.drawable.ic_precision);
            imageView19.setImageResource(R.drawable.ic_brujeria);
            imageView20.setImageResource(R.drawable.ic_valor);
            imageView21.setImageResource(R.drawable.ic_inspiracion_round);
            imageView22.setImageResource(R.drawable.ic_electrocutar_round);
            imageView23.setImageResource(R.drawable.ic_golpe_bajo);
            imageView24.setImageResource(R.drawable.ic_guardian_zombi_round);
            imageView25.setImageResource(R.drawable.ic_cazador_voraz_round);
            imageView26.setImageResource(R.drawable.ic_depredador);
            imageView27.setImageResource(R.drawable.ic_sabor_a_sangre);
            imageView28.setImageResource(R.drawable.ic_poro_fantasmal);
            imageView29.setImageResource(R.drawable.ic_cazador_ingenioso);
            imageView30.setImageResource(R.drawable.ic_cosecha_oscura);
            imageView31.setImageResource(R.drawable.ic_impacto_repentino_round);
            imageView32.setImageResource(R.drawable.ic_coleccion_de_globos_oculares);
            imageView33.setImageResource(R.drawable.ic_cazador_incesante);
            imageView34.setImageResource(R.drawable.ic_destello_hextech);
            imageView35.setImageResource(R.drawable.ic_botas_gratis_round);
            imageView36.setImageResource(R.drawable.ic_perspicacia_cosmica);
            imageView37.setImageResource(R.drawable.ic_entrega_de_galletas);
            imageView38.setImageResource(R.drawable.ic_mercado_del_futuro);
            imageView39.setImageResource(R.drawable.ic_velocidad_de_acercamiento);
            imageView40.setImageResource(R.drawable.ic_cronometro_round);
            imageView41.setImageResource(R.drawable.ic_desmaterializador);
            imageView42.setImageResource(R.drawable.ic_cuerpo_celeste);

        }
        if (champId == 3)
        {
            this.setTitle(R.string.title_alistar);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);

            toolbar.setNavigationOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(getApplicationContext(),MainActivity.class));
                    BuildActivity.this.finish();
                }
            });

            imageView1.setImageResource(R.drawable.ic_alistar);
            textView1.setText("51,16 %");
            textView2.setText("Top");
            textView3.setText("2009");
            imageView2.setImageResource(R.drawable.ic_tabi_ninja);
            imageView3.setImageResource(R.drawable.ic_tabi_ninja);
            imageView4.setImageResource(R.drawable.ic_tabi_ninja);
            imageView5.setImageResource(R.drawable.ic_tabi_ninja);
            imageView6.setImageResource(R.drawable.ic_tabi_ninja);
            imageView7.setImageResource(R.drawable.ic_tabi_ninja);
            imageView8.setImageResource(R.drawable.ic_tabi_ninja);
            imageView9.setImageResource(R.drawable.ic_tabi_ninja);
            imageView10.setImageResource(R.drawable.ic_tabi_ninja);
            imageView11.setImageResource(R.drawable.ic_tabi_ninja);
            imageView12.setImageResource(R.drawable.ic_aatrox_lvl);
            imageView13.setImageResource(R.drawable.ic_precision);
            imageView14.setImageResource(R.drawable.ic_domination);
            imageView15.setImageResource(R.drawable.ic_brujeria);
            imageView16.setImageResource(R.drawable.ic_valor_round);
            imageView17.setImageResource(R.drawable.ic_inspiracion);
            imageView18.setImageResource(R.drawable.ic_domination);
            imageView19.setImageResource(R.drawable.ic_brujeria);
            imageView20.setImageResource(R.drawable.ic_valor);
            imageView21.setImageResource(R.drawable.ic_inspiracion_round);
            imageView22.setImageResource(R.drawable.ic_garras_del_inmortal);
            imageView23.setImageResource(R.drawable.ic_inquebrantable);
            imageView24.setImageResource(R.drawable.ic_piel_de_hierro);
            imageView25.setImageResource(R.drawable.ic_sobrecrecimiento);
            imageView26.setImageResource(R.drawable.ic_reverberacion_round);
            imageView27.setImageResource(R.drawable.ic_demoler);
            imageView28.setImageResource(R.drawable.ic_concha_espejo);
            imageView29.setImageResource(R.drawable.ic_revitalizar);
            imageView30.setImageResource(R.drawable.ic_protector);
            imageView31.setImageResource(R.drawable.ic_fuente_de_vida_round);
            imageView32.setImageResource(R.drawable.ic_condicionamiento_round);
            imageView33.setImageResource(R.drawable.ic_fuentes_renovadas_round);
            imageView34.setImageResource(R.drawable.ic_destello_hextech_round);
            imageView35.setImageResource(R.drawable.ic_botas_gratis);
            imageView36.setImageResource(R.drawable.ic_perspicacia_cosmica);
            imageView37.setImageResource(R.drawable.ic_entrega_de_galletas);
            imageView38.setImageResource(R.drawable.ic_mercado_del_futuro_round);
            imageView39.setImageResource(R.drawable.ic_velocidad_de_acercamiento);
            imageView40.setImageResource(R.drawable.ic_cronometro);
            imageView41.setImageResource(R.drawable.ic_desmaterializador);
            imageView42.setImageResource(R.drawable.ic_cuerpo_celeste);

        }
        if (champId == 4)
        {
            this.setTitle(R.string.title_amumu);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);

            toolbar.setNavigationOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(getApplicationContext(),MainActivity.class));
                    BuildActivity.this.finish();
                }
            });

            imageView1.setImageResource(R.drawable.ic_amumu);
            textView1.setText("50,87 %");
            textView2.setText("Top");
            imageView2.setImageResource(R.drawable.ic_tabi_ninja);
            imageView3.setImageResource(R.drawable.ic_tabi_ninja);
            imageView4.setImageResource(R.drawable.ic_tabi_ninja);
            imageView5.setImageResource(R.drawable.ic_tabi_ninja);
            imageView6.setImageResource(R.drawable.ic_tabi_ninja);
            imageView7.setImageResource(R.drawable.ic_tabi_ninja);
            imageView8.setImageResource(R.drawable.ic_tabi_ninja);
            imageView9.setImageResource(R.drawable.ic_tabi_ninja);
            imageView10.setImageResource(R.drawable.ic_tabi_ninja);
            imageView11.setImageResource(R.drawable.ic_tabi_ninja);
            imageView12.setImageResource(R.drawable.ic_aatrox_lvl);
            imageView13.setImageResource(R.drawable.ic_precision_round);
            imageView14.setImageResource(R.drawable.ic_domination);
            imageView15.setImageResource(R.drawable.ic_brujeria);
            imageView16.setImageResource(R.drawable.ic_valor);
            imageView17.setImageResource(R.drawable.ic_inspiracion);
            imageView18.setImageResource(R.drawable.ic_domination);
            imageView19.setImageResource(R.drawable.ic_brujeria);
            imageView20.setImageResource(R.drawable.ic_valor_round);
            imageView21.setImageResource(R.drawable.ic_inspiracion);
            imageView22.setImageResource(R.drawable.ic_ataque_intesificado_round);
            imageView23.setImageResource(R.drawable.ic_super_curacion);
            imageView24.setImageResource(R.drawable.ic_leyenda_presteza);
            imageView25.setImageResource(R.drawable.ic_golpe_de_gracia);
            imageView26.setImageResource(R.drawable.ic_compas_letal);
            imageView27.setImageResource(R.drawable.ic_triumfo);
            imageView28.setImageResource(R.drawable.ic_leyenda_tenacidad);
            imageView29.setImageResource(R.drawable.ic_derribado);
            imageView30.setImageResource(R.drawable.ic_pies_ligeros);
            imageView31.setImageResource(R.drawable.ic_claridad_mental);
            imageView32.setImageResource(R.drawable.ic_leyenda_linaje);
            imageView33.setImageResource(R.drawable.ic_ultimo_esfuerzo);
            imageView34.setImageResource(R.drawable.ic_derribado);
            imageView35.setImageResource(R.drawable.ic_derribado);
            imageView36.setImageResource(R.drawable.ic_derribado);
            imageView37.setImageResource(R.drawable.ic_derribado);
            imageView38.setImageResource(R.drawable.ic_derribado);
            imageView39.setImageResource(R.drawable.ic_derribado);
            imageView40.setImageResource(R.drawable.ic_derribado);
            imageView41.setImageResource(R.drawable.ic_derribado);
            imageView42.setImageResource(R.drawable.ic_derribado);

        }
        if (champId == 5)
        {
            this.setTitle(R.string.title_anivia);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);

            toolbar.setNavigationOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(getApplicationContext(),MainActivity.class));
                    BuildActivity.this.finish();
                }
            });

            imageView1.setImageResource(R.drawable.ic_anivia);
            textView1.setText("50,87 %");
            textView2.setText("Top");
            imageView2.setImageResource(R.drawable.ic_tabi_ninja);
            imageView3.setImageResource(R.drawable.ic_tabi_ninja);
            imageView4.setImageResource(R.drawable.ic_tabi_ninja);
            imageView5.setImageResource(R.drawable.ic_tabi_ninja);
            imageView6.setImageResource(R.drawable.ic_tabi_ninja);
            imageView7.setImageResource(R.drawable.ic_tabi_ninja);
            imageView8.setImageResource(R.drawable.ic_tabi_ninja);
            imageView9.setImageResource(R.drawable.ic_tabi_ninja);
            imageView10.setImageResource(R.drawable.ic_tabi_ninja);
            imageView11.setImageResource(R.drawable.ic_tabi_ninja);
            imageView12.setImageResource(R.drawable.ic_aatrox_lvl);
            imageView13.setImageResource(R.drawable.ic_precision_round);
            imageView14.setImageResource(R.drawable.ic_domination);
            imageView15.setImageResource(R.drawable.ic_brujeria);
            imageView16.setImageResource(R.drawable.ic_valor);
            imageView17.setImageResource(R.drawable.ic_inspiracion);
            imageView18.setImageResource(R.drawable.ic_domination);
            imageView19.setImageResource(R.drawable.ic_brujeria);
            imageView20.setImageResource(R.drawable.ic_valor_round);
            imageView21.setImageResource(R.drawable.ic_inspiracion);
            imageView22.setImageResource(R.drawable.ic_ataque_intesificado_round);
            imageView23.setImageResource(R.drawable.ic_super_curacion);
            imageView24.setImageResource(R.drawable.ic_leyenda_presteza);
            imageView25.setImageResource(R.drawable.ic_golpe_de_gracia);
            imageView26.setImageResource(R.drawable.ic_compas_letal);
            imageView27.setImageResource(R.drawable.ic_triumfo);
            imageView28.setImageResource(R.drawable.ic_leyenda_tenacidad);
            imageView29.setImageResource(R.drawable.ic_derribado);
            imageView30.setImageResource(R.drawable.ic_pies_ligeros);
            imageView31.setImageResource(R.drawable.ic_claridad_mental);
            imageView32.setImageResource(R.drawable.ic_leyenda_linaje);
            imageView33.setImageResource(R.drawable.ic_ultimo_esfuerzo);
            imageView34.setImageResource(R.drawable.ic_derribado);
            imageView35.setImageResource(R.drawable.ic_derribado);
            imageView36.setImageResource(R.drawable.ic_derribado);
            imageView37.setImageResource(R.drawable.ic_derribado);
            imageView38.setImageResource(R.drawable.ic_derribado);
            imageView39.setImageResource(R.drawable.ic_derribado);
            imageView40.setImageResource(R.drawable.ic_derribado);
            imageView41.setImageResource(R.drawable.ic_derribado);
            imageView42.setImageResource(R.drawable.ic_derribado);

        }
        if (champId == 6)
        {
            this.setTitle(R.string.title_annie);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);

            toolbar.setNavigationOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(getApplicationContext(),MainActivity.class));
                    BuildActivity.this.finish();
                }
            });

            imageView1.setImageResource(R.drawable.ic_annie);
            textView1.setText("50,87 %");
            textView2.setText("Top");
            imageView2.setImageResource(R.drawable.ic_tabi_ninja);
            imageView3.setImageResource(R.drawable.ic_tabi_ninja);
            imageView4.setImageResource(R.drawable.ic_tabi_ninja);
            imageView5.setImageResource(R.drawable.ic_tabi_ninja);
            imageView6.setImageResource(R.drawable.ic_tabi_ninja);
            imageView7.setImageResource(R.drawable.ic_tabi_ninja);
            imageView8.setImageResource(R.drawable.ic_tabi_ninja);
            imageView9.setImageResource(R.drawable.ic_tabi_ninja);
            imageView10.setImageResource(R.drawable.ic_tabi_ninja);
            imageView11.setImageResource(R.drawable.ic_tabi_ninja);
            imageView12.setImageResource(R.drawable.ic_aatrox_lvl);
            imageView13.setImageResource(R.drawable.ic_precision_round);
            imageView14.setImageResource(R.drawable.ic_domination);
            imageView15.setImageResource(R.drawable.ic_brujeria);
            imageView16.setImageResource(R.drawable.ic_valor);
            imageView17.setImageResource(R.drawable.ic_inspiracion);
            imageView18.setImageResource(R.drawable.ic_domination);
            imageView19.setImageResource(R.drawable.ic_brujeria);
            imageView20.setImageResource(R.drawable.ic_valor_round);
            imageView21.setImageResource(R.drawable.ic_inspiracion);
            imageView22.setImageResource(R.drawable.ic_ataque_intesificado_round);
            imageView23.setImageResource(R.drawable.ic_super_curacion);
            imageView24.setImageResource(R.drawable.ic_leyenda_presteza);
            imageView25.setImageResource(R.drawable.ic_golpe_de_gracia);
            imageView26.setImageResource(R.drawable.ic_compas_letal);
            imageView27.setImageResource(R.drawable.ic_triumfo);
            imageView28.setImageResource(R.drawable.ic_leyenda_tenacidad);
            imageView29.setImageResource(R.drawable.ic_derribado);
            imageView30.setImageResource(R.drawable.ic_pies_ligeros);
            imageView31.setImageResource(R.drawable.ic_claridad_mental);
            imageView32.setImageResource(R.drawable.ic_leyenda_linaje);
            imageView33.setImageResource(R.drawable.ic_ultimo_esfuerzo);
            imageView34.setImageResource(R.drawable.ic_derribado);
            imageView35.setImageResource(R.drawable.ic_derribado);
            imageView36.setImageResource(R.drawable.ic_derribado);
            imageView37.setImageResource(R.drawable.ic_derribado);
            imageView38.setImageResource(R.drawable.ic_derribado);
            imageView39.setImageResource(R.drawable.ic_derribado);
            imageView40.setImageResource(R.drawable.ic_derribado);
            imageView41.setImageResource(R.drawable.ic_derribado);
            imageView42.setImageResource(R.drawable.ic_derribado);

        }
        if (champId == 7)
        {
            this.setTitle(R.string.title_ashe);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);

            toolbar.setNavigationOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(getApplicationContext(),MainActivity.class));
                    BuildActivity.this.finish();
                }
            });

            imageView1.setImageResource(R.drawable.ic_ashe);
            textView1.setText("50,87 %");
            textView2.setText("Top");
            imageView2.setImageResource(R.drawable.ic_tabi_ninja);
            imageView3.setImageResource(R.drawable.ic_tabi_ninja);
            imageView4.setImageResource(R.drawable.ic_tabi_ninja);
            imageView5.setImageResource(R.drawable.ic_tabi_ninja);
            imageView6.setImageResource(R.drawable.ic_tabi_ninja);
            imageView7.setImageResource(R.drawable.ic_tabi_ninja);
            imageView8.setImageResource(R.drawable.ic_tabi_ninja);
            imageView9.setImageResource(R.drawable.ic_tabi_ninja);
            imageView10.setImageResource(R.drawable.ic_tabi_ninja);
            imageView11.setImageResource(R.drawable.ic_tabi_ninja);
            imageView12.setImageResource(R.drawable.ic_aatrox_lvl);
            imageView13.setImageResource(R.drawable.ic_precision_round);
            imageView14.setImageResource(R.drawable.ic_domination);
            imageView15.setImageResource(R.drawable.ic_brujeria);
            imageView16.setImageResource(R.drawable.ic_valor);
            imageView17.setImageResource(R.drawable.ic_inspiracion);
            imageView18.setImageResource(R.drawable.ic_domination);
            imageView19.setImageResource(R.drawable.ic_brujeria);
            imageView20.setImageResource(R.drawable.ic_valor_round);
            imageView21.setImageResource(R.drawable.ic_inspiracion);
            imageView22.setImageResource(R.drawable.ic_ataque_intesificado_round);
            imageView23.setImageResource(R.drawable.ic_super_curacion);
            imageView24.setImageResource(R.drawable.ic_leyenda_presteza);
            imageView25.setImageResource(R.drawable.ic_golpe_de_gracia);
            imageView26.setImageResource(R.drawable.ic_compas_letal);
            imageView27.setImageResource(R.drawable.ic_triumfo);
            imageView28.setImageResource(R.drawable.ic_leyenda_tenacidad);
            imageView29.setImageResource(R.drawable.ic_derribado);
            imageView30.setImageResource(R.drawable.ic_pies_ligeros);
            imageView31.setImageResource(R.drawable.ic_claridad_mental);
            imageView32.setImageResource(R.drawable.ic_leyenda_linaje);
            imageView33.setImageResource(R.drawable.ic_ultimo_esfuerzo);
            imageView34.setImageResource(R.drawable.ic_derribado);
            imageView35.setImageResource(R.drawable.ic_derribado);
            imageView36.setImageResource(R.drawable.ic_derribado);
            imageView37.setImageResource(R.drawable.ic_derribado);
            imageView38.setImageResource(R.drawable.ic_derribado);
            imageView39.setImageResource(R.drawable.ic_derribado);
            imageView40.setImageResource(R.drawable.ic_derribado);
            imageView41.setImageResource(R.drawable.ic_derribado);
            imageView42.setImageResource(R.drawable.ic_derribado);

        }
        if (champId == 8)
        {
            this.setTitle(R.string.title_aurelion_sol);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);

            toolbar.setNavigationOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(getApplicationContext(),MainActivity.class));
                    BuildActivity.this.finish();
                }
            });

            imageView1.setImageResource(R.drawable.ic_aurelion_sol);
            textView1.setText("50,87 %");
            textView2.setText("Top");
            imageView2.setImageResource(R.drawable.ic_tabi_ninja);
            imageView3.setImageResource(R.drawable.ic_tabi_ninja);
            imageView4.setImageResource(R.drawable.ic_tabi_ninja);
            imageView5.setImageResource(R.drawable.ic_tabi_ninja);
            imageView6.setImageResource(R.drawable.ic_tabi_ninja);
            imageView7.setImageResource(R.drawable.ic_tabi_ninja);
            imageView8.setImageResource(R.drawable.ic_tabi_ninja);
            imageView9.setImageResource(R.drawable.ic_tabi_ninja);
            imageView10.setImageResource(R.drawable.ic_tabi_ninja);
            imageView11.setImageResource(R.drawable.ic_tabi_ninja);
            imageView12.setImageResource(R.drawable.ic_aatrox_lvl);
            imageView13.setImageResource(R.drawable.ic_precision_round);
            imageView14.setImageResource(R.drawable.ic_domination);
            imageView15.setImageResource(R.drawable.ic_brujeria);
            imageView16.setImageResource(R.drawable.ic_valor);
            imageView17.setImageResource(R.drawable.ic_inspiracion);
            imageView18.setImageResource(R.drawable.ic_domination);
            imageView19.setImageResource(R.drawable.ic_brujeria);
            imageView20.setImageResource(R.drawable.ic_valor_round);
            imageView21.setImageResource(R.drawable.ic_inspiracion);
            imageView22.setImageResource(R.drawable.ic_ataque_intesificado_round);
            imageView23.setImageResource(R.drawable.ic_super_curacion);
            imageView24.setImageResource(R.drawable.ic_leyenda_presteza);
            imageView25.setImageResource(R.drawable.ic_golpe_de_gracia);
            imageView26.setImageResource(R.drawable.ic_compas_letal);
            imageView27.setImageResource(R.drawable.ic_triumfo);
            imageView28.setImageResource(R.drawable.ic_leyenda_tenacidad);
            imageView29.setImageResource(R.drawable.ic_derribado);
            imageView30.setImageResource(R.drawable.ic_pies_ligeros);
            imageView31.setImageResource(R.drawable.ic_claridad_mental);
            imageView32.setImageResource(R.drawable.ic_leyenda_linaje);
            imageView33.setImageResource(R.drawable.ic_ultimo_esfuerzo);
            imageView34.setImageResource(R.drawable.ic_derribado);
            imageView35.setImageResource(R.drawable.ic_derribado);
            imageView36.setImageResource(R.drawable.ic_derribado);
            imageView37.setImageResource(R.drawable.ic_derribado);
            imageView38.setImageResource(R.drawable.ic_derribado);
            imageView39.setImageResource(R.drawable.ic_derribado);
            imageView40.setImageResource(R.drawable.ic_derribado);
            imageView41.setImageResource(R.drawable.ic_derribado);
            imageView42.setImageResource(R.drawable.ic_derribado);

        }
        if (champId == 9)
        {
            this.setTitle(R.string.title_azir);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);

            toolbar.setNavigationOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(getApplicationContext(),MainActivity.class));
                    BuildActivity.this.finish();
                }
            });

            imageView1.setImageResource(R.drawable.ic_azir);
            textView1.setText("50,87 %");
            textView2.setText("Top");
            imageView2.setImageResource(R.drawable.ic_tabi_ninja);
            imageView3.setImageResource(R.drawable.ic_tabi_ninja);
            imageView4.setImageResource(R.drawable.ic_tabi_ninja);
            imageView5.setImageResource(R.drawable.ic_tabi_ninja);
            imageView6.setImageResource(R.drawable.ic_tabi_ninja);
            imageView7.setImageResource(R.drawable.ic_tabi_ninja);
            imageView8.setImageResource(R.drawable.ic_tabi_ninja);
            imageView9.setImageResource(R.drawable.ic_tabi_ninja);
            imageView10.setImageResource(R.drawable.ic_tabi_ninja);
            imageView11.setImageResource(R.drawable.ic_tabi_ninja);
            imageView12.setImageResource(R.drawable.ic_aatrox_lvl);
            imageView13.setImageResource(R.drawable.ic_precision_round);
            imageView14.setImageResource(R.drawable.ic_domination);
            imageView15.setImageResource(R.drawable.ic_brujeria);
            imageView16.setImageResource(R.drawable.ic_valor);
            imageView17.setImageResource(R.drawable.ic_inspiracion);
            imageView18.setImageResource(R.drawable.ic_domination);
            imageView19.setImageResource(R.drawable.ic_brujeria);
            imageView20.setImageResource(R.drawable.ic_valor_round);
            imageView21.setImageResource(R.drawable.ic_inspiracion);
            imageView22.setImageResource(R.drawable.ic_ataque_intesificado_round);
            imageView23.setImageResource(R.drawable.ic_super_curacion);
            imageView24.setImageResource(R.drawable.ic_leyenda_presteza);
            imageView25.setImageResource(R.drawable.ic_golpe_de_gracia);
            imageView26.setImageResource(R.drawable.ic_compas_letal);
            imageView27.setImageResource(R.drawable.ic_triumfo);
            imageView28.setImageResource(R.drawable.ic_leyenda_tenacidad);
            imageView29.setImageResource(R.drawable.ic_derribado);
            imageView30.setImageResource(R.drawable.ic_pies_ligeros);
            imageView31.setImageResource(R.drawable.ic_claridad_mental);
            imageView32.setImageResource(R.drawable.ic_leyenda_linaje);
            imageView33.setImageResource(R.drawable.ic_ultimo_esfuerzo);
            imageView34.setImageResource(R.drawable.ic_derribado);
            imageView35.setImageResource(R.drawable.ic_derribado);
            imageView36.setImageResource(R.drawable.ic_derribado);
            imageView37.setImageResource(R.drawable.ic_derribado);
            imageView38.setImageResource(R.drawable.ic_derribado);
            imageView39.setImageResource(R.drawable.ic_derribado);
            imageView40.setImageResource(R.drawable.ic_derribado);
            imageView41.setImageResource(R.drawable.ic_derribado);
            imageView42.setImageResource(R.drawable.ic_derribado);

        }
        if (champId == 10)
        {
            this.setTitle(R.string.title_bardo);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);

            toolbar.setNavigationOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(getApplicationContext(),MainActivity.class));
                    BuildActivity.this.finish();
                }
            });

            imageView1.setImageResource(R.drawable.ic_bardo);
            textView1.setText("50,87 %");
            textView2.setText("Top");
            imageView2.setImageResource(R.drawable.ic_tabi_ninja);
            imageView3.setImageResource(R.drawable.ic_tabi_ninja);
            imageView4.setImageResource(R.drawable.ic_tabi_ninja);
            imageView5.setImageResource(R.drawable.ic_tabi_ninja);
            imageView6.setImageResource(R.drawable.ic_tabi_ninja);
            imageView7.setImageResource(R.drawable.ic_tabi_ninja);
            imageView8.setImageResource(R.drawable.ic_tabi_ninja);
            imageView9.setImageResource(R.drawable.ic_tabi_ninja);
            imageView10.setImageResource(R.drawable.ic_tabi_ninja);
            imageView11.setImageResource(R.drawable.ic_tabi_ninja);
            imageView12.setImageResource(R.drawable.ic_aatrox_lvl);
            imageView13.setImageResource(R.drawable.ic_precision_round);
            imageView14.setImageResource(R.drawable.ic_domination);
            imageView15.setImageResource(R.drawable.ic_brujeria);
            imageView16.setImageResource(R.drawable.ic_valor);
            imageView17.setImageResource(R.drawable.ic_inspiracion);
            imageView18.setImageResource(R.drawable.ic_domination);
            imageView19.setImageResource(R.drawable.ic_brujeria);
            imageView20.setImageResource(R.drawable.ic_valor_round);
            imageView21.setImageResource(R.drawable.ic_inspiracion);
            imageView22.setImageResource(R.drawable.ic_ataque_intesificado_round);
            imageView23.setImageResource(R.drawable.ic_super_curacion);
            imageView24.setImageResource(R.drawable.ic_leyenda_presteza);
            imageView25.setImageResource(R.drawable.ic_golpe_de_gracia);
            imageView26.setImageResource(R.drawable.ic_compas_letal);
            imageView27.setImageResource(R.drawable.ic_triumfo);
            imageView28.setImageResource(R.drawable.ic_leyenda_tenacidad);
            imageView29.setImageResource(R.drawable.ic_derribado);
            imageView30.setImageResource(R.drawable.ic_pies_ligeros);
            imageView31.setImageResource(R.drawable.ic_claridad_mental);
            imageView32.setImageResource(R.drawable.ic_leyenda_linaje);
            imageView33.setImageResource(R.drawable.ic_ultimo_esfuerzo);
            imageView34.setImageResource(R.drawable.ic_derribado);
            imageView35.setImageResource(R.drawable.ic_derribado);
            imageView36.setImageResource(R.drawable.ic_derribado);
            imageView37.setImageResource(R.drawable.ic_derribado);
            imageView38.setImageResource(R.drawable.ic_derribado);
            imageView39.setImageResource(R.drawable.ic_derribado);
            imageView40.setImageResource(R.drawable.ic_derribado);
            imageView41.setImageResource(R.drawable.ic_derribado);
            imageView42.setImageResource(R.drawable.ic_derribado);

        }
        if (champId == 11)
        {
            this.setTitle(R.string.title_blitzcrank);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);

            toolbar.setNavigationOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(getApplicationContext(),MainActivity.class));
                    BuildActivity.this.finish();
                }
            });

            imageView1.setImageResource(R.drawable.ic_blitzcrank);
            textView1.setText("50,87 %");
            textView2.setText("Top");
            imageView2.setImageResource(R.drawable.ic_tabi_ninja);
            imageView3.setImageResource(R.drawable.ic_tabi_ninja);
            imageView4.setImageResource(R.drawable.ic_tabi_ninja);
            imageView5.setImageResource(R.drawable.ic_tabi_ninja);
            imageView6.setImageResource(R.drawable.ic_tabi_ninja);
            imageView7.setImageResource(R.drawable.ic_tabi_ninja);
            imageView8.setImageResource(R.drawable.ic_tabi_ninja);
            imageView9.setImageResource(R.drawable.ic_tabi_ninja);
            imageView10.setImageResource(R.drawable.ic_tabi_ninja);
            imageView11.setImageResource(R.drawable.ic_tabi_ninja);
            imageView12.setImageResource(R.drawable.ic_aatrox_lvl);
            imageView13.setImageResource(R.drawable.ic_precision_round);
            imageView14.setImageResource(R.drawable.ic_domination);
            imageView15.setImageResource(R.drawable.ic_brujeria);
            imageView16.setImageResource(R.drawable.ic_valor);
            imageView17.setImageResource(R.drawable.ic_inspiracion);
            imageView18.setImageResource(R.drawable.ic_domination);
            imageView19.setImageResource(R.drawable.ic_brujeria);
            imageView20.setImageResource(R.drawable.ic_valor_round);
            imageView21.setImageResource(R.drawable.ic_inspiracion);
            imageView22.setImageResource(R.drawable.ic_ataque_intesificado_round);
            imageView23.setImageResource(R.drawable.ic_super_curacion);
            imageView24.setImageResource(R.drawable.ic_leyenda_presteza);
            imageView25.setImageResource(R.drawable.ic_golpe_de_gracia);
            imageView26.setImageResource(R.drawable.ic_compas_letal);
            imageView27.setImageResource(R.drawable.ic_triumfo);
            imageView28.setImageResource(R.drawable.ic_leyenda_tenacidad);
            imageView29.setImageResource(R.drawable.ic_derribado);
            imageView30.setImageResource(R.drawable.ic_pies_ligeros);
            imageView31.setImageResource(R.drawable.ic_claridad_mental);
            imageView32.setImageResource(R.drawable.ic_leyenda_linaje);
            imageView33.setImageResource(R.drawable.ic_ultimo_esfuerzo);
            imageView34.setImageResource(R.drawable.ic_derribado);
            imageView35.setImageResource(R.drawable.ic_derribado);
            imageView36.setImageResource(R.drawable.ic_derribado);
            imageView37.setImageResource(R.drawable.ic_derribado);
            imageView38.setImageResource(R.drawable.ic_derribado);
            imageView39.setImageResource(R.drawable.ic_derribado);
            imageView40.setImageResource(R.drawable.ic_derribado);
            imageView41.setImageResource(R.drawable.ic_derribado);
            imageView42.setImageResource(R.drawable.ic_derribado);

        }
        if (champId == 12)
        {
            this.setTitle(R.string.title_brand);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);

            toolbar.setNavigationOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(getApplicationContext(),MainActivity.class));
                    BuildActivity.this.finish();
                }
            });

            imageView1.setImageResource(R.drawable.ic_brand);
            textView1.setText("50,87 %");
            textView2.setText("Top");
            imageView2.setImageResource(R.drawable.ic_tabi_ninja);
            imageView3.setImageResource(R.drawable.ic_tabi_ninja);
            imageView4.setImageResource(R.drawable.ic_tabi_ninja);
            imageView5.setImageResource(R.drawable.ic_tabi_ninja);
            imageView6.setImageResource(R.drawable.ic_tabi_ninja);
            imageView7.setImageResource(R.drawable.ic_tabi_ninja);
            imageView8.setImageResource(R.drawable.ic_tabi_ninja);
            imageView9.setImageResource(R.drawable.ic_tabi_ninja);
            imageView10.setImageResource(R.drawable.ic_tabi_ninja);
            imageView11.setImageResource(R.drawable.ic_tabi_ninja);
            imageView12.setImageResource(R.drawable.ic_aatrox_lvl);
            imageView13.setImageResource(R.drawable.ic_precision_round);
            imageView14.setImageResource(R.drawable.ic_domination);
            imageView15.setImageResource(R.drawable.ic_brujeria);
            imageView16.setImageResource(R.drawable.ic_valor);
            imageView17.setImageResource(R.drawable.ic_inspiracion);
            imageView18.setImageResource(R.drawable.ic_domination);
            imageView19.setImageResource(R.drawable.ic_brujeria);
            imageView20.setImageResource(R.drawable.ic_valor_round);
            imageView21.setImageResource(R.drawable.ic_inspiracion);
            imageView22.setImageResource(R.drawable.ic_ataque_intesificado_round);
            imageView23.setImageResource(R.drawable.ic_super_curacion);
            imageView24.setImageResource(R.drawable.ic_leyenda_presteza);
            imageView25.setImageResource(R.drawable.ic_golpe_de_gracia);
            imageView26.setImageResource(R.drawable.ic_compas_letal);
            imageView27.setImageResource(R.drawable.ic_triumfo);
            imageView28.setImageResource(R.drawable.ic_leyenda_tenacidad);
            imageView29.setImageResource(R.drawable.ic_derribado);
            imageView30.setImageResource(R.drawable.ic_pies_ligeros);
            imageView31.setImageResource(R.drawable.ic_claridad_mental);
            imageView32.setImageResource(R.drawable.ic_leyenda_linaje);
            imageView33.setImageResource(R.drawable.ic_ultimo_esfuerzo);
            imageView34.setImageResource(R.drawable.ic_derribado);
            imageView35.setImageResource(R.drawable.ic_derribado);
            imageView36.setImageResource(R.drawable.ic_derribado);
            imageView37.setImageResource(R.drawable.ic_derribado);
            imageView38.setImageResource(R.drawable.ic_derribado);
            imageView39.setImageResource(R.drawable.ic_derribado);
            imageView40.setImageResource(R.drawable.ic_derribado);
            imageView41.setImageResource(R.drawable.ic_derribado);
            imageView42.setImageResource(R.drawable.ic_derribado);

        }
        if (champId == 13)
        {
            this.setTitle(R.string.title_braum);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);

            toolbar.setNavigationOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(getApplicationContext(),MainActivity.class));
                    BuildActivity.this.finish();
                }
            });

            imageView1.setImageResource(R.drawable.ic_braum);
            textView1.setText("50,87 %");
            textView2.setText("Top");
            imageView2.setImageResource(R.drawable.ic_tabi_ninja);
            imageView3.setImageResource(R.drawable.ic_tabi_ninja);
            imageView4.setImageResource(R.drawable.ic_tabi_ninja);
            imageView5.setImageResource(R.drawable.ic_tabi_ninja);
            imageView6.setImageResource(R.drawable.ic_tabi_ninja);
            imageView7.setImageResource(R.drawable.ic_tabi_ninja);
            imageView8.setImageResource(R.drawable.ic_tabi_ninja);
            imageView9.setImageResource(R.drawable.ic_tabi_ninja);
            imageView10.setImageResource(R.drawable.ic_tabi_ninja);
            imageView11.setImageResource(R.drawable.ic_tabi_ninja);
            imageView12.setImageResource(R.drawable.ic_aatrox_lvl);
            imageView13.setImageResource(R.drawable.ic_precision_round);
            imageView14.setImageResource(R.drawable.ic_domination);
            imageView15.setImageResource(R.drawable.ic_brujeria);
            imageView16.setImageResource(R.drawable.ic_valor);
            imageView17.setImageResource(R.drawable.ic_inspiracion);
            imageView18.setImageResource(R.drawable.ic_domination);
            imageView19.setImageResource(R.drawable.ic_brujeria);
            imageView20.setImageResource(R.drawable.ic_valor_round);
            imageView21.setImageResource(R.drawable.ic_inspiracion);
            imageView22.setImageResource(R.drawable.ic_ataque_intesificado_round);
            imageView23.setImageResource(R.drawable.ic_super_curacion);
            imageView24.setImageResource(R.drawable.ic_leyenda_presteza);
            imageView25.setImageResource(R.drawable.ic_golpe_de_gracia);
            imageView26.setImageResource(R.drawable.ic_compas_letal);
            imageView27.setImageResource(R.drawable.ic_triumfo);
            imageView28.setImageResource(R.drawable.ic_leyenda_tenacidad);
            imageView29.setImageResource(R.drawable.ic_derribado);
            imageView30.setImageResource(R.drawable.ic_pies_ligeros);
            imageView31.setImageResource(R.drawable.ic_claridad_mental);
            imageView32.setImageResource(R.drawable.ic_leyenda_linaje);
            imageView33.setImageResource(R.drawable.ic_ultimo_esfuerzo);
            imageView34.setImageResource(R.drawable.ic_derribado);
            imageView35.setImageResource(R.drawable.ic_derribado);
            imageView36.setImageResource(R.drawable.ic_derribado);
            imageView37.setImageResource(R.drawable.ic_derribado);
            imageView38.setImageResource(R.drawable.ic_derribado);
            imageView39.setImageResource(R.drawable.ic_derribado);
            imageView40.setImageResource(R.drawable.ic_derribado);
            imageView41.setImageResource(R.drawable.ic_derribado);
            imageView42.setImageResource(R.drawable.ic_derribado);

        }
        if (champId == 14)
        {
            this.setTitle(R.string.title_caitlyn);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);

            toolbar.setNavigationOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(getApplicationContext(),MainActivity.class));
                    BuildActivity.this.finish();
                }
            });

            imageView1.setImageResource(R.drawable.ic_caitlyn);
            textView1.setText("50,87 %");
            textView2.setText("Top");
            imageView2.setImageResource(R.drawable.ic_tabi_ninja);
            imageView3.setImageResource(R.drawable.ic_tabi_ninja);
            imageView4.setImageResource(R.drawable.ic_tabi_ninja);
            imageView5.setImageResource(R.drawable.ic_tabi_ninja);
            imageView6.setImageResource(R.drawable.ic_tabi_ninja);
            imageView7.setImageResource(R.drawable.ic_tabi_ninja);
            imageView8.setImageResource(R.drawable.ic_tabi_ninja);
            imageView9.setImageResource(R.drawable.ic_tabi_ninja);
            imageView10.setImageResource(R.drawable.ic_tabi_ninja);
            imageView11.setImageResource(R.drawable.ic_tabi_ninja);
            imageView12.setImageResource(R.drawable.ic_aatrox_lvl);
            imageView13.setImageResource(R.drawable.ic_precision_round);
            imageView14.setImageResource(R.drawable.ic_domination);
            imageView15.setImageResource(R.drawable.ic_brujeria);
            imageView16.setImageResource(R.drawable.ic_valor);
            imageView17.setImageResource(R.drawable.ic_inspiracion);
            imageView18.setImageResource(R.drawable.ic_domination);
            imageView19.setImageResource(R.drawable.ic_brujeria);
            imageView20.setImageResource(R.drawable.ic_valor_round);
            imageView21.setImageResource(R.drawable.ic_inspiracion);
            imageView22.setImageResource(R.drawable.ic_ataque_intesificado_round);
            imageView23.setImageResource(R.drawable.ic_super_curacion);
            imageView24.setImageResource(R.drawable.ic_leyenda_presteza);
            imageView25.setImageResource(R.drawable.ic_golpe_de_gracia);
            imageView26.setImageResource(R.drawable.ic_compas_letal);
            imageView27.setImageResource(R.drawable.ic_triumfo);
            imageView28.setImageResource(R.drawable.ic_leyenda_tenacidad);
            imageView29.setImageResource(R.drawable.ic_derribado);
            imageView30.setImageResource(R.drawable.ic_pies_ligeros);
            imageView31.setImageResource(R.drawable.ic_claridad_mental);
            imageView32.setImageResource(R.drawable.ic_leyenda_linaje);
            imageView33.setImageResource(R.drawable.ic_ultimo_esfuerzo);
            imageView34.setImageResource(R.drawable.ic_derribado);
            imageView35.setImageResource(R.drawable.ic_derribado);
            imageView36.setImageResource(R.drawable.ic_derribado);
            imageView37.setImageResource(R.drawable.ic_derribado);
            imageView38.setImageResource(R.drawable.ic_derribado);
            imageView39.setImageResource(R.drawable.ic_derribado);
            imageView40.setImageResource(R.drawable.ic_derribado);
            imageView41.setImageResource(R.drawable.ic_derribado);
            imageView42.setImageResource(R.drawable.ic_derribado);

        }
        if (champId == 15)
        {
            this.setTitle(R.string.title_camille);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);

            toolbar.setNavigationOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(getApplicationContext(),MainActivity.class));
                    BuildActivity.this.finish();
                }
            });

            imageView1.setImageResource(R.drawable.ic_camille);
            textView1.setText("50,87 %");
            textView2.setText("Top");
            imageView2.setImageResource(R.drawable.ic_tabi_ninja);
            imageView3.setImageResource(R.drawable.ic_tabi_ninja);
            imageView4.setImageResource(R.drawable.ic_tabi_ninja);
            imageView5.setImageResource(R.drawable.ic_tabi_ninja);
            imageView6.setImageResource(R.drawable.ic_tabi_ninja);
            imageView7.setImageResource(R.drawable.ic_tabi_ninja);
            imageView8.setImageResource(R.drawable.ic_tabi_ninja);
            imageView9.setImageResource(R.drawable.ic_tabi_ninja);
            imageView10.setImageResource(R.drawable.ic_tabi_ninja);
            imageView11.setImageResource(R.drawable.ic_tabi_ninja);
            imageView12.setImageResource(R.drawable.ic_aatrox_lvl);
            imageView13.setImageResource(R.drawable.ic_precision_round);
            imageView14.setImageResource(R.drawable.ic_domination);
            imageView15.setImageResource(R.drawable.ic_brujeria);
            imageView16.setImageResource(R.drawable.ic_valor);
            imageView17.setImageResource(R.drawable.ic_inspiracion);
            imageView18.setImageResource(R.drawable.ic_domination);
            imageView19.setImageResource(R.drawable.ic_brujeria);
            imageView20.setImageResource(R.drawable.ic_valor_round);
            imageView21.setImageResource(R.drawable.ic_inspiracion);
            imageView22.setImageResource(R.drawable.ic_ataque_intesificado_round);
            imageView23.setImageResource(R.drawable.ic_super_curacion);
            imageView24.setImageResource(R.drawable.ic_leyenda_presteza);
            imageView25.setImageResource(R.drawable.ic_golpe_de_gracia);
            imageView26.setImageResource(R.drawable.ic_compas_letal);
            imageView27.setImageResource(R.drawable.ic_triumfo);
            imageView28.setImageResource(R.drawable.ic_leyenda_tenacidad);
            imageView29.setImageResource(R.drawable.ic_derribado);
            imageView30.setImageResource(R.drawable.ic_pies_ligeros);
            imageView31.setImageResource(R.drawable.ic_claridad_mental);
            imageView32.setImageResource(R.drawable.ic_leyenda_linaje);
            imageView33.setImageResource(R.drawable.ic_ultimo_esfuerzo);
            imageView34.setImageResource(R.drawable.ic_derribado);
            imageView35.setImageResource(R.drawable.ic_derribado);
            imageView36.setImageResource(R.drawable.ic_derribado);
            imageView37.setImageResource(R.drawable.ic_derribado);
            imageView38.setImageResource(R.drawable.ic_derribado);
            imageView39.setImageResource(R.drawable.ic_derribado);
            imageView40.setImageResource(R.drawable.ic_derribado);
            imageView41.setImageResource(R.drawable.ic_derribado);
            imageView42.setImageResource(R.drawable.ic_derribado);

        }
        if (champId == 16)
        {
            this.setTitle(R.string.title_cassiopeia);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);

            toolbar.setNavigationOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(getApplicationContext(),MainActivity.class));
                    BuildActivity.this.finish();
                }
            });

            imageView1.setImageResource(R.drawable.ic_cassiopeia);
            textView1.setText("50,87 %");
            textView2.setText("Top");
            imageView2.setImageResource(R.drawable.ic_tabi_ninja);
            imageView3.setImageResource(R.drawable.ic_tabi_ninja);
            imageView4.setImageResource(R.drawable.ic_tabi_ninja);
            imageView5.setImageResource(R.drawable.ic_tabi_ninja);
            imageView6.setImageResource(R.drawable.ic_tabi_ninja);
            imageView7.setImageResource(R.drawable.ic_tabi_ninja);
            imageView8.setImageResource(R.drawable.ic_tabi_ninja);
            imageView9.setImageResource(R.drawable.ic_tabi_ninja);
            imageView10.setImageResource(R.drawable.ic_tabi_ninja);
            imageView11.setImageResource(R.drawable.ic_tabi_ninja);
            imageView12.setImageResource(R.drawable.ic_aatrox_lvl);
            imageView13.setImageResource(R.drawable.ic_precision_round);
            imageView14.setImageResource(R.drawable.ic_domination);
            imageView15.setImageResource(R.drawable.ic_brujeria);
            imageView16.setImageResource(R.drawable.ic_valor);
            imageView17.setImageResource(R.drawable.ic_inspiracion);
            imageView18.setImageResource(R.drawable.ic_domination);
            imageView19.setImageResource(R.drawable.ic_brujeria);
            imageView20.setImageResource(R.drawable.ic_valor_round);
            imageView21.setImageResource(R.drawable.ic_inspiracion);
            imageView22.setImageResource(R.drawable.ic_ataque_intesificado_round);
            imageView23.setImageResource(R.drawable.ic_super_curacion);
            imageView24.setImageResource(R.drawable.ic_leyenda_presteza);
            imageView25.setImageResource(R.drawable.ic_golpe_de_gracia);
            imageView26.setImageResource(R.drawable.ic_compas_letal);
            imageView27.setImageResource(R.drawable.ic_triumfo);
            imageView28.setImageResource(R.drawable.ic_leyenda_tenacidad);
            imageView29.setImageResource(R.drawable.ic_derribado);
            imageView30.setImageResource(R.drawable.ic_pies_ligeros);
            imageView31.setImageResource(R.drawable.ic_claridad_mental);
            imageView32.setImageResource(R.drawable.ic_leyenda_linaje);
            imageView33.setImageResource(R.drawable.ic_ultimo_esfuerzo);
            imageView34.setImageResource(R.drawable.ic_derribado);
            imageView35.setImageResource(R.drawable.ic_derribado);
            imageView36.setImageResource(R.drawable.ic_derribado);
            imageView37.setImageResource(R.drawable.ic_derribado);
            imageView38.setImageResource(R.drawable.ic_derribado);
            imageView39.setImageResource(R.drawable.ic_derribado);
            imageView40.setImageResource(R.drawable.ic_derribado);
            imageView41.setImageResource(R.drawable.ic_derribado);
            imageView42.setImageResource(R.drawable.ic_derribado);

        }
        if (champId == 17)
        {
            this.setTitle(R.string.title_cho_gath);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);

            toolbar.setNavigationOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(getApplicationContext(),MainActivity.class));
                    BuildActivity.this.finish();
                }
            });

            imageView1.setImageResource(R.drawable.ic_chogath);
            textView1.setText("50,87 %");
            textView2.setText("Top");
            imageView2.setImageResource(R.drawable.ic_tabi_ninja);
            imageView3.setImageResource(R.drawable.ic_tabi_ninja);
            imageView4.setImageResource(R.drawable.ic_tabi_ninja);
            imageView5.setImageResource(R.drawable.ic_tabi_ninja);
            imageView6.setImageResource(R.drawable.ic_tabi_ninja);
            imageView7.setImageResource(R.drawable.ic_tabi_ninja);
            imageView8.setImageResource(R.drawable.ic_tabi_ninja);
            imageView9.setImageResource(R.drawable.ic_tabi_ninja);
            imageView10.setImageResource(R.drawable.ic_tabi_ninja);
            imageView11.setImageResource(R.drawable.ic_tabi_ninja);
            imageView12.setImageResource(R.drawable.ic_aatrox_lvl);
            imageView13.setImageResource(R.drawable.ic_precision_round);
            imageView14.setImageResource(R.drawable.ic_domination);
            imageView15.setImageResource(R.drawable.ic_brujeria);
            imageView16.setImageResource(R.drawable.ic_valor);
            imageView17.setImageResource(R.drawable.ic_inspiracion);
            imageView18.setImageResource(R.drawable.ic_domination);
            imageView19.setImageResource(R.drawable.ic_brujeria);
            imageView20.setImageResource(R.drawable.ic_valor_round);
            imageView21.setImageResource(R.drawable.ic_inspiracion);
            imageView22.setImageResource(R.drawable.ic_ataque_intesificado_round);
            imageView23.setImageResource(R.drawable.ic_super_curacion);
            imageView24.setImageResource(R.drawable.ic_leyenda_presteza);
            imageView25.setImageResource(R.drawable.ic_golpe_de_gracia);
            imageView26.setImageResource(R.drawable.ic_compas_letal);
            imageView27.setImageResource(R.drawable.ic_triumfo);
            imageView28.setImageResource(R.drawable.ic_leyenda_tenacidad);
            imageView29.setImageResource(R.drawable.ic_derribado);
            imageView30.setImageResource(R.drawable.ic_pies_ligeros);
            imageView31.setImageResource(R.drawable.ic_claridad_mental);
            imageView32.setImageResource(R.drawable.ic_leyenda_linaje);
            imageView33.setImageResource(R.drawable.ic_ultimo_esfuerzo);
            imageView34.setImageResource(R.drawable.ic_derribado);
            imageView35.setImageResource(R.drawable.ic_derribado);
            imageView36.setImageResource(R.drawable.ic_derribado);
            imageView37.setImageResource(R.drawable.ic_derribado);
            imageView38.setImageResource(R.drawable.ic_derribado);
            imageView39.setImageResource(R.drawable.ic_derribado);
            imageView40.setImageResource(R.drawable.ic_derribado);
            imageView41.setImageResource(R.drawable.ic_derribado);
            imageView42.setImageResource(R.drawable.ic_derribado);

        }
        if (champId == 18)
        {
            this.setTitle(R.string.title_corki);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);

            toolbar.setNavigationOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(getApplicationContext(),MainActivity.class));
                    BuildActivity.this.finish();
                }
            });

            imageView1.setImageResource(R.drawable.ic_corki);
            textView1.setText("50,87 %");
            textView2.setText("Top");
            imageView2.setImageResource(R.drawable.ic_tabi_ninja);
            imageView3.setImageResource(R.drawable.ic_tabi_ninja);
            imageView4.setImageResource(R.drawable.ic_tabi_ninja);
            imageView5.setImageResource(R.drawable.ic_tabi_ninja);
            imageView6.setImageResource(R.drawable.ic_tabi_ninja);
            imageView7.setImageResource(R.drawable.ic_tabi_ninja);
            imageView8.setImageResource(R.drawable.ic_tabi_ninja);
            imageView9.setImageResource(R.drawable.ic_tabi_ninja);
            imageView10.setImageResource(R.drawable.ic_tabi_ninja);
            imageView11.setImageResource(R.drawable.ic_tabi_ninja);
            imageView12.setImageResource(R.drawable.ic_aatrox_lvl);
            imageView13.setImageResource(R.drawable.ic_precision_round);
            imageView14.setImageResource(R.drawable.ic_domination);
            imageView15.setImageResource(R.drawable.ic_brujeria);
            imageView16.setImageResource(R.drawable.ic_valor);
            imageView17.setImageResource(R.drawable.ic_inspiracion);
            imageView18.setImageResource(R.drawable.ic_domination);
            imageView19.setImageResource(R.drawable.ic_brujeria);
            imageView20.setImageResource(R.drawable.ic_valor_round);
            imageView21.setImageResource(R.drawable.ic_inspiracion);
            imageView22.setImageResource(R.drawable.ic_ataque_intesificado_round);
            imageView23.setImageResource(R.drawable.ic_super_curacion);
            imageView24.setImageResource(R.drawable.ic_leyenda_presteza);
            imageView25.setImageResource(R.drawable.ic_golpe_de_gracia);
            imageView26.setImageResource(R.drawable.ic_compas_letal);
            imageView27.setImageResource(R.drawable.ic_triumfo);
            imageView28.setImageResource(R.drawable.ic_leyenda_tenacidad);
            imageView29.setImageResource(R.drawable.ic_derribado);
            imageView30.setImageResource(R.drawable.ic_pies_ligeros);
            imageView31.setImageResource(R.drawable.ic_claridad_mental);
            imageView32.setImageResource(R.drawable.ic_leyenda_linaje);
            imageView33.setImageResource(R.drawable.ic_ultimo_esfuerzo);
            imageView34.setImageResource(R.drawable.ic_derribado);
            imageView35.setImageResource(R.drawable.ic_derribado);
            imageView36.setImageResource(R.drawable.ic_derribado);
            imageView37.setImageResource(R.drawable.ic_derribado);
            imageView38.setImageResource(R.drawable.ic_derribado);
            imageView39.setImageResource(R.drawable.ic_derribado);
            imageView40.setImageResource(R.drawable.ic_derribado);
            imageView41.setImageResource(R.drawable.ic_derribado);
            imageView42.setImageResource(R.drawable.ic_derribado);

        }
        if (champId == 19)
        {
            this.setTitle(R.string.title_darius);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);

            toolbar.setNavigationOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(getApplicationContext(),MainActivity.class));
                    BuildActivity.this.finish();
                }
            });

            imageView1.setImageResource(R.drawable.ic_darius);
            textView1.setText("50,87 %");
            textView2.setText("Top");
            imageView2.setImageResource(R.drawable.ic_tabi_ninja);
            imageView3.setImageResource(R.drawable.ic_tabi_ninja);
            imageView4.setImageResource(R.drawable.ic_tabi_ninja);
            imageView5.setImageResource(R.drawable.ic_tabi_ninja);
            imageView6.setImageResource(R.drawable.ic_tabi_ninja);
            imageView7.setImageResource(R.drawable.ic_tabi_ninja);
            imageView8.setImageResource(R.drawable.ic_tabi_ninja);
            imageView9.setImageResource(R.drawable.ic_tabi_ninja);
            imageView10.setImageResource(R.drawable.ic_tabi_ninja);
            imageView11.setImageResource(R.drawable.ic_tabi_ninja);
            imageView12.setImageResource(R.drawable.ic_aatrox_lvl);
            imageView13.setImageResource(R.drawable.ic_precision_round);
            imageView14.setImageResource(R.drawable.ic_domination);
            imageView15.setImageResource(R.drawable.ic_brujeria);
            imageView16.setImageResource(R.drawable.ic_valor);
            imageView17.setImageResource(R.drawable.ic_inspiracion);
            imageView18.setImageResource(R.drawable.ic_domination);
            imageView19.setImageResource(R.drawable.ic_brujeria);
            imageView20.setImageResource(R.drawable.ic_valor_round);
            imageView21.setImageResource(R.drawable.ic_inspiracion);
            imageView22.setImageResource(R.drawable.ic_ataque_intesificado_round);
            imageView23.setImageResource(R.drawable.ic_super_curacion);
            imageView24.setImageResource(R.drawable.ic_leyenda_presteza);
            imageView25.setImageResource(R.drawable.ic_golpe_de_gracia);
            imageView26.setImageResource(R.drawable.ic_compas_letal);
            imageView27.setImageResource(R.drawable.ic_triumfo);
            imageView28.setImageResource(R.drawable.ic_leyenda_tenacidad);
            imageView29.setImageResource(R.drawable.ic_derribado);
            imageView30.setImageResource(R.drawable.ic_pies_ligeros);
            imageView31.setImageResource(R.drawable.ic_claridad_mental);
            imageView32.setImageResource(R.drawable.ic_leyenda_linaje);
            imageView33.setImageResource(R.drawable.ic_ultimo_esfuerzo);
            imageView34.setImageResource(R.drawable.ic_derribado);
            imageView35.setImageResource(R.drawable.ic_derribado);
            imageView36.setImageResource(R.drawable.ic_derribado);
            imageView37.setImageResource(R.drawable.ic_derribado);
            imageView38.setImageResource(R.drawable.ic_derribado);
            imageView39.setImageResource(R.drawable.ic_derribado);
            imageView40.setImageResource(R.drawable.ic_derribado);
            imageView41.setImageResource(R.drawable.ic_derribado);
            imageView42.setImageResource(R.drawable.ic_derribado);

        }
        if (champId == 20)
        {
            this.setTitle(R.string.title_diana);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);

            toolbar.setNavigationOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(getApplicationContext(),MainActivity.class));
                    BuildActivity.this.finish();
                }
            });

            imageView1.setImageResource(R.drawable.ic_diana);
            textView1.setText("50,87 %");
            textView2.setText("Top");
            imageView2.setImageResource(R.drawable.ic_tabi_ninja);
            imageView3.setImageResource(R.drawable.ic_tabi_ninja);
            imageView4.setImageResource(R.drawable.ic_tabi_ninja);
            imageView5.setImageResource(R.drawable.ic_tabi_ninja);
            imageView6.setImageResource(R.drawable.ic_tabi_ninja);
            imageView7.setImageResource(R.drawable.ic_tabi_ninja);
            imageView8.setImageResource(R.drawable.ic_tabi_ninja);
            imageView9.setImageResource(R.drawable.ic_tabi_ninja);
            imageView10.setImageResource(R.drawable.ic_tabi_ninja);
            imageView11.setImageResource(R.drawable.ic_tabi_ninja);
            imageView12.setImageResource(R.drawable.ic_aatrox_lvl);
            imageView13.setImageResource(R.drawable.ic_precision_round);
            imageView14.setImageResource(R.drawable.ic_domination);
            imageView15.setImageResource(R.drawable.ic_brujeria);
            imageView16.setImageResource(R.drawable.ic_valor);
            imageView17.setImageResource(R.drawable.ic_inspiracion);
            imageView18.setImageResource(R.drawable.ic_domination);
            imageView19.setImageResource(R.drawable.ic_brujeria);
            imageView20.setImageResource(R.drawable.ic_valor_round);
            imageView21.setImageResource(R.drawable.ic_inspiracion);
            imageView22.setImageResource(R.drawable.ic_ataque_intesificado_round);
            imageView23.setImageResource(R.drawable.ic_super_curacion);
            imageView24.setImageResource(R.drawable.ic_leyenda_presteza);
            imageView25.setImageResource(R.drawable.ic_golpe_de_gracia);
            imageView26.setImageResource(R.drawable.ic_compas_letal);
            imageView27.setImageResource(R.drawable.ic_triumfo);
            imageView28.setImageResource(R.drawable.ic_leyenda_tenacidad);
            imageView29.setImageResource(R.drawable.ic_derribado);
            imageView30.setImageResource(R.drawable.ic_pies_ligeros);
            imageView31.setImageResource(R.drawable.ic_claridad_mental);
            imageView32.setImageResource(R.drawable.ic_leyenda_linaje);
            imageView33.setImageResource(R.drawable.ic_ultimo_esfuerzo);
            imageView34.setImageResource(R.drawable.ic_derribado);
            imageView35.setImageResource(R.drawable.ic_derribado);
            imageView36.setImageResource(R.drawable.ic_derribado);
            imageView37.setImageResource(R.drawable.ic_derribado);
            imageView38.setImageResource(R.drawable.ic_derribado);
            imageView39.setImageResource(R.drawable.ic_derribado);
            imageView40.setImageResource(R.drawable.ic_derribado);
            imageView41.setImageResource(R.drawable.ic_derribado);
            imageView42.setImageResource(R.drawable.ic_derribado);

        }
        if (champId == 21)
        {
            this.setTitle(R.string.title_dr_mundo);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);

            toolbar.setNavigationOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(getApplicationContext(),MainActivity.class));
                    BuildActivity.this.finish();
                }
            });

            imageView1.setImageResource(R.drawable.ic_dr_mundo);
            textView1.setText("50,87 %");
            textView2.setText("Top");
            imageView2.setImageResource(R.drawable.ic_tabi_ninja);
            imageView3.setImageResource(R.drawable.ic_tabi_ninja);
            imageView4.setImageResource(R.drawable.ic_tabi_ninja);
            imageView5.setImageResource(R.drawable.ic_tabi_ninja);
            imageView6.setImageResource(R.drawable.ic_tabi_ninja);
            imageView7.setImageResource(R.drawable.ic_tabi_ninja);
            imageView8.setImageResource(R.drawable.ic_tabi_ninja);
            imageView9.setImageResource(R.drawable.ic_tabi_ninja);
            imageView10.setImageResource(R.drawable.ic_tabi_ninja);
            imageView11.setImageResource(R.drawable.ic_tabi_ninja);
            imageView12.setImageResource(R.drawable.ic_aatrox_lvl);
            imageView13.setImageResource(R.drawable.ic_precision_round);
            imageView14.setImageResource(R.drawable.ic_domination);
            imageView15.setImageResource(R.drawable.ic_brujeria);
            imageView16.setImageResource(R.drawable.ic_valor);
            imageView17.setImageResource(R.drawable.ic_inspiracion);
            imageView18.setImageResource(R.drawable.ic_domination);
            imageView19.setImageResource(R.drawable.ic_brujeria);
            imageView20.setImageResource(R.drawable.ic_valor_round);
            imageView21.setImageResource(R.drawable.ic_inspiracion);
            imageView22.setImageResource(R.drawable.ic_ataque_intesificado_round);
            imageView23.setImageResource(R.drawable.ic_super_curacion);
            imageView24.setImageResource(R.drawable.ic_leyenda_presteza);
            imageView25.setImageResource(R.drawable.ic_golpe_de_gracia);
            imageView26.setImageResource(R.drawable.ic_compas_letal);
            imageView27.setImageResource(R.drawable.ic_triumfo);
            imageView28.setImageResource(R.drawable.ic_leyenda_tenacidad);
            imageView29.setImageResource(R.drawable.ic_derribado);
            imageView30.setImageResource(R.drawable.ic_pies_ligeros);
            imageView31.setImageResource(R.drawable.ic_claridad_mental);
            imageView32.setImageResource(R.drawable.ic_leyenda_linaje);
            imageView33.setImageResource(R.drawable.ic_ultimo_esfuerzo);
            imageView34.setImageResource(R.drawable.ic_derribado);
            imageView35.setImageResource(R.drawable.ic_derribado);
            imageView36.setImageResource(R.drawable.ic_derribado);
            imageView37.setImageResource(R.drawable.ic_derribado);
            imageView38.setImageResource(R.drawable.ic_derribado);
            imageView39.setImageResource(R.drawable.ic_derribado);
            imageView40.setImageResource(R.drawable.ic_derribado);
            imageView41.setImageResource(R.drawable.ic_derribado);
            imageView42.setImageResource(R.drawable.ic_derribado);

        }
        if (champId == 22)
        {
            this.setTitle(R.string.title_draven);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);

            toolbar.setNavigationOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(getApplicationContext(),MainActivity.class));
                    BuildActivity.this.finish();
                }
            });

            imageView1.setImageResource(R.drawable.ic_draven);
            textView1.setText("50,87 %");
            textView2.setText("Top");
            imageView2.setImageResource(R.drawable.ic_tabi_ninja);
            imageView3.setImageResource(R.drawable.ic_tabi_ninja);
            imageView4.setImageResource(R.drawable.ic_tabi_ninja);
            imageView5.setImageResource(R.drawable.ic_tabi_ninja);
            imageView6.setImageResource(R.drawable.ic_tabi_ninja);
            imageView7.setImageResource(R.drawable.ic_tabi_ninja);
            imageView8.setImageResource(R.drawable.ic_tabi_ninja);
            imageView9.setImageResource(R.drawable.ic_tabi_ninja);
            imageView10.setImageResource(R.drawable.ic_tabi_ninja);
            imageView11.setImageResource(R.drawable.ic_tabi_ninja);
            imageView12.setImageResource(R.drawable.ic_aatrox_lvl);
            imageView13.setImageResource(R.drawable.ic_precision_round);
            imageView14.setImageResource(R.drawable.ic_domination);
            imageView15.setImageResource(R.drawable.ic_brujeria);
            imageView16.setImageResource(R.drawable.ic_valor);
            imageView17.setImageResource(R.drawable.ic_inspiracion);
            imageView18.setImageResource(R.drawable.ic_domination);
            imageView19.setImageResource(R.drawable.ic_brujeria);
            imageView20.setImageResource(R.drawable.ic_valor_round);
            imageView21.setImageResource(R.drawable.ic_inspiracion);
            imageView22.setImageResource(R.drawable.ic_ataque_intesificado_round);
            imageView23.setImageResource(R.drawable.ic_super_curacion);
            imageView24.setImageResource(R.drawable.ic_leyenda_presteza);
            imageView25.setImageResource(R.drawable.ic_golpe_de_gracia);
            imageView26.setImageResource(R.drawable.ic_compas_letal);
            imageView27.setImageResource(R.drawable.ic_triumfo);
            imageView28.setImageResource(R.drawable.ic_leyenda_tenacidad);
            imageView29.setImageResource(R.drawable.ic_derribado);
            imageView30.setImageResource(R.drawable.ic_pies_ligeros);
            imageView31.setImageResource(R.drawable.ic_claridad_mental);
            imageView32.setImageResource(R.drawable.ic_leyenda_linaje);
            imageView33.setImageResource(R.drawable.ic_ultimo_esfuerzo);
            imageView34.setImageResource(R.drawable.ic_derribado);
            imageView35.setImageResource(R.drawable.ic_derribado);
            imageView36.setImageResource(R.drawable.ic_derribado);
            imageView37.setImageResource(R.drawable.ic_derribado);
            imageView38.setImageResource(R.drawable.ic_derribado);
            imageView39.setImageResource(R.drawable.ic_derribado);
            imageView40.setImageResource(R.drawable.ic_derribado);
            imageView41.setImageResource(R.drawable.ic_derribado);
            imageView42.setImageResource(R.drawable.ic_derribado);

        }
        if (champId == 23)
        {
            this.setTitle(R.string.title_ekko);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);

            toolbar.setNavigationOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(getApplicationContext(),MainActivity.class));
                    BuildActivity.this.finish();
                }
            });

            imageView1.setImageResource(R.drawable.ic_ekko);
            textView1.setText("50,87 %");
            textView2.setText("Top");
            imageView2.setImageResource(R.drawable.ic_tabi_ninja);
            imageView3.setImageResource(R.drawable.ic_tabi_ninja);
            imageView4.setImageResource(R.drawable.ic_tabi_ninja);
            imageView5.setImageResource(R.drawable.ic_tabi_ninja);
            imageView6.setImageResource(R.drawable.ic_tabi_ninja);
            imageView7.setImageResource(R.drawable.ic_tabi_ninja);
            imageView8.setImageResource(R.drawable.ic_tabi_ninja);
            imageView9.setImageResource(R.drawable.ic_tabi_ninja);
            imageView10.setImageResource(R.drawable.ic_tabi_ninja);
            imageView11.setImageResource(R.drawable.ic_tabi_ninja);
            imageView12.setImageResource(R.drawable.ic_aatrox_lvl);
            imageView13.setImageResource(R.drawable.ic_precision_round);
            imageView14.setImageResource(R.drawable.ic_domination);
            imageView15.setImageResource(R.drawable.ic_brujeria);
            imageView16.setImageResource(R.drawable.ic_valor);
            imageView17.setImageResource(R.drawable.ic_inspiracion);
            imageView18.setImageResource(R.drawable.ic_domination);
            imageView19.setImageResource(R.drawable.ic_brujeria);
            imageView20.setImageResource(R.drawable.ic_valor_round);
            imageView21.setImageResource(R.drawable.ic_inspiracion);
            imageView22.setImageResource(R.drawable.ic_ataque_intesificado_round);
            imageView23.setImageResource(R.drawable.ic_super_curacion);
            imageView24.setImageResource(R.drawable.ic_leyenda_presteza);
            imageView25.setImageResource(R.drawable.ic_golpe_de_gracia);
            imageView26.setImageResource(R.drawable.ic_compas_letal);
            imageView27.setImageResource(R.drawable.ic_triumfo);
            imageView28.setImageResource(R.drawable.ic_leyenda_tenacidad);
            imageView29.setImageResource(R.drawable.ic_derribado);
            imageView30.setImageResource(R.drawable.ic_pies_ligeros);
            imageView31.setImageResource(R.drawable.ic_claridad_mental);
            imageView32.setImageResource(R.drawable.ic_leyenda_linaje);
            imageView33.setImageResource(R.drawable.ic_ultimo_esfuerzo);
            imageView34.setImageResource(R.drawable.ic_derribado);
            imageView35.setImageResource(R.drawable.ic_derribado);
            imageView36.setImageResource(R.drawable.ic_derribado);
            imageView37.setImageResource(R.drawable.ic_derribado);
            imageView38.setImageResource(R.drawable.ic_derribado);
            imageView39.setImageResource(R.drawable.ic_derribado);
            imageView40.setImageResource(R.drawable.ic_derribado);
            imageView41.setImageResource(R.drawable.ic_derribado);
            imageView42.setImageResource(R.drawable.ic_derribado);

        }
        if (champId == 24)
        {
            this.setTitle(R.string.title_elise);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);

            toolbar.setNavigationOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(getApplicationContext(),MainActivity.class));
                    BuildActivity.this.finish();
                }
            });

            imageView1.setImageResource(R.drawable.ic_elise);
            textView1.setText("50,87 %");
            textView2.setText("Top");
            imageView2.setImageResource(R.drawable.ic_tabi_ninja);
            imageView3.setImageResource(R.drawable.ic_tabi_ninja);
            imageView4.setImageResource(R.drawable.ic_tabi_ninja);
            imageView5.setImageResource(R.drawable.ic_tabi_ninja);
            imageView6.setImageResource(R.drawable.ic_tabi_ninja);
            imageView7.setImageResource(R.drawable.ic_tabi_ninja);
            imageView8.setImageResource(R.drawable.ic_tabi_ninja);
            imageView9.setImageResource(R.drawable.ic_tabi_ninja);
            imageView10.setImageResource(R.drawable.ic_tabi_ninja);
            imageView11.setImageResource(R.drawable.ic_tabi_ninja);
            imageView12.setImageResource(R.drawable.ic_aatrox_lvl);
            imageView13.setImageResource(R.drawable.ic_precision_round);
            imageView14.setImageResource(R.drawable.ic_domination);
            imageView15.setImageResource(R.drawable.ic_brujeria);
            imageView16.setImageResource(R.drawable.ic_valor);
            imageView17.setImageResource(R.drawable.ic_inspiracion);
            imageView18.setImageResource(R.drawable.ic_domination);
            imageView19.setImageResource(R.drawable.ic_brujeria);
            imageView20.setImageResource(R.drawable.ic_valor_round);
            imageView21.setImageResource(R.drawable.ic_inspiracion);
            imageView22.setImageResource(R.drawable.ic_ataque_intesificado_round);
            imageView23.setImageResource(R.drawable.ic_super_curacion);
            imageView24.setImageResource(R.drawable.ic_leyenda_presteza);
            imageView25.setImageResource(R.drawable.ic_golpe_de_gracia);
            imageView26.setImageResource(R.drawable.ic_compas_letal);
            imageView27.setImageResource(R.drawable.ic_triumfo);
            imageView28.setImageResource(R.drawable.ic_leyenda_tenacidad);
            imageView29.setImageResource(R.drawable.ic_derribado);
            imageView30.setImageResource(R.drawable.ic_pies_ligeros);
            imageView31.setImageResource(R.drawable.ic_claridad_mental);
            imageView32.setImageResource(R.drawable.ic_leyenda_linaje);
            imageView33.setImageResource(R.drawable.ic_ultimo_esfuerzo);
            imageView34.setImageResource(R.drawable.ic_derribado);
            imageView35.setImageResource(R.drawable.ic_derribado);
            imageView36.setImageResource(R.drawable.ic_derribado);
            imageView37.setImageResource(R.drawable.ic_derribado);
            imageView38.setImageResource(R.drawable.ic_derribado);
            imageView39.setImageResource(R.drawable.ic_derribado);
            imageView40.setImageResource(R.drawable.ic_derribado);
            imageView41.setImageResource(R.drawable.ic_derribado);
            imageView42.setImageResource(R.drawable.ic_derribado);

        }
        if (champId == 25)
        {
            this.setTitle(R.string.title_evelynn);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);

            toolbar.setNavigationOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(getApplicationContext(),MainActivity.class));
                    BuildActivity.this.finish();
                }
            });

            imageView1.setImageResource(R.drawable.ic_evelynn);
            textView1.setText("50,87 %");
            textView2.setText("Top");
            imageView2.setImageResource(R.drawable.ic_tabi_ninja);
            imageView3.setImageResource(R.drawable.ic_tabi_ninja);
            imageView4.setImageResource(R.drawable.ic_tabi_ninja);
            imageView5.setImageResource(R.drawable.ic_tabi_ninja);
            imageView6.setImageResource(R.drawable.ic_tabi_ninja);
            imageView7.setImageResource(R.drawable.ic_tabi_ninja);
            imageView8.setImageResource(R.drawable.ic_tabi_ninja);
            imageView9.setImageResource(R.drawable.ic_tabi_ninja);
            imageView10.setImageResource(R.drawable.ic_tabi_ninja);
            imageView11.setImageResource(R.drawable.ic_tabi_ninja);
            imageView12.setImageResource(R.drawable.ic_aatrox_lvl);
            imageView13.setImageResource(R.drawable.ic_precision_round);
            imageView14.setImageResource(R.drawable.ic_domination);
            imageView15.setImageResource(R.drawable.ic_brujeria);
            imageView16.setImageResource(R.drawable.ic_valor);
            imageView17.setImageResource(R.drawable.ic_inspiracion);
            imageView18.setImageResource(R.drawable.ic_domination);
            imageView19.setImageResource(R.drawable.ic_brujeria);
            imageView20.setImageResource(R.drawable.ic_valor_round);
            imageView21.setImageResource(R.drawable.ic_inspiracion);
            imageView22.setImageResource(R.drawable.ic_ataque_intesificado_round);
            imageView23.setImageResource(R.drawable.ic_super_curacion);
            imageView24.setImageResource(R.drawable.ic_leyenda_presteza);
            imageView25.setImageResource(R.drawable.ic_golpe_de_gracia);
            imageView26.setImageResource(R.drawable.ic_compas_letal);
            imageView27.setImageResource(R.drawable.ic_triumfo);
            imageView28.setImageResource(R.drawable.ic_leyenda_tenacidad);
            imageView29.setImageResource(R.drawable.ic_derribado);
            imageView30.setImageResource(R.drawable.ic_pies_ligeros);
            imageView31.setImageResource(R.drawable.ic_claridad_mental);
            imageView32.setImageResource(R.drawable.ic_leyenda_linaje);
            imageView33.setImageResource(R.drawable.ic_ultimo_esfuerzo);
            imageView34.setImageResource(R.drawable.ic_derribado);
            imageView35.setImageResource(R.drawable.ic_derribado);
            imageView36.setImageResource(R.drawable.ic_derribado);
            imageView37.setImageResource(R.drawable.ic_derribado);
            imageView38.setImageResource(R.drawable.ic_derribado);
            imageView39.setImageResource(R.drawable.ic_derribado);
            imageView40.setImageResource(R.drawable.ic_derribado);
            imageView41.setImageResource(R.drawable.ic_derribado);
            imageView42.setImageResource(R.drawable.ic_derribado);

        }
        if (champId == 26)
        {
            this.setTitle(R.string.title_ezreal);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);

            toolbar.setNavigationOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(getApplicationContext(),MainActivity.class));
                    BuildActivity.this.finish();
                }
            });

            imageView1.setImageResource(R.drawable.ic_ezreal);
            textView1.setText("50,87 %");
            textView2.setText("Top");
            imageView2.setImageResource(R.drawable.ic_tabi_ninja);
            imageView3.setImageResource(R.drawable.ic_tabi_ninja);
            imageView4.setImageResource(R.drawable.ic_tabi_ninja);
            imageView5.setImageResource(R.drawable.ic_tabi_ninja);
            imageView6.setImageResource(R.drawable.ic_tabi_ninja);
            imageView7.setImageResource(R.drawable.ic_tabi_ninja);
            imageView8.setImageResource(R.drawable.ic_tabi_ninja);
            imageView9.setImageResource(R.drawable.ic_tabi_ninja);
            imageView10.setImageResource(R.drawable.ic_tabi_ninja);
            imageView11.setImageResource(R.drawable.ic_tabi_ninja);
            imageView12.setImageResource(R.drawable.ic_aatrox_lvl);
            imageView13.setImageResource(R.drawable.ic_precision_round);
            imageView14.setImageResource(R.drawable.ic_domination);
            imageView15.setImageResource(R.drawable.ic_brujeria);
            imageView16.setImageResource(R.drawable.ic_valor);
            imageView17.setImageResource(R.drawable.ic_inspiracion);
            imageView18.setImageResource(R.drawable.ic_domination);
            imageView19.setImageResource(R.drawable.ic_brujeria);
            imageView20.setImageResource(R.drawable.ic_valor_round);
            imageView21.setImageResource(R.drawable.ic_inspiracion);
            imageView22.setImageResource(R.drawable.ic_ataque_intesificado_round);
            imageView23.setImageResource(R.drawable.ic_super_curacion);
            imageView24.setImageResource(R.drawable.ic_leyenda_presteza);
            imageView25.setImageResource(R.drawable.ic_golpe_de_gracia);
            imageView26.setImageResource(R.drawable.ic_compas_letal);
            imageView27.setImageResource(R.drawable.ic_triumfo);
            imageView28.setImageResource(R.drawable.ic_leyenda_tenacidad);
            imageView29.setImageResource(R.drawable.ic_derribado);
            imageView30.setImageResource(R.drawable.ic_pies_ligeros);
            imageView31.setImageResource(R.drawable.ic_claridad_mental);
            imageView32.setImageResource(R.drawable.ic_leyenda_linaje);
            imageView33.setImageResource(R.drawable.ic_ultimo_esfuerzo);
            imageView34.setImageResource(R.drawable.ic_derribado);
            imageView35.setImageResource(R.drawable.ic_derribado);
            imageView36.setImageResource(R.drawable.ic_derribado);
            imageView37.setImageResource(R.drawable.ic_derribado);
            imageView38.setImageResource(R.drawable.ic_derribado);
            imageView39.setImageResource(R.drawable.ic_derribado);
            imageView40.setImageResource(R.drawable.ic_derribado);
            imageView41.setImageResource(R.drawable.ic_derribado);
            imageView42.setImageResource(R.drawable.ic_derribado);

        }
        if (champId == 27)
        {
            this.setTitle(R.string.title_fiddlesticks);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);

            toolbar.setNavigationOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(getApplicationContext(),MainActivity.class));
                    BuildActivity.this.finish();
                }
            });

            imageView1.setImageResource(R.drawable.ic_fiddlesticks);
            textView1.setText("50,87 %");
            textView2.setText("Top");
            imageView2.setImageResource(R.drawable.ic_tabi_ninja);
            imageView3.setImageResource(R.drawable.ic_tabi_ninja);
            imageView4.setImageResource(R.drawable.ic_tabi_ninja);
            imageView5.setImageResource(R.drawable.ic_tabi_ninja);
            imageView6.setImageResource(R.drawable.ic_tabi_ninja);
            imageView7.setImageResource(R.drawable.ic_tabi_ninja);
            imageView8.setImageResource(R.drawable.ic_tabi_ninja);
            imageView9.setImageResource(R.drawable.ic_tabi_ninja);
            imageView10.setImageResource(R.drawable.ic_tabi_ninja);
            imageView11.setImageResource(R.drawable.ic_tabi_ninja);
            imageView12.setImageResource(R.drawable.ic_aatrox_lvl);
            imageView13.setImageResource(R.drawable.ic_precision_round);
            imageView14.setImageResource(R.drawable.ic_domination);
            imageView15.setImageResource(R.drawable.ic_brujeria);
            imageView16.setImageResource(R.drawable.ic_valor);
            imageView17.setImageResource(R.drawable.ic_inspiracion);
            imageView18.setImageResource(R.drawable.ic_domination);
            imageView19.setImageResource(R.drawable.ic_brujeria);
            imageView20.setImageResource(R.drawable.ic_valor_round);
            imageView21.setImageResource(R.drawable.ic_inspiracion);
            imageView22.setImageResource(R.drawable.ic_ataque_intesificado_round);
            imageView23.setImageResource(R.drawable.ic_super_curacion);
            imageView24.setImageResource(R.drawable.ic_leyenda_presteza);
            imageView25.setImageResource(R.drawable.ic_golpe_de_gracia);
            imageView26.setImageResource(R.drawable.ic_compas_letal);
            imageView27.setImageResource(R.drawable.ic_triumfo);
            imageView28.setImageResource(R.drawable.ic_leyenda_tenacidad);
            imageView29.setImageResource(R.drawable.ic_derribado);
            imageView30.setImageResource(R.drawable.ic_pies_ligeros);
            imageView31.setImageResource(R.drawable.ic_claridad_mental);
            imageView32.setImageResource(R.drawable.ic_leyenda_linaje);
            imageView33.setImageResource(R.drawable.ic_ultimo_esfuerzo);
            imageView34.setImageResource(R.drawable.ic_derribado);
            imageView35.setImageResource(R.drawable.ic_derribado);
            imageView36.setImageResource(R.drawable.ic_derribado);
            imageView37.setImageResource(R.drawable.ic_derribado);
            imageView38.setImageResource(R.drawable.ic_derribado);
            imageView39.setImageResource(R.drawable.ic_derribado);
            imageView40.setImageResource(R.drawable.ic_derribado);
            imageView41.setImageResource(R.drawable.ic_derribado);
            imageView42.setImageResource(R.drawable.ic_derribado);

        }
        if (champId == 28)
        {
            this.setTitle(R.string.title_fiora);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);

            toolbar.setNavigationOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(getApplicationContext(),MainActivity.class));
                    BuildActivity.this.finish();
                }
            });

            imageView1.setImageResource(R.drawable.ic_fiora);
            textView1.setText("50,87 %");
            textView2.setText("Top");
            imageView2.setImageResource(R.drawable.ic_tabi_ninja);
            imageView3.setImageResource(R.drawable.ic_tabi_ninja);
            imageView4.setImageResource(R.drawable.ic_tabi_ninja);
            imageView5.setImageResource(R.drawable.ic_tabi_ninja);
            imageView6.setImageResource(R.drawable.ic_tabi_ninja);
            imageView7.setImageResource(R.drawable.ic_tabi_ninja);
            imageView8.setImageResource(R.drawable.ic_tabi_ninja);
            imageView9.setImageResource(R.drawable.ic_tabi_ninja);
            imageView10.setImageResource(R.drawable.ic_tabi_ninja);
            imageView11.setImageResource(R.drawable.ic_tabi_ninja);
            imageView12.setImageResource(R.drawable.ic_aatrox_lvl);
            imageView13.setImageResource(R.drawable.ic_precision_round);
            imageView14.setImageResource(R.drawable.ic_domination);
            imageView15.setImageResource(R.drawable.ic_brujeria);
            imageView16.setImageResource(R.drawable.ic_valor);
            imageView17.setImageResource(R.drawable.ic_inspiracion);
            imageView18.setImageResource(R.drawable.ic_domination);
            imageView19.setImageResource(R.drawable.ic_brujeria);
            imageView20.setImageResource(R.drawable.ic_valor_round);
            imageView21.setImageResource(R.drawable.ic_inspiracion);
            imageView22.setImageResource(R.drawable.ic_ataque_intesificado_round);
            imageView23.setImageResource(R.drawable.ic_super_curacion);
            imageView24.setImageResource(R.drawable.ic_leyenda_presteza);
            imageView25.setImageResource(R.drawable.ic_golpe_de_gracia);
            imageView26.setImageResource(R.drawable.ic_compas_letal);
            imageView27.setImageResource(R.drawable.ic_triumfo);
            imageView28.setImageResource(R.drawable.ic_leyenda_tenacidad);
            imageView29.setImageResource(R.drawable.ic_derribado);
            imageView30.setImageResource(R.drawable.ic_pies_ligeros);
            imageView31.setImageResource(R.drawable.ic_claridad_mental);
            imageView32.setImageResource(R.drawable.ic_leyenda_linaje);
            imageView33.setImageResource(R.drawable.ic_ultimo_esfuerzo);
            imageView34.setImageResource(R.drawable.ic_derribado);
            imageView35.setImageResource(R.drawable.ic_derribado);
            imageView36.setImageResource(R.drawable.ic_derribado);
            imageView37.setImageResource(R.drawable.ic_derribado);
            imageView38.setImageResource(R.drawable.ic_derribado);
            imageView39.setImageResource(R.drawable.ic_derribado);
            imageView40.setImageResource(R.drawable.ic_derribado);
            imageView41.setImageResource(R.drawable.ic_derribado);
            imageView42.setImageResource(R.drawable.ic_derribado);

        }
        if (champId == 29)
        {
            this.setTitle(R.string.title_fizz);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);

            toolbar.setNavigationOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(getApplicationContext(),MainActivity.class));
                    BuildActivity.this.finish();
                }
            });

            imageView1.setImageResource(R.drawable.ic_fizz);
            textView1.setText("50,87 %");
            textView2.setText("Top");
            imageView2.setImageResource(R.drawable.ic_tabi_ninja);
            imageView3.setImageResource(R.drawable.ic_tabi_ninja);
            imageView4.setImageResource(R.drawable.ic_tabi_ninja);
            imageView5.setImageResource(R.drawable.ic_tabi_ninja);
            imageView6.setImageResource(R.drawable.ic_tabi_ninja);
            imageView7.setImageResource(R.drawable.ic_tabi_ninja);
            imageView8.setImageResource(R.drawable.ic_tabi_ninja);
            imageView9.setImageResource(R.drawable.ic_tabi_ninja);
            imageView10.setImageResource(R.drawable.ic_tabi_ninja);
            imageView11.setImageResource(R.drawable.ic_tabi_ninja);
            imageView12.setImageResource(R.drawable.ic_aatrox_lvl);
            imageView13.setImageResource(R.drawable.ic_precision_round);
            imageView14.setImageResource(R.drawable.ic_domination);
            imageView15.setImageResource(R.drawable.ic_brujeria);
            imageView16.setImageResource(R.drawable.ic_valor);
            imageView17.setImageResource(R.drawable.ic_inspiracion);
            imageView18.setImageResource(R.drawable.ic_domination);
            imageView19.setImageResource(R.drawable.ic_brujeria);
            imageView20.setImageResource(R.drawable.ic_valor_round);
            imageView21.setImageResource(R.drawable.ic_inspiracion);
            imageView22.setImageResource(R.drawable.ic_ataque_intesificado_round);
            imageView23.setImageResource(R.drawable.ic_super_curacion);
            imageView24.setImageResource(R.drawable.ic_leyenda_presteza);
            imageView25.setImageResource(R.drawable.ic_golpe_de_gracia);
            imageView26.setImageResource(R.drawable.ic_compas_letal);
            imageView27.setImageResource(R.drawable.ic_triumfo);
            imageView28.setImageResource(R.drawable.ic_leyenda_tenacidad);
            imageView29.setImageResource(R.drawable.ic_derribado);
            imageView30.setImageResource(R.drawable.ic_pies_ligeros);
            imageView31.setImageResource(R.drawable.ic_claridad_mental);
            imageView32.setImageResource(R.drawable.ic_leyenda_linaje);
            imageView33.setImageResource(R.drawable.ic_ultimo_esfuerzo);
            imageView34.setImageResource(R.drawable.ic_derribado);
            imageView35.setImageResource(R.drawable.ic_derribado);
            imageView36.setImageResource(R.drawable.ic_derribado);
            imageView37.setImageResource(R.drawable.ic_derribado);
            imageView38.setImageResource(R.drawable.ic_derribado);
            imageView39.setImageResource(R.drawable.ic_derribado);
            imageView40.setImageResource(R.drawable.ic_derribado);
            imageView41.setImageResource(R.drawable.ic_derribado);
            imageView42.setImageResource(R.drawable.ic_derribado);

        }
        if (champId == 30)
        {
            this.setTitle(R.string.title_galio);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);

            toolbar.setNavigationOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(getApplicationContext(),MainActivity.class));
                    BuildActivity.this.finish();
                }
            });

            imageView1.setImageResource(R.drawable.ic_galio);
            textView1.setText("50,87 %");
            textView2.setText("Top");
            imageView2.setImageResource(R.drawable.ic_tabi_ninja);
            imageView3.setImageResource(R.drawable.ic_tabi_ninja);
            imageView4.setImageResource(R.drawable.ic_tabi_ninja);
            imageView5.setImageResource(R.drawable.ic_tabi_ninja);
            imageView6.setImageResource(R.drawable.ic_tabi_ninja);
            imageView7.setImageResource(R.drawable.ic_tabi_ninja);
            imageView8.setImageResource(R.drawable.ic_tabi_ninja);
            imageView9.setImageResource(R.drawable.ic_tabi_ninja);
            imageView10.setImageResource(R.drawable.ic_tabi_ninja);
            imageView11.setImageResource(R.drawable.ic_tabi_ninja);
            imageView12.setImageResource(R.drawable.ic_aatrox_lvl);
            imageView13.setImageResource(R.drawable.ic_precision_round);
            imageView14.setImageResource(R.drawable.ic_domination);
            imageView15.setImageResource(R.drawable.ic_brujeria);
            imageView16.setImageResource(R.drawable.ic_valor);
            imageView17.setImageResource(R.drawable.ic_inspiracion);
            imageView18.setImageResource(R.drawable.ic_domination);
            imageView19.setImageResource(R.drawable.ic_brujeria);
            imageView20.setImageResource(R.drawable.ic_valor_round);
            imageView21.setImageResource(R.drawable.ic_inspiracion);
            imageView22.setImageResource(R.drawable.ic_ataque_intesificado_round);
            imageView23.setImageResource(R.drawable.ic_super_curacion);
            imageView24.setImageResource(R.drawable.ic_leyenda_presteza);
            imageView25.setImageResource(R.drawable.ic_golpe_de_gracia);
            imageView26.setImageResource(R.drawable.ic_compas_letal);
            imageView27.setImageResource(R.drawable.ic_triumfo);
            imageView28.setImageResource(R.drawable.ic_leyenda_tenacidad);
            imageView29.setImageResource(R.drawable.ic_derribado);
            imageView30.setImageResource(R.drawable.ic_pies_ligeros);
            imageView31.setImageResource(R.drawable.ic_claridad_mental);
            imageView32.setImageResource(R.drawable.ic_leyenda_linaje);
            imageView33.setImageResource(R.drawable.ic_ultimo_esfuerzo);
            imageView34.setImageResource(R.drawable.ic_derribado);
            imageView35.setImageResource(R.drawable.ic_derribado);
            imageView36.setImageResource(R.drawable.ic_derribado);
            imageView37.setImageResource(R.drawable.ic_derribado);
            imageView38.setImageResource(R.drawable.ic_derribado);
            imageView39.setImageResource(R.drawable.ic_derribado);
            imageView40.setImageResource(R.drawable.ic_derribado);
            imageView41.setImageResource(R.drawable.ic_derribado);
            imageView42.setImageResource(R.drawable.ic_derribado);

        }
        if (champId == 31)
        {
            this.setTitle(R.string.title_gangplank);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);

            toolbar.setNavigationOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(getApplicationContext(),MainActivity.class));
                    BuildActivity.this.finish();
                }
            });

            imageView1.setImageResource(R.drawable.ic_gangplank);
            textView1.setText("50,87 %");
            textView2.setText("Top");
            imageView2.setImageResource(R.drawable.ic_tabi_ninja);
            imageView3.setImageResource(R.drawable.ic_tabi_ninja);
            imageView4.setImageResource(R.drawable.ic_tabi_ninja);
            imageView5.setImageResource(R.drawable.ic_tabi_ninja);
            imageView6.setImageResource(R.drawable.ic_tabi_ninja);
            imageView7.setImageResource(R.drawable.ic_tabi_ninja);
            imageView8.setImageResource(R.drawable.ic_tabi_ninja);
            imageView9.setImageResource(R.drawable.ic_tabi_ninja);
            imageView10.setImageResource(R.drawable.ic_tabi_ninja);
            imageView11.setImageResource(R.drawable.ic_tabi_ninja);
            imageView12.setImageResource(R.drawable.ic_aatrox_lvl);
            imageView13.setImageResource(R.drawable.ic_precision_round);
            imageView14.setImageResource(R.drawable.ic_domination);
            imageView15.setImageResource(R.drawable.ic_brujeria);
            imageView16.setImageResource(R.drawable.ic_valor);
            imageView17.setImageResource(R.drawable.ic_inspiracion);
            imageView18.setImageResource(R.drawable.ic_domination);
            imageView19.setImageResource(R.drawable.ic_brujeria);
            imageView20.setImageResource(R.drawable.ic_valor_round);
            imageView21.setImageResource(R.drawable.ic_inspiracion);
            imageView22.setImageResource(R.drawable.ic_ataque_intesificado_round);
            imageView23.setImageResource(R.drawable.ic_super_curacion);
            imageView24.setImageResource(R.drawable.ic_leyenda_presteza);
            imageView25.setImageResource(R.drawable.ic_golpe_de_gracia);
            imageView26.setImageResource(R.drawable.ic_compas_letal);
            imageView27.setImageResource(R.drawable.ic_triumfo);
            imageView28.setImageResource(R.drawable.ic_leyenda_tenacidad);
            imageView29.setImageResource(R.drawable.ic_derribado);
            imageView30.setImageResource(R.drawable.ic_pies_ligeros);
            imageView31.setImageResource(R.drawable.ic_claridad_mental);
            imageView32.setImageResource(R.drawable.ic_leyenda_linaje);
            imageView33.setImageResource(R.drawable.ic_ultimo_esfuerzo);
            imageView34.setImageResource(R.drawable.ic_derribado);
            imageView35.setImageResource(R.drawable.ic_derribado);
            imageView36.setImageResource(R.drawable.ic_derribado);
            imageView37.setImageResource(R.drawable.ic_derribado);
            imageView38.setImageResource(R.drawable.ic_derribado);
            imageView39.setImageResource(R.drawable.ic_derribado);
            imageView40.setImageResource(R.drawable.ic_derribado);
            imageView41.setImageResource(R.drawable.ic_derribado);
            imageView42.setImageResource(R.drawable.ic_derribado);

        }
        if (champId == 32)
        {
            this.setTitle(R.string.title_garen);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);

            toolbar.setNavigationOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(getApplicationContext(),MainActivity.class));
                    BuildActivity.this.finish();
                }
            });

            imageView1.setImageResource(R.drawable.ic_garen);
            textView1.setText("50,87 %");
            textView2.setText("Top");
            imageView2.setImageResource(R.drawable.ic_tabi_ninja);
            imageView3.setImageResource(R.drawable.ic_tabi_ninja);
            imageView4.setImageResource(R.drawable.ic_tabi_ninja);
            imageView5.setImageResource(R.drawable.ic_tabi_ninja);
            imageView6.setImageResource(R.drawable.ic_tabi_ninja);
            imageView7.setImageResource(R.drawable.ic_tabi_ninja);
            imageView8.setImageResource(R.drawable.ic_tabi_ninja);
            imageView9.setImageResource(R.drawable.ic_tabi_ninja);
            imageView10.setImageResource(R.drawable.ic_tabi_ninja);
            imageView11.setImageResource(R.drawable.ic_tabi_ninja);
            imageView12.setImageResource(R.drawable.ic_aatrox_lvl);
            imageView13.setImageResource(R.drawable.ic_precision_round);
            imageView14.setImageResource(R.drawable.ic_domination);
            imageView15.setImageResource(R.drawable.ic_brujeria);
            imageView16.setImageResource(R.drawable.ic_valor);
            imageView17.setImageResource(R.drawable.ic_inspiracion);
            imageView18.setImageResource(R.drawable.ic_domination);
            imageView19.setImageResource(R.drawable.ic_brujeria);
            imageView20.setImageResource(R.drawable.ic_valor_round);
            imageView21.setImageResource(R.drawable.ic_inspiracion);
            imageView22.setImageResource(R.drawable.ic_ataque_intesificado_round);
            imageView23.setImageResource(R.drawable.ic_super_curacion);
            imageView24.setImageResource(R.drawable.ic_leyenda_presteza);
            imageView25.setImageResource(R.drawable.ic_golpe_de_gracia);
            imageView26.setImageResource(R.drawable.ic_compas_letal);
            imageView27.setImageResource(R.drawable.ic_triumfo);
            imageView28.setImageResource(R.drawable.ic_leyenda_tenacidad);
            imageView29.setImageResource(R.drawable.ic_derribado);
            imageView30.setImageResource(R.drawable.ic_pies_ligeros);
            imageView31.setImageResource(R.drawable.ic_claridad_mental);
            imageView32.setImageResource(R.drawable.ic_leyenda_linaje);
            imageView33.setImageResource(R.drawable.ic_ultimo_esfuerzo);
            imageView34.setImageResource(R.drawable.ic_derribado);
            imageView35.setImageResource(R.drawable.ic_derribado);
            imageView36.setImageResource(R.drawable.ic_derribado);
            imageView37.setImageResource(R.drawable.ic_derribado);
            imageView38.setImageResource(R.drawable.ic_derribado);
            imageView39.setImageResource(R.drawable.ic_derribado);
            imageView40.setImageResource(R.drawable.ic_derribado);
            imageView41.setImageResource(R.drawable.ic_derribado);
            imageView42.setImageResource(R.drawable.ic_derribado);

        }
        if (champId == 33)
        {
            this.setTitle(R.string.title_gnar);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);

            toolbar.setNavigationOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(getApplicationContext(),MainActivity.class));
                    BuildActivity.this.finish();
                }
            });

            imageView1.setImageResource(R.drawable.ic_gnar);
            textView1.setText("50,87 %");
            textView2.setText("Top");
            imageView2.setImageResource(R.drawable.ic_tabi_ninja);
            imageView3.setImageResource(R.drawable.ic_tabi_ninja);
            imageView4.setImageResource(R.drawable.ic_tabi_ninja);
            imageView5.setImageResource(R.drawable.ic_tabi_ninja);
            imageView6.setImageResource(R.drawable.ic_tabi_ninja);
            imageView7.setImageResource(R.drawable.ic_tabi_ninja);
            imageView8.setImageResource(R.drawable.ic_tabi_ninja);
            imageView9.setImageResource(R.drawable.ic_tabi_ninja);
            imageView10.setImageResource(R.drawable.ic_tabi_ninja);
            imageView11.setImageResource(R.drawable.ic_tabi_ninja);
            imageView12.setImageResource(R.drawable.ic_aatrox_lvl);
            imageView13.setImageResource(R.drawable.ic_precision_round);
            imageView14.setImageResource(R.drawable.ic_domination);
            imageView15.setImageResource(R.drawable.ic_brujeria);
            imageView16.setImageResource(R.drawable.ic_valor);
            imageView17.setImageResource(R.drawable.ic_inspiracion);
            imageView18.setImageResource(R.drawable.ic_domination);
            imageView19.setImageResource(R.drawable.ic_brujeria);
            imageView20.setImageResource(R.drawable.ic_valor_round);
            imageView21.setImageResource(R.drawable.ic_inspiracion);
            imageView22.setImageResource(R.drawable.ic_ataque_intesificado_round);
            imageView23.setImageResource(R.drawable.ic_super_curacion);
            imageView24.setImageResource(R.drawable.ic_leyenda_presteza);
            imageView25.setImageResource(R.drawable.ic_golpe_de_gracia);
            imageView26.setImageResource(R.drawable.ic_compas_letal);
            imageView27.setImageResource(R.drawable.ic_triumfo);
            imageView28.setImageResource(R.drawable.ic_leyenda_tenacidad);
            imageView29.setImageResource(R.drawable.ic_derribado);
            imageView30.setImageResource(R.drawable.ic_pies_ligeros);
            imageView31.setImageResource(R.drawable.ic_claridad_mental);
            imageView32.setImageResource(R.drawable.ic_leyenda_linaje);
            imageView33.setImageResource(R.drawable.ic_ultimo_esfuerzo);
            imageView34.setImageResource(R.drawable.ic_derribado);
            imageView35.setImageResource(R.drawable.ic_derribado);
            imageView36.setImageResource(R.drawable.ic_derribado);
            imageView37.setImageResource(R.drawable.ic_derribado);
            imageView38.setImageResource(R.drawable.ic_derribado);
            imageView39.setImageResource(R.drawable.ic_derribado);
            imageView40.setImageResource(R.drawable.ic_derribado);
            imageView41.setImageResource(R.drawable.ic_derribado);
            imageView42.setImageResource(R.drawable.ic_derribado);

        }
        if (champId == 34)
        {
            this.setTitle(R.string.title_gragas);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);

            toolbar.setNavigationOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(getApplicationContext(),MainActivity.class));
                    BuildActivity.this.finish();
                }
            });

            imageView1.setImageResource(R.drawable.ic_gragas);
            textView1.setText("50,87 %");
            textView2.setText("Top");
            imageView2.setImageResource(R.drawable.ic_tabi_ninja);
            imageView3.setImageResource(R.drawable.ic_tabi_ninja);
            imageView4.setImageResource(R.drawable.ic_tabi_ninja);
            imageView5.setImageResource(R.drawable.ic_tabi_ninja);
            imageView6.setImageResource(R.drawable.ic_tabi_ninja);
            imageView7.setImageResource(R.drawable.ic_tabi_ninja);
            imageView8.setImageResource(R.drawable.ic_tabi_ninja);
            imageView9.setImageResource(R.drawable.ic_tabi_ninja);
            imageView10.setImageResource(R.drawable.ic_tabi_ninja);
            imageView11.setImageResource(R.drawable.ic_tabi_ninja);
            imageView12.setImageResource(R.drawable.ic_aatrox_lvl);
            imageView13.setImageResource(R.drawable.ic_precision_round);
            imageView14.setImageResource(R.drawable.ic_domination);
            imageView15.setImageResource(R.drawable.ic_brujeria);
            imageView16.setImageResource(R.drawable.ic_valor);
            imageView17.setImageResource(R.drawable.ic_inspiracion);
            imageView18.setImageResource(R.drawable.ic_domination);
            imageView19.setImageResource(R.drawable.ic_brujeria);
            imageView20.setImageResource(R.drawable.ic_valor_round);
            imageView21.setImageResource(R.drawable.ic_inspiracion);
            imageView22.setImageResource(R.drawable.ic_ataque_intesificado_round);
            imageView23.setImageResource(R.drawable.ic_super_curacion);
            imageView24.setImageResource(R.drawable.ic_leyenda_presteza);
            imageView25.setImageResource(R.drawable.ic_golpe_de_gracia);
            imageView26.setImageResource(R.drawable.ic_compas_letal);
            imageView27.setImageResource(R.drawable.ic_triumfo);
            imageView28.setImageResource(R.drawable.ic_leyenda_tenacidad);
            imageView29.setImageResource(R.drawable.ic_derribado);
            imageView30.setImageResource(R.drawable.ic_pies_ligeros);
            imageView31.setImageResource(R.drawable.ic_claridad_mental);
            imageView32.setImageResource(R.drawable.ic_leyenda_linaje);
            imageView33.setImageResource(R.drawable.ic_ultimo_esfuerzo);
            imageView34.setImageResource(R.drawable.ic_derribado);
            imageView35.setImageResource(R.drawable.ic_derribado);
            imageView36.setImageResource(R.drawable.ic_derribado);
            imageView37.setImageResource(R.drawable.ic_derribado);
            imageView38.setImageResource(R.drawable.ic_derribado);
            imageView39.setImageResource(R.drawable.ic_derribado);
            imageView40.setImageResource(R.drawable.ic_derribado);
            imageView41.setImageResource(R.drawable.ic_derribado);
            imageView42.setImageResource(R.drawable.ic_derribado);

        }
        if (champId == 35)
        {
            this.setTitle(R.string.title_graves);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);

            toolbar.setNavigationOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(getApplicationContext(),MainActivity.class));
                    BuildActivity.this.finish();
                }
            });

            imageView1.setImageResource(R.drawable.ic_graves);
            textView1.setText("50,87 %");
            textView2.setText("Top");
            imageView2.setImageResource(R.drawable.ic_tabi_ninja);
            imageView3.setImageResource(R.drawable.ic_tabi_ninja);
            imageView4.setImageResource(R.drawable.ic_tabi_ninja);
            imageView5.setImageResource(R.drawable.ic_tabi_ninja);
            imageView6.setImageResource(R.drawable.ic_tabi_ninja);
            imageView7.setImageResource(R.drawable.ic_tabi_ninja);
            imageView8.setImageResource(R.drawable.ic_tabi_ninja);
            imageView9.setImageResource(R.drawable.ic_tabi_ninja);
            imageView10.setImageResource(R.drawable.ic_tabi_ninja);
            imageView11.setImageResource(R.drawable.ic_tabi_ninja);
            imageView12.setImageResource(R.drawable.ic_aatrox_lvl);
            imageView13.setImageResource(R.drawable.ic_precision_round);
            imageView14.setImageResource(R.drawable.ic_domination);
            imageView15.setImageResource(R.drawable.ic_brujeria);
            imageView16.setImageResource(R.drawable.ic_valor);
            imageView17.setImageResource(R.drawable.ic_inspiracion);
            imageView18.setImageResource(R.drawable.ic_domination);
            imageView19.setImageResource(R.drawable.ic_brujeria);
            imageView20.setImageResource(R.drawable.ic_valor_round);
            imageView21.setImageResource(R.drawable.ic_inspiracion);
            imageView22.setImageResource(R.drawable.ic_ataque_intesificado_round);
            imageView23.setImageResource(R.drawable.ic_super_curacion);
            imageView24.setImageResource(R.drawable.ic_leyenda_presteza);
            imageView25.setImageResource(R.drawable.ic_golpe_de_gracia);
            imageView26.setImageResource(R.drawable.ic_compas_letal);
            imageView27.setImageResource(R.drawable.ic_triumfo);
            imageView28.setImageResource(R.drawable.ic_leyenda_tenacidad);
            imageView29.setImageResource(R.drawable.ic_derribado);
            imageView30.setImageResource(R.drawable.ic_pies_ligeros);
            imageView31.setImageResource(R.drawable.ic_claridad_mental);
            imageView32.setImageResource(R.drawable.ic_leyenda_linaje);
            imageView33.setImageResource(R.drawable.ic_ultimo_esfuerzo);
            imageView34.setImageResource(R.drawable.ic_derribado);
            imageView35.setImageResource(R.drawable.ic_derribado);
            imageView36.setImageResource(R.drawable.ic_derribado);
            imageView37.setImageResource(R.drawable.ic_derribado);
            imageView38.setImageResource(R.drawable.ic_derribado);
            imageView39.setImageResource(R.drawable.ic_derribado);
            imageView40.setImageResource(R.drawable.ic_derribado);
            imageView41.setImageResource(R.drawable.ic_derribado);
            imageView42.setImageResource(R.drawable.ic_derribado);

        }
        if (champId == 36)
        {
            this.setTitle(R.string.title_hecarim);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);

            toolbar.setNavigationOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(getApplicationContext(),MainActivity.class));
                    BuildActivity.this.finish();
                }
            });

            imageView1.setImageResource(R.drawable.ic_hecarim);
            textView1.setText("50,87 %");
            textView2.setText("Top");
            imageView2.setImageResource(R.drawable.ic_tabi_ninja);
            imageView3.setImageResource(R.drawable.ic_tabi_ninja);
            imageView4.setImageResource(R.drawable.ic_tabi_ninja);
            imageView5.setImageResource(R.drawable.ic_tabi_ninja);
            imageView6.setImageResource(R.drawable.ic_tabi_ninja);
            imageView7.setImageResource(R.drawable.ic_tabi_ninja);
            imageView8.setImageResource(R.drawable.ic_tabi_ninja);
            imageView9.setImageResource(R.drawable.ic_tabi_ninja);
            imageView10.setImageResource(R.drawable.ic_tabi_ninja);
            imageView11.setImageResource(R.drawable.ic_tabi_ninja);
            imageView12.setImageResource(R.drawable.ic_aatrox_lvl);
            imageView13.setImageResource(R.drawable.ic_precision_round);
            imageView14.setImageResource(R.drawable.ic_domination);
            imageView15.setImageResource(R.drawable.ic_brujeria);
            imageView16.setImageResource(R.drawable.ic_valor);
            imageView17.setImageResource(R.drawable.ic_inspiracion);
            imageView18.setImageResource(R.drawable.ic_domination);
            imageView19.setImageResource(R.drawable.ic_brujeria);
            imageView20.setImageResource(R.drawable.ic_valor_round);
            imageView21.setImageResource(R.drawable.ic_inspiracion);
            imageView22.setImageResource(R.drawable.ic_ataque_intesificado_round);
            imageView23.setImageResource(R.drawable.ic_super_curacion);
            imageView24.setImageResource(R.drawable.ic_leyenda_presteza);
            imageView25.setImageResource(R.drawable.ic_golpe_de_gracia);
            imageView26.setImageResource(R.drawable.ic_compas_letal);
            imageView27.setImageResource(R.drawable.ic_triumfo);
            imageView28.setImageResource(R.drawable.ic_leyenda_tenacidad);
            imageView29.setImageResource(R.drawable.ic_derribado);
            imageView30.setImageResource(R.drawable.ic_pies_ligeros);
            imageView31.setImageResource(R.drawable.ic_claridad_mental);
            imageView32.setImageResource(R.drawable.ic_leyenda_linaje);
            imageView33.setImageResource(R.drawable.ic_ultimo_esfuerzo);
            imageView34.setImageResource(R.drawable.ic_derribado);
            imageView35.setImageResource(R.drawable.ic_derribado);
            imageView36.setImageResource(R.drawable.ic_derribado);
            imageView37.setImageResource(R.drawable.ic_derribado);
            imageView38.setImageResource(R.drawable.ic_derribado);
            imageView39.setImageResource(R.drawable.ic_derribado);
            imageView40.setImageResource(R.drawable.ic_derribado);
            imageView41.setImageResource(R.drawable.ic_derribado);
            imageView42.setImageResource(R.drawable.ic_derribado);

        }
        if (champId == 37)
        {
            this.setTitle(R.string.title_heimerdinger);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);

            toolbar.setNavigationOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(getApplicationContext(),MainActivity.class));
                    BuildActivity.this.finish();
                }
            });

            imageView1.setImageResource(R.drawable.ic_heimerdinger);
            textView1.setText("50,87 %");
            textView2.setText("Top");
            imageView2.setImageResource(R.drawable.ic_tabi_ninja);
            imageView3.setImageResource(R.drawable.ic_tabi_ninja);
            imageView4.setImageResource(R.drawable.ic_tabi_ninja);
            imageView5.setImageResource(R.drawable.ic_tabi_ninja);
            imageView6.setImageResource(R.drawable.ic_tabi_ninja);
            imageView7.setImageResource(R.drawable.ic_tabi_ninja);
            imageView8.setImageResource(R.drawable.ic_tabi_ninja);
            imageView9.setImageResource(R.drawable.ic_tabi_ninja);
            imageView10.setImageResource(R.drawable.ic_tabi_ninja);
            imageView11.setImageResource(R.drawable.ic_tabi_ninja);
            imageView12.setImageResource(R.drawable.ic_aatrox_lvl);
            imageView13.setImageResource(R.drawable.ic_precision_round);
            imageView14.setImageResource(R.drawable.ic_domination);
            imageView15.setImageResource(R.drawable.ic_brujeria);
            imageView16.setImageResource(R.drawable.ic_valor);
            imageView17.setImageResource(R.drawable.ic_inspiracion);
            imageView18.setImageResource(R.drawable.ic_domination);
            imageView19.setImageResource(R.drawable.ic_brujeria);
            imageView20.setImageResource(R.drawable.ic_valor_round);
            imageView21.setImageResource(R.drawable.ic_inspiracion);
            imageView22.setImageResource(R.drawable.ic_ataque_intesificado_round);
            imageView23.setImageResource(R.drawable.ic_super_curacion);
            imageView24.setImageResource(R.drawable.ic_leyenda_presteza);
            imageView25.setImageResource(R.drawable.ic_golpe_de_gracia);
            imageView26.setImageResource(R.drawable.ic_compas_letal);
            imageView27.setImageResource(R.drawable.ic_triumfo);
            imageView28.setImageResource(R.drawable.ic_leyenda_tenacidad);
            imageView29.setImageResource(R.drawable.ic_derribado);
            imageView30.setImageResource(R.drawable.ic_pies_ligeros);
            imageView31.setImageResource(R.drawable.ic_claridad_mental);
            imageView32.setImageResource(R.drawable.ic_leyenda_linaje);
            imageView33.setImageResource(R.drawable.ic_ultimo_esfuerzo);
            imageView34.setImageResource(R.drawable.ic_derribado);
            imageView35.setImageResource(R.drawable.ic_derribado);
            imageView36.setImageResource(R.drawable.ic_derribado);
            imageView37.setImageResource(R.drawable.ic_derribado);
            imageView38.setImageResource(R.drawable.ic_derribado);
            imageView39.setImageResource(R.drawable.ic_derribado);
            imageView40.setImageResource(R.drawable.ic_derribado);
            imageView41.setImageResource(R.drawable.ic_derribado);
            imageView42.setImageResource(R.drawable.ic_derribado);

        }
        if (champId == 38)
        {
            this.setTitle(R.string.title_illaoi);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);

            toolbar.setNavigationOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(getApplicationContext(),MainActivity.class));
                    BuildActivity.this.finish();
                }
            });

            imageView1.setImageResource(R.drawable.ic_illaoi);
            textView1.setText("50,87 %");
            textView2.setText("Top");
            imageView2.setImageResource(R.drawable.ic_tabi_ninja);
            imageView3.setImageResource(R.drawable.ic_tabi_ninja);
            imageView4.setImageResource(R.drawable.ic_tabi_ninja);
            imageView5.setImageResource(R.drawable.ic_tabi_ninja);
            imageView6.setImageResource(R.drawable.ic_tabi_ninja);
            imageView7.setImageResource(R.drawable.ic_tabi_ninja);
            imageView8.setImageResource(R.drawable.ic_tabi_ninja);
            imageView9.setImageResource(R.drawable.ic_tabi_ninja);
            imageView10.setImageResource(R.drawable.ic_tabi_ninja);
            imageView11.setImageResource(R.drawable.ic_tabi_ninja);
            imageView12.setImageResource(R.drawable.ic_aatrox_lvl);
            imageView13.setImageResource(R.drawable.ic_precision_round);
            imageView14.setImageResource(R.drawable.ic_domination);
            imageView15.setImageResource(R.drawable.ic_brujeria);
            imageView16.setImageResource(R.drawable.ic_valor);
            imageView17.setImageResource(R.drawable.ic_inspiracion);
            imageView18.setImageResource(R.drawable.ic_domination);
            imageView19.setImageResource(R.drawable.ic_brujeria);
            imageView20.setImageResource(R.drawable.ic_valor_round);
            imageView21.setImageResource(R.drawable.ic_inspiracion);
            imageView22.setImageResource(R.drawable.ic_ataque_intesificado_round);
            imageView23.setImageResource(R.drawable.ic_super_curacion);
            imageView24.setImageResource(R.drawable.ic_leyenda_presteza);
            imageView25.setImageResource(R.drawable.ic_golpe_de_gracia);
            imageView26.setImageResource(R.drawable.ic_compas_letal);
            imageView27.setImageResource(R.drawable.ic_triumfo);
            imageView28.setImageResource(R.drawable.ic_leyenda_tenacidad);
            imageView29.setImageResource(R.drawable.ic_derribado);
            imageView30.setImageResource(R.drawable.ic_pies_ligeros);
            imageView31.setImageResource(R.drawable.ic_claridad_mental);
            imageView32.setImageResource(R.drawable.ic_leyenda_linaje);
            imageView33.setImageResource(R.drawable.ic_ultimo_esfuerzo);
            imageView34.setImageResource(R.drawable.ic_derribado);
            imageView35.setImageResource(R.drawable.ic_derribado);
            imageView36.setImageResource(R.drawable.ic_derribado);
            imageView37.setImageResource(R.drawable.ic_derribado);
            imageView38.setImageResource(R.drawable.ic_derribado);
            imageView39.setImageResource(R.drawable.ic_derribado);
            imageView40.setImageResource(R.drawable.ic_derribado);
            imageView41.setImageResource(R.drawable.ic_derribado);
            imageView42.setImageResource(R.drawable.ic_derribado);

        }
        if (champId == 39)
        {
            this.setTitle(R.string.title_irelia);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);

            toolbar.setNavigationOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(getApplicationContext(),MainActivity.class));
                    BuildActivity.this.finish();
                }
            });

            imageView1.setImageResource(R.drawable.ic_irelia);
            textView1.setText("50,87 %");
            textView2.setText("Top");
            imageView2.setImageResource(R.drawable.ic_tabi_ninja);
            imageView3.setImageResource(R.drawable.ic_tabi_ninja);
            imageView4.setImageResource(R.drawable.ic_tabi_ninja);
            imageView5.setImageResource(R.drawable.ic_tabi_ninja);
            imageView6.setImageResource(R.drawable.ic_tabi_ninja);
            imageView7.setImageResource(R.drawable.ic_tabi_ninja);
            imageView8.setImageResource(R.drawable.ic_tabi_ninja);
            imageView9.setImageResource(R.drawable.ic_tabi_ninja);
            imageView10.setImageResource(R.drawable.ic_tabi_ninja);
            imageView11.setImageResource(R.drawable.ic_tabi_ninja);
            imageView12.setImageResource(R.drawable.ic_aatrox_lvl);
            imageView13.setImageResource(R.drawable.ic_precision_round);
            imageView14.setImageResource(R.drawable.ic_domination);
            imageView15.setImageResource(R.drawable.ic_brujeria);
            imageView16.setImageResource(R.drawable.ic_valor);
            imageView17.setImageResource(R.drawable.ic_inspiracion);
            imageView18.setImageResource(R.drawable.ic_domination);
            imageView19.setImageResource(R.drawable.ic_brujeria);
            imageView20.setImageResource(R.drawable.ic_valor_round);
            imageView21.setImageResource(R.drawable.ic_inspiracion);
            imageView22.setImageResource(R.drawable.ic_ataque_intesificado_round);
            imageView23.setImageResource(R.drawable.ic_super_curacion);
            imageView24.setImageResource(R.drawable.ic_leyenda_presteza);
            imageView25.setImageResource(R.drawable.ic_golpe_de_gracia);
            imageView26.setImageResource(R.drawable.ic_compas_letal);
            imageView27.setImageResource(R.drawable.ic_triumfo);
            imageView28.setImageResource(R.drawable.ic_leyenda_tenacidad);
            imageView29.setImageResource(R.drawable.ic_derribado);
            imageView30.setImageResource(R.drawable.ic_pies_ligeros);
            imageView31.setImageResource(R.drawable.ic_claridad_mental);
            imageView32.setImageResource(R.drawable.ic_leyenda_linaje);
            imageView33.setImageResource(R.drawable.ic_ultimo_esfuerzo);
            imageView34.setImageResource(R.drawable.ic_derribado);
            imageView35.setImageResource(R.drawable.ic_derribado);
            imageView36.setImageResource(R.drawable.ic_derribado);
            imageView37.setImageResource(R.drawable.ic_derribado);
            imageView38.setImageResource(R.drawable.ic_derribado);
            imageView39.setImageResource(R.drawable.ic_derribado);
            imageView40.setImageResource(R.drawable.ic_derribado);
            imageView41.setImageResource(R.drawable.ic_derribado);
            imageView42.setImageResource(R.drawable.ic_derribado);

        }
    }

    public void onBackPressed() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        BuildActivity.this.finish();
    }

}
