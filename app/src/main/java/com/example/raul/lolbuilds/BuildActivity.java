package com.example.raul.lolbuilds;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class BuildActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_champ);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Intent intent = getIntent();
        int champId = intent.getIntExtra("champId", 0);

        ImageView imageView1 = findViewById(R.id.build_image1);
        TextView textView1 = findViewById(R.id.build_porciento);
        TextView textView2 = findViewById(R.id.build_papel);
        TextView textView3 = findViewById(R.id.build_año);
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
        ImageView imageView43 = findViewById(R.id.build_image43);
        ImageView imageView44 = findViewById(R.id.build_image44);

        if (champId == 0) {
            this.setTitle(R.string.title_aatrox);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);

            toolbar.setNavigationOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(getApplicationContext(), MainActivity.class));
                    BuildActivity.this.finish();
                }
            });

            imageView1.setImageResource(R.drawable.ic_aatrox);
            textView1.setText("50,28 %");
            textView2.setText("Top");
            textView3.setText("2013");
            imageView2.setImageResource(R.drawable.ic_tabi_ninja);
            imageView3.setImageResource(R.drawable.ic_trinidad);
            imageView4.setImageResource(R.drawable.ic_sterak);
            imageView5.setImageResource(R.drawable.ic_hidra_titanica);
            imageView6.setImageResource(R.drawable.ic_rostro_espiritual);
            imageView7.setImageResource(R.drawable.ic_rey_arruinado);
            imageView8.setImageResource(R.drawable.ic_flash);
            imageView9.setImageResource(R.drawable.ic_teleport);
            imageView10.setPadding(0, 0, 0, 0);
            imageView11.setPadding(0, 0, 0, 0);
            imageView12.setImageResource(R.drawable.ic_espada_de_doran);
            imageView13.setImageResource(R.drawable.ic_pocion);
            imageView14.setImageResource(R.drawable.ic_aatrox_lvl);
            imageView15.setImageResource(R.drawable.ic_precision_round);
            imageView16.setImageResource(R.drawable.ic_domination);
            imageView17.setImageResource(R.drawable.ic_brujeria);
            imageView18.setImageResource(R.drawable.ic_valor);
            imageView19.setImageResource(R.drawable.ic_inspiracion);
            imageView20.setImageResource(R.drawable.ic_domination);
            imageView21.setImageResource(R.drawable.ic_brujeria);
            imageView22.setImageResource(R.drawable.ic_valor_round);
            imageView23.setImageResource(R.drawable.ic_inspiracion);
            imageView24.setImageResource(R.drawable.ic_garras_del_inmortal_round);
            imageView25.setImageResource(R.drawable.ic_inquebrantable);
            imageView26.setImageResource(R.drawable.ic_piel_de_hierro_round);
            imageView27.setImageResource(R.drawable.ic_sobrecrecimiento_round);
            imageView28.setImageResource(R.drawable.ic_reverberacion);
            imageView29.setImageResource(R.drawable.ic_demoler);
            imageView30.setImageResource(R.drawable.ic_concha_espejo);
            imageView31.setImageResource(R.drawable.ic_revitalizar);
            imageView32.setImageResource(R.drawable.ic_protector);
            imageView33.setImageResource(R.drawable.ic_fuente_de_vida_round);
            imageView34.setImageResource(R.drawable.ic_condicionamiento);
            imageView35.setImageResource(R.drawable.ic_fuentes_renovadas);
            imageView36.setImageResource(R.drawable.ic_super_curacion);
            imageView37.setImageResource(R.drawable.ic_leyenda_presteza_round);
            imageView38.setImageResource(R.drawable.ic_golpe_de_gracia);
            imageView39.setImageResource(R.drawable.ic_triumfo);
            imageView40.setImageResource(R.drawable.ic_leyenda_tenacidad);
            imageView41.setImageResource(R.drawable.ic_derribado);
            imageView42.setImageResource(R.drawable.ic_claridad_mental);
            imageView43.setImageResource(R.drawable.ic_leyenda_linaje);
            imageView44.setImageResource(R.drawable.ic_ultimo_esfuerzo_round);

        }
        if (champId == 1) {
            this.setTitle(R.string.title_ahri);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);

            toolbar.setNavigationOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(getApplicationContext(), MainActivity.class));
                    BuildActivity.this.finish();
                }
            });

            imageView1.setImageResource(R.drawable.ic_ahri);
            textView1.setText("52,29 %");
            textView2.setText("Mid");
            textView3.setText("2011");
            imageView2.setImageResource(R.drawable.ic_sable_pistola);
            imageView3.setImageResource(R.drawable.ic_botas_hechizero);
            imageView4.setImageResource(R.drawable.ic_morellonomicon);
            imageView5.setImageResource(R.drawable.ic_baston_del_vacio);
            imageView6.setImageResource(R.drawable.ic_eco_de_luden);
            imageView7.setImageResource(R.drawable.ic_rabadon);
            imageView8.setImageResource(R.drawable.ic_flash);
            imageView9.setImageResource(R.drawable.ic_ignite);
            imageView10.setPadding(0, 0, 0, 0);
            imageView11.setImageResource(R.drawable.ic_anillo_de_doran);
            imageView12.setImageResource(R.drawable.ic_pocion);
            imageView13.setImageResource(R.drawable.ic_pocion);
            imageView14.setImageResource(R.drawable.ic_ahri_lvl);
            imageView15.setImageResource(R.drawable.ic_precision);
            imageView16.setImageResource(R.drawable.ic_domination_round);
            imageView17.setImageResource(R.drawable.ic_brujeria);
            imageView18.setImageResource(R.drawable.ic_valor);
            imageView19.setImageResource(R.drawable.ic_inspiracion);
            imageView20.setImageResource(R.drawable.ic_precision);
            imageView21.setImageResource(R.drawable.ic_brujeria_round);
            imageView22.setImageResource(R.drawable.ic_valor);
            imageView23.setImageResource(R.drawable.ic_inspiracion);
            imageView24.setImageResource(R.drawable.ic_electrocutar_round);
            imageView25.setImageResource(R.drawable.ic_golpe_bajo);
            imageView26.setImageResource(R.drawable.ic_guardian_zombi_round);
            imageView27.setImageResource(R.drawable.ic_cazador_voraz_round);
            imageView28.setImageResource(R.drawable.ic_depredador);
            imageView29.setImageResource(R.drawable.ic_sabor_a_sangre);
            imageView30.setImageResource(R.drawable.ic_poro_fantasmal);
            imageView31.setImageResource(R.drawable.ic_cazador_ingenioso);
            imageView32.setImageResource(R.drawable.ic_cosecha_oscura);
            imageView33.setImageResource(R.drawable.ic_impacto_repentino_round);
            imageView34.setImageResource(R.drawable.ic_coleccion_de_globos_oculares);
            imageView35.setImageResource(R.drawable.ic_cazador_incesante);
            imageView36.setImageResource(R.drawable.ic_orbe_anulador);
            imageView37.setImageResource(R.drawable.ic_trascendencia);
            imageView38.setImageResource(R.drawable.ic_pirolaser);
            imageView39.setImageResource(R.drawable.ic_banda_de_mana);
            imageView40.setImageResource(R.drawable.ic_celeridad_round);
            imageView41.setImageResource(R.drawable.ic_caminar_sobre_agua);
            imageView42.setImageResource(R.drawable.ic_sombrero_definitivo_round);
            imageView43.setImageResource(R.drawable.ic_concentracion_absoluta);
            imageView44.setImageResource(R.drawable.ic_se_avecina_tormenta);

        }
        if (champId == 2) {
            this.setTitle(R.string.title_akali);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);

            toolbar.setNavigationOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(getApplicationContext(), MainActivity.class));
                    BuildActivity.this.finish();
                }
            });

            imageView1.setImageResource(R.drawable.ic_akali);
            textView1.setText("49,94 %");
            textView2.setText("Mid");
            textView3.setText("2010");
            imageView2.setImageResource(R.drawable.ic_sable_pistola);
            imageView3.setImageResource(R.drawable.ic_botas_hechizero);
            imageView4.setImageResource(R.drawable.ic_reloj_zhonya);
            imageView5.setImageResource(R.drawable.ic_perdicion_del_liche);
            imageView6.setImageResource(R.drawable.ic_baston_del_vacio);
            imageView7.setImageResource(R.drawable.ic_rabadon);
            imageView8.setImageResource(R.drawable.ic_flash);
            imageView9.setImageResource(R.drawable.ic_teleport);
            imageView10.setPadding(0, 0, 0, 0);
            imageView11.setPadding(0, 0, 0, 0);
            imageView12.setImageResource(R.drawable.ic_sello_oscuro);
            imageView13.setImageResource(R.drawable.ic_pocion_reutilizable);
            imageView14.setImageResource(R.drawable.ic_akali_lvl);
            imageView15.setImageResource(R.drawable.ic_precision);
            imageView16.setImageResource(R.drawable.ic_domination_round);
            imageView17.setImageResource(R.drawable.ic_brujeria);
            imageView18.setImageResource(R.drawable.ic_valor);
            imageView19.setImageResource(R.drawable.ic_inspiracion);
            imageView20.setImageResource(R.drawable.ic_precision);
            imageView21.setImageResource(R.drawable.ic_brujeria);
            imageView22.setImageResource(R.drawable.ic_valor);
            imageView23.setImageResource(R.drawable.ic_inspiracion_round);
            imageView24.setImageResource(R.drawable.ic_electrocutar_round);
            imageView25.setImageResource(R.drawable.ic_golpe_bajo);
            imageView26.setImageResource(R.drawable.ic_guardian_zombi_round);
            imageView27.setImageResource(R.drawable.ic_cazador_voraz_round);
            imageView28.setImageResource(R.drawable.ic_depredador);
            imageView29.setImageResource(R.drawable.ic_sabor_a_sangre);
            imageView30.setImageResource(R.drawable.ic_poro_fantasmal);
            imageView31.setImageResource(R.drawable.ic_cazador_ingenioso);
            imageView32.setImageResource(R.drawable.ic_cosecha_oscura);
            imageView33.setImageResource(R.drawable.ic_impacto_repentino_round);
            imageView34.setImageResource(R.drawable.ic_coleccion_de_globos_oculares);
            imageView35.setImageResource(R.drawable.ic_cazador_incesante);
            imageView36.setImageResource(R.drawable.ic_destello_hextech);
            imageView37.setImageResource(R.drawable.ic_mercado_del_futuro);
            imageView38.setImageResource(R.drawable.ic_perspicacia_cosmica_round);
            imageView39.setImageResource(R.drawable.ic_botas_gratis);
            imageView40.setImageResource(R.drawable.ic_desmaterializador);
            imageView41.setImageResource(R.drawable.ic_velocidad_de_acercamiento);
            imageView42.setImageResource(R.drawable.ic_cronometro_round);
            imageView43.setImageResource(R.drawable.ic_entrega_de_galletas);
            imageView44.setImageResource(R.drawable.ic_cuerpo_celeste);

        }
        if (champId == 3) {
            this.setTitle(R.string.title_alistar);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);

            toolbar.setNavigationOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(getApplicationContext(), MainActivity.class));
                    BuildActivity.this.finish();
                }
            });

            imageView1.setImageResource(R.drawable.ic_alistar);
            textView1.setText("51,16 %");
            textView2.setText("Supp");
            textView3.setText("2009");
            imageView2.setImageResource(R.drawable.ic_botas_movilidad);
            imageView3.setImageResource(R.drawable.ic_restos_del_aspecto);
            imageView4.setImageResource(R.drawable.ic_solari);
            imageView5.setImageResource(R.drawable.ic_promesa_del_caballero);
            imageView6.setImageResource(R.drawable.ic_redencion);
            imageView7.setImageResource(R.drawable.ic_gargola);
            imageView8.setImageResource(R.drawable.ic_flash);
            imageView9.setImageResource(R.drawable.ic_ignite);
            imageView10.setImageResource(R.drawable.ic_pocion);
            imageView11.setImageResource(R.drawable.ic_pocion);
            imageView12.setImageResource(R.drawable.ic_pocion);
            imageView13.setImageResource(R.drawable.ic_escudo_reliquia);
            imageView14.setImageResource(R.drawable.ic_alistar_lvl);
            imageView15.setImageResource(R.drawable.ic_precision);
            imageView16.setImageResource(R.drawable.ic_domination);
            imageView17.setImageResource(R.drawable.ic_brujeria);
            imageView18.setImageResource(R.drawable.ic_valor_round);
            imageView19.setImageResource(R.drawable.ic_inspiracion);
            imageView20.setImageResource(R.drawable.ic_precision);
            imageView21.setImageResource(R.drawable.ic_domination);
            imageView22.setImageResource(R.drawable.ic_brujeria);
            imageView23.setImageResource(R.drawable.ic_inspiracion_round);
            imageView24.setImageResource(R.drawable.ic_garras_del_inmortal);
            imageView25.setImageResource(R.drawable.ic_inquebrantable_round);
            imageView26.setImageResource(R.drawable.ic_piel_de_hierro);
            imageView27.setImageResource(R.drawable.ic_sobrecrecimiento);
            imageView28.setImageResource(R.drawable.ic_reverberacion_round);
            imageView29.setImageResource(R.drawable.ic_demoler);
            imageView30.setImageResource(R.drawable.ic_concha_espejo);
            imageView31.setImageResource(R.drawable.ic_revitalizar);
            imageView32.setImageResource(R.drawable.ic_protector);
            imageView33.setImageResource(R.drawable.ic_fuente_de_vida);
            imageView34.setImageResource(R.drawable.ic_condicionamiento_round);
            imageView35.setImageResource(R.drawable.ic_fuentes_renovadas_round);
            imageView36.setImageResource(R.drawable.ic_destello_hextech);
            imageView37.setImageResource(R.drawable.ic_mercado_del_futuro);
            imageView38.setImageResource(R.drawable.ic_perspicacia_cosmica_round);
            imageView39.setImageResource(R.drawable.ic_botas_gratis);
            imageView40.setImageResource(R.drawable.ic_desmaterializador);
            imageView41.setImageResource(R.drawable.ic_velocidad_de_acercamiento);
            imageView42.setImageResource(R.drawable.ic_cronometro);
            imageView43.setImageResource(R.drawable.ic_entrega_de_galletas_round);
            imageView44.setImageResource(R.drawable.ic_cuerpo_celeste);

        }
        if (champId == 4) {
            this.setTitle(R.string.title_amumu);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);

            toolbar.setNavigationOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(getApplicationContext(), MainActivity.class));
                    BuildActivity.this.finish();
                }
            });

            imageView1.setImageResource(R.drawable.ic_amumu);
            textView1.setText("51,62 %");
            textView2.setText("Jung");
            textView3.setText("2009");
            imageView2.setImageResource(R.drawable.ic_azul_mole_de_ceniza);
            imageView3.setImageResource(R.drawable.ic_tabi_ninja);
            imageView4.setImageResource(R.drawable.ic_mascara_abisal);
            imageView5.setImageResource(R.drawable.ic_malla_de_espinas);
            imageView6.setImageResource(R.drawable.ic_corazon_de_hielo);
            imageView7.setImageResource(R.drawable.ic_randuin);
            imageView8.setImageResource(R.drawable.ic_smite);
            imageView9.setImageResource(R.drawable.ic_flash);
            imageView10.setPadding(0, 0, 0, 0);
            imageView11.setPadding(0, 0, 0, 0);
            imageView12.setImageResource(R.drawable.ic_talisman_del_cazador);
            imageView13.setImageResource(R.drawable.ic_pocion_reutilizable);
            imageView14.setImageResource(R.drawable.ic_amumu_lvl);
            imageView15.setImageResource(R.drawable.ic_precision);
            imageView16.setImageResource(R.drawable.ic_domination);
            imageView17.setImageResource(R.drawable.ic_brujeria);
            imageView18.setImageResource(R.drawable.ic_valor_round);
            imageView19.setImageResource(R.drawable.ic_inspiracion);
            imageView20.setImageResource(R.drawable.ic_precision);
            imageView21.setImageResource(R.drawable.ic_domination);
            imageView22.setImageResource(R.drawable.ic_brujeria_round);
            imageView23.setImageResource(R.drawable.ic_inspiracion);
            imageView24.setImageResource(R.drawable.ic_garras_del_inmortal);
            imageView25.setImageResource(R.drawable.ic_inquebrantable_round);
            imageView26.setImageResource(R.drawable.ic_piel_de_hierro);
            imageView27.setImageResource(R.drawable.ic_sobrecrecimiento_round);
            imageView28.setImageResource(R.drawable.ic_reverberacion_round);
            imageView29.setImageResource(R.drawable.ic_demoler);
            imageView30.setImageResource(R.drawable.ic_concha_espejo);
            imageView31.setImageResource(R.drawable.ic_revitalizar);
            imageView32.setImageResource(R.drawable.ic_protector);
            imageView33.setImageResource(R.drawable.ic_fuente_de_vida);
            imageView34.setImageResource(R.drawable.ic_condicionamiento_round);
            imageView35.setImageResource(R.drawable.ic_fuentes_renovadas);
            imageView36.setImageResource(R.drawable.ic_orbe_anulador);
            imageView37.setImageResource(R.drawable.ic_trascendencia_round);
            imageView38.setImageResource(R.drawable.ic_pirolaser);
            imageView39.setImageResource(R.drawable.ic_banda_de_mana);
            imageView40.setImageResource(R.drawable.ic_celeridad);
            imageView41.setImageResource(R.drawable.ic_caminar_sobre_agua);
            imageView42.setImageResource(R.drawable.ic_sombrero_definitivo_round);
            imageView43.setImageResource(R.drawable.ic_concentracion_absoluta);
            imageView44.setImageResource(R.drawable.ic_se_avecina_tormenta);


        }
        if (champId == 5) {
            this.setTitle(R.string.title_anivia);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);

            toolbar.setNavigationOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(getApplicationContext(), MainActivity.class));
                    BuildActivity.this.finish();
                }
            });

            imageView1.setImageResource(R.drawable.ic_anivia);
            textView1.setText("54,48 %");
            textView2.setText("Mid");
            textView3.setText("2009");
            imageView2.setImageResource(R.drawable.ic_vara_de_las_edades);
            imageView3.setImageResource(R.drawable.ic_botas_hechizero);
            imageView4.setImageResource(R.drawable.ic_baston_del_arcangel);
            imageView5.setImageResource(R.drawable.ic_reloj_zhonya);
            imageView6.setImageResource(R.drawable.ic_tormento_de_liandry);
            imageView7.setImageResource(R.drawable.ic_baston_del_vacio);
            imageView8.setImageResource(R.drawable.ic_flash);
            imageView9.setImageResource(R.drawable.ic_teleport);
            imageView10.setPadding(0, 0, 0, 0);
            imageView11.setImageResource(R.drawable.ic_anillo_de_doran);
            imageView12.setImageResource(R.drawable.ic_pocion);
            imageView13.setImageResource(R.drawable.ic_pocion);
            imageView14.setImageResource(R.drawable.ic_anivia_lvl);
            imageView15.setImageResource(R.drawable.ic_precision);
            imageView16.setImageResource(R.drawable.ic_domination);
            imageView17.setImageResource(R.drawable.ic_brujeria_round);
            imageView18.setImageResource(R.drawable.ic_valor);
            imageView19.setImageResource(R.drawable.ic_inspiracion);
            imageView20.setImageResource(R.drawable.ic_precision);
            imageView21.setImageResource(R.drawable.ic_domination);
            imageView22.setImageResource(R.drawable.ic_valor);
            imageView23.setImageResource(R.drawable.ic_inspiracion_round);
            imageView24.setImageResource(R.drawable.ic_aery);
            imageView25.setImageResource(R.drawable.ic_orbe_anulador);
            imageView26.setImageResource(R.drawable.ic_trascendencia_round);
            imageView27.setImageResource(R.drawable.ic_pirolaser_round);
            imageView28.setImageResource(R.drawable.ic_cometa_arcano_round);
            imageView29.setImageResource(R.drawable.ic_banda_de_mana_round);
            imageView30.setImageResource(R.drawable.ic_celeridad);
            imageView31.setImageResource(R.drawable.ic_caminar_sobre_agua);
            imageView32.setImageResource(R.drawable.ic_irrupcion_de_fase);
            imageView33.setImageResource(R.drawable.ic_sombrero_definitivo);
            imageView34.setImageResource(R.drawable.ic_concentracion_absoluta);
            imageView35.setImageResource(R.drawable.ic_se_avecina_tormenta);
            imageView36.setImageResource(R.drawable.ic_destello_hextech);
            imageView37.setImageResource(R.drawable.ic_mercado_del_futuro);
            imageView38.setImageResource(R.drawable.ic_perspicacia_cosmica_round);
            imageView39.setImageResource(R.drawable.ic_botas_gratis);
            imageView40.setImageResource(R.drawable.ic_desmaterializador);
            imageView41.setImageResource(R.drawable.ic_velocidad_de_acercamiento);
            imageView42.setImageResource(R.drawable.ic_cronometro_round);
            imageView43.setImageResource(R.drawable.ic_entrega_de_galletas);
            imageView44.setImageResource(R.drawable.ic_cuerpo_celeste);

        }
        if (champId == 6) {
            this.setTitle(R.string.title_annie);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);

            toolbar.setNavigationOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(getApplicationContext(), MainActivity.class));
                    BuildActivity.this.finish();
                }
            });

            imageView1.setImageResource(R.drawable.ic_annie);
            textView1.setText("48,33 %");
            textView2.setText("Mid");
            textView3.setText("2009");
            imageView2.setImageResource(R.drawable.ic_morellonomicon);
            imageView3.setImageResource(R.drawable.ic_botas_hechizero);
            imageView4.setImageResource(R.drawable.ic_eco_de_luden);
            imageView5.setImageResource(R.drawable.ic_reloj_zhonya);
            imageView6.setImageResource(R.drawable.ic_rabadon);
            imageView7.setImageResource(R.drawable.ic_baston_del_vacio);
            imageView8.setImageResource(R.drawable.ic_flash);
            imageView9.setImageResource(R.drawable.ic_ignite);
            imageView10.setPadding(0, 0, 0, 0);
            imageView11.setImageResource(R.drawable.ic_anillo_de_doran);
            imageView12.setImageResource(R.drawable.ic_pocion);
            imageView13.setImageResource(R.drawable.ic_pocion);
            imageView14.setImageResource(R.drawable.ic_annie_lvl);
            imageView15.setImageResource(R.drawable.ic_precision);
            imageView16.setImageResource(R.drawable.ic_domination);
            imageView17.setImageResource(R.drawable.ic_brujeria_round);
            imageView18.setImageResource(R.drawable.ic_valor);
            imageView19.setImageResource(R.drawable.ic_inspiracion);
            imageView20.setImageResource(R.drawable.ic_precision);
            imageView21.setImageResource(R.drawable.ic_domination_round);
            imageView22.setImageResource(R.drawable.ic_valor);
            imageView23.setImageResource(R.drawable.ic_inspiracion);
            imageView24.setImageResource(R.drawable.ic_aery);
            imageView25.setImageResource(R.drawable.ic_orbe_anulador);
            imageView26.setImageResource(R.drawable.ic_trascendencia_round);
            imageView27.setImageResource(R.drawable.ic_pirolaser);
            imageView28.setImageResource(R.drawable.ic_cometa_arcano_round);
            imageView29.setImageResource(R.drawable.ic_banda_de_mana_round);
            imageView30.setImageResource(R.drawable.ic_celeridad);
            imageView31.setImageResource(R.drawable.ic_caminar_sobre_agua);
            imageView32.setImageResource(R.drawable.ic_irrupcion_de_fase);
            imageView33.setImageResource(R.drawable.ic_sombrero_definitivo);
            imageView34.setImageResource(R.drawable.ic_concentracion_absoluta);
            imageView35.setImageResource(R.drawable.ic_se_avecina_tormenta_round);
            imageView36.setImageResource(R.drawable.ic_golpe_bajo);
            imageView37.setImageResource(R.drawable.ic_guardian_zombi);
            imageView38.setImageResource(R.drawable.ic_cazador_voraz);
            imageView39.setImageResource(R.drawable.ic_sabor_a_sangre);
            imageView40.setImageResource(R.drawable.ic_poro_fantasmal);
            imageView41.setImageResource(R.drawable.ic_cazador_ingenioso);
            imageView42.setImageResource(R.drawable.ic_impacto_repentino);
            imageView43.setImageResource(R.drawable.ic_coleccion_de_globos_oculares_round);
            imageView44.setImageResource(R.drawable.ic_cazador_incesante_round);

        }
        if (champId == 7) {
            this.setTitle(R.string.title_ashe);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);

            toolbar.setNavigationOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(getApplicationContext(), MainActivity.class));
                    BuildActivity.this.finish();
                }
            });

            imageView1.setImageResource(R.drawable.ic_ashe);
            textView1.setText("49,59 %");
            textView2.setText("Adc");
            textView3.setText("2009");
            imageView2.setImageResource(R.drawable.ic_segador_esencia);
            imageView3.setImageResource(R.drawable.ic_grebas_berserker);
            imageView4.setImageResource(R.drawable.ic_huracan);
            imageView5.setImageResource(R.drawable.ic_filo_infinito);
            imageView6.setImageResource(R.drawable.ic_bailarin_espectral);
            imageView7.setImageResource(R.drawable.ic_cimitarra_mercurial);
            imageView8.setImageResource(R.drawable.ic_flash);
            imageView9.setImageResource(R.drawable.ic_heal);
            imageView10.setPadding(0, 0, 0, 0);
            imageView11.setPadding(0, 0, 0, 0);
            imageView12.setImageResource(R.drawable.ic_espada_de_doran);
            imageView13.setImageResource(R.drawable.ic_pocion);
            imageView14.setImageResource(R.drawable.ic_ashe_lvl);
            imageView15.setImageResource(R.drawable.ic_precision_round);
            imageView16.setImageResource(R.drawable.ic_domination);
            imageView17.setImageResource(R.drawable.ic_brujeria);
            imageView18.setImageResource(R.drawable.ic_valor);
            imageView19.setImageResource(R.drawable.ic_inspiracion);
            imageView20.setImageResource(R.drawable.ic_domination);
            imageView21.setImageResource(R.drawable.ic_brujeria_round);
            imageView22.setImageResource(R.drawable.ic_valor);
            imageView23.setImageResource(R.drawable.ic_inspiracion);
            imageView24.setImageResource(R.drawable.ic_ataque_intesificado);
            imageView25.setImageResource(R.drawable.ic_super_curacion);
            imageView26.setImageResource(R.drawable.ic_leyenda_presteza_round);
            imageView27.setImageResource(R.drawable.ic_golpe_de_gracia_round);
            imageView28.setImageResource(R.drawable.ic_compas_letal);
            imageView29.setImageResource(R.drawable.ic_triumfo_round);
            imageView30.setImageResource(R.drawable.ic_leyenda_tenacidad);
            imageView31.setImageResource(R.drawable.ic_derribado);
            imageView32.setImageResource(R.drawable.ic_pies_ligeros_round);
            imageView33.setImageResource(R.drawable.ic_claridad_mental);
            imageView34.setImageResource(R.drawable.ic_leyenda_linaje);
            imageView35.setImageResource(R.drawable.ic_ultimo_esfuerzo);
            imageView36.setImageResource(R.drawable.ic_orbe_anulador);
            imageView37.setImageResource(R.drawable.ic_trascendencia);
            imageView38.setImageResource(R.drawable.ic_pirolaser);
            imageView39.setImageResource(R.drawable.ic_banda_de_mana);
            imageView40.setImageResource(R.drawable.ic_celeridad_round);
            imageView41.setImageResource(R.drawable.ic_caminar_sobre_agua);
            imageView42.setImageResource(R.drawable.ic_sombrero_definitivo);
            imageView43.setImageResource(R.drawable.ic_concentracion_absoluta);
            imageView44.setImageResource(R.drawable.ic_se_avecina_tormenta_round);

        }
        if (champId == 8) {
            this.setTitle(R.string.title_aurelion_sol);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);

            toolbar.setNavigationOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(getApplicationContext(), MainActivity.class));
                    BuildActivity.this.finish();
                }
            });

            imageView1.setImageResource(R.drawable.ic_aurelion_sol);
            textView1.setText("52,06 %");
            textView2.setText("Mid");
            textView3.setText("2016");
            imageView2.setImageResource(R.drawable.ic_botas_rapidez);
            imageView3.setImageResource(R.drawable.ic_hextech_glp);
            imageView4.setImageResource(R.drawable.ic_rylai);
            imageView5.setImageResource(R.drawable.ic_tormento_de_liandry);
            imageView6.setImageResource(R.drawable.ic_baston_del_vacio);
            imageView7.setImageResource(R.drawable.ic_rabadon);
            imageView8.setImageResource(R.drawable.ic_flash);
            imageView9.setImageResource(R.drawable.ic_ignite);
            imageView10.setPadding(0, 0, 0, 0);
            imageView11.setPadding(0, 0, 0, 0);
            imageView12.setPadding(0, 0, 0, 0);
            imageView13.setImageResource(R.drawable.ic_pocion_corrupcion);
            imageView14.setImageResource(R.drawable.ic_aatrox_lvl);
            imageView15.setImageResource(R.drawable.ic_precision);
            imageView16.setImageResource(R.drawable.ic_domination);
            imageView17.setImageResource(R.drawable.ic_brujeria_round);
            imageView18.setImageResource(R.drawable.ic_valor);
            imageView19.setImageResource(R.drawable.ic_inspiracion);
            imageView20.setImageResource(R.drawable.ic_precision_round);
            imageView21.setImageResource(R.drawable.ic_domination);
            imageView22.setImageResource(R.drawable.ic_valor);
            imageView23.setImageResource(R.drawable.ic_inspiracion);
            imageView24.setImageResource(R.drawable.ic_aery);
            imageView25.setImageResource(R.drawable.ic_orbe_anulador_round);
            imageView26.setImageResource(R.drawable.ic_trascendencia);
            imageView27.setImageResource(R.drawable.ic_pirolaser);
            imageView28.setImageResource(R.drawable.ic_cometa_arcano);
            imageView29.setImageResource(R.drawable.ic_banda_de_mana);
            imageView30.setImageResource(R.drawable.ic_celeridad_round);
            imageView31.setImageResource(R.drawable.ic_caminar_sobre_agua_round);
            imageView32.setImageResource(R.drawable.ic_irrupcion_de_fase_round);
            imageView33.setImageResource(R.drawable.ic_sombrero_definitivo);
            imageView34.setImageResource(R.drawable.ic_concentracion_absoluta);
            imageView35.setImageResource(R.drawable.ic_se_avecina_tormenta);
            imageView36.setImageResource(R.drawable.ic_super_curacion);
            imageView37.setImageResource(R.drawable.ic_leyenda_presteza);
            imageView38.setImageResource(R.drawable.ic_golpe_de_gracia_round);
            imageView39.setImageResource(R.drawable.ic_triumfo);
            imageView40.setImageResource(R.drawable.ic_leyenda_tenacidad);
            imageView41.setImageResource(R.drawable.ic_derribado);
            imageView42.setImageResource(R.drawable.ic_claridad_mental_round);
            imageView43.setImageResource(R.drawable.ic_leyenda_linaje);
            imageView44.setImageResource(R.drawable.ic_ultimo_esfuerzo);

        }
        if (champId == 9) {
            this.setTitle(R.string.title_azir);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);

            toolbar.setNavigationOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(getApplicationContext(), MainActivity.class));
                    BuildActivity.this.finish();
                }
            });

            imageView1.setImageResource(R.drawable.ic_azir);
            textView1.setText("47.50 %");
            textView2.setText("Mid");
            textView3.setText("2014");
            imageView2.setImageResource(R.drawable.ic_diente_nashor);
            imageView3.setImageResource(R.drawable.ic_botas_hechizero);
            imageView4.setImageResource(R.drawable.ic_tormento_de_liandry);
            imageView5.setImageResource(R.drawable.ic_baston_del_vacio);
            imageView6.setImageResource(R.drawable.ic_rabadon);
            imageView7.setImageResource(R.drawable.ic_reloj_zhonya);
            imageView8.setImageResource(R.drawable.ic_flash);
            imageView9.setImageResource(R.drawable.ic_heal);
            imageView10.setPadding(0, 0, 0, 0);
            imageView11.setImageResource(R.drawable.ic_anillo_de_doran);
            imageView12.setImageResource(R.drawable.ic_pocion);
            imageView13.setImageResource(R.drawable.ic_pocion);
            imageView14.setImageResource(R.drawable.ic_azir_lvl);
            imageView15.setImageResource(R.drawable.ic_precision);
            imageView16.setImageResource(R.drawable.ic_domination);
            imageView17.setImageResource(R.drawable.ic_brujeria_round);
            imageView18.setImageResource(R.drawable.ic_valor);
            imageView19.setImageResource(R.drawable.ic_inspiracion);
            imageView20.setImageResource(R.drawable.ic_precision_round);
            imageView21.setImageResource(R.drawable.ic_domination);
            imageView22.setImageResource(R.drawable.ic_valor);
            imageView23.setImageResource(R.drawable.ic_inspiracion);
            imageView24.setImageResource(R.drawable.ic_aery);
            imageView25.setImageResource(R.drawable.ic_orbe_anulador);
            imageView26.setImageResource(R.drawable.ic_trascendencia_round);
            imageView27.setImageResource(R.drawable.ic_pirolaser_round);
            imageView28.setImageResource(R.drawable.ic_cometa_arcano_round);
            imageView29.setImageResource(R.drawable.ic_banda_de_mana_round);
            imageView30.setImageResource(R.drawable.ic_celeridad);
            imageView31.setImageResource(R.drawable.ic_caminar_sobre_agua);
            imageView32.setImageResource(R.drawable.ic_irrupcion_de_fase);
            imageView33.setImageResource(R.drawable.ic_sombrero_definitivo);
            imageView34.setImageResource(R.drawable.ic_concentracion_absoluta);
            imageView35.setImageResource(R.drawable.ic_se_avecina_tormenta);
            imageView36.setImageResource(R.drawable.ic_super_curacion);
            imageView37.setImageResource(R.drawable.ic_leyenda_presteza_round);
            imageView38.setImageResource(R.drawable.ic_golpe_de_gracia);
            imageView39.setImageResource(R.drawable.ic_triumfo);
            imageView40.setImageResource(R.drawable.ic_leyenda_tenacidad);
            imageView41.setImageResource(R.drawable.ic_derribado);
            imageView42.setImageResource(R.drawable.ic_claridad_mental_round);
            imageView43.setImageResource(R.drawable.ic_leyenda_linaje);
            imageView44.setImageResource(R.drawable.ic_ultimo_esfuerzo);

        }
        if (champId == 10) {
            this.setTitle(R.string.title_bardo);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);

            toolbar.setNavigationOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(getApplicationContext(), MainActivity.class));
                    BuildActivity.this.finish();
                }
            });

            imageView1.setImageResource(R.drawable.ic_bardo);
            textView1.setText("51,34 %");
            textView2.setText("Supp");
            textView3.setText("2015");
            imageView2.setImageResource(R.drawable.ic_botas_movilidad);
            imageView3.setImageResource(R.drawable.ic_restos_de_los_vigilantes);
            imageView4.setImageResource(R.drawable.ic_solari);
            imageView5.setImageResource(R.drawable.ic_redencion);
            imageView6.setImageResource(R.drawable.ic_promesa_del_caballero);
            imageView7.setImageResource(R.drawable.ic_mikael);
            imageView8.setImageResource(R.drawable.ic_flash);
            imageView9.setImageResource(R.drawable.ic_ignite);
            imageView10.setImageResource(R.drawable.ic_pocion);
            imageView11.setImageResource(R.drawable.ic_pocion);
            imageView12.setImageResource(R.drawable.ic_pocion);
            imageView13.setImageResource(R.drawable.ic_daga_hechizero);
            imageView14.setImageResource(R.drawable.ic_bardo_lvl);
            imageView15.setImageResource(R.drawable.ic_precision);
            imageView16.setImageResource(R.drawable.ic_domination_round);
            imageView17.setImageResource(R.drawable.ic_brujeria);
            imageView18.setImageResource(R.drawable.ic_valor);
            imageView19.setImageResource(R.drawable.ic_inspiracion);
            imageView20.setImageResource(R.drawable.ic_precision);
            imageView21.setImageResource(R.drawable.ic_brujeria_round);
            imageView22.setImageResource(R.drawable.ic_valor);
            imageView23.setImageResource(R.drawable.ic_inspiracion);
            imageView24.setImageResource(R.drawable.ic_electrocutar_round);
            imageView25.setImageResource(R.drawable.ic_golpe_bajo_round);
            imageView26.setImageResource(R.drawable.ic_guardian_zombi);
            imageView27.setImageResource(R.drawable.ic_cazador_voraz);
            imageView28.setImageResource(R.drawable.ic_depredador);
            imageView29.setImageResource(R.drawable.ic_sabor_a_sangre);
            imageView30.setImageResource(R.drawable.ic_poro_fantasmal);
            imageView31.setImageResource(R.drawable.ic_cazador_ingenioso);
            imageView32.setImageResource(R.drawable.ic_cosecha_oscura);
            imageView33.setImageResource(R.drawable.ic_impacto_repentino);
            imageView34.setImageResource(R.drawable.ic_coleccion_de_globos_oculares_round);
            imageView35.setImageResource(R.drawable.ic_cazador_incesante_round);
            imageView36.setImageResource(R.drawable.ic_orbe_anulador);
            imageView37.setImageResource(R.drawable.ic_trascendencia);
            imageView38.setImageResource(R.drawable.ic_pirolaser_round);
            imageView39.setImageResource(R.drawable.ic_banda_de_mana);
            imageView40.setImageResource(R.drawable.ic_celeridad_round);
            imageView41.setImageResource(R.drawable.ic_caminar_sobre_agua);
            imageView42.setImageResource(R.drawable.ic_sombrero_definitivo);
            imageView43.setImageResource(R.drawable.ic_concentracion_absoluta);
            imageView44.setImageResource(R.drawable.ic_se_avecina_tormenta);

        }
        if (champId == 11) {
            this.setTitle(R.string.title_blitzcrank);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);

            toolbar.setNavigationOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(getApplicationContext(), MainActivity.class));
                    BuildActivity.this.finish();
                }
            });

            imageView1.setImageResource(R.drawable.ic_blitzcrank);
            textView1.setText("51,80 %");
            textView2.setText("Supp");
            textView3.setText("2009");
            imageView2.setImageResource(R.drawable.ic_botas_movilidad);
            imageView3.setImageResource(R.drawable.ic_restos_del_aspecto);
            imageView4.setImageResource(R.drawable.ic_solari);
            imageView5.setImageResource(R.drawable.ic_promesa_del_caballero);
            imageView6.setImageResource(R.drawable.ic_redencion);
            imageView7.setImageResource(R.drawable.ic_corazon_de_hielo);
            imageView8.setImageResource(R.drawable.ic_flash);
            imageView9.setImageResource(R.drawable.ic_ignite);
            imageView10.setImageResource(R.drawable.ic_pocion);
            imageView11.setImageResource(R.drawable.ic_pocion);
            imageView12.setImageResource(R.drawable.ic_pocion);
            imageView13.setImageResource(R.drawable.ic_escudo_reliquia);
            imageView14.setImageResource(R.drawable.ic_blitzcrank_lvl);
            imageView15.setImageResource(R.drawable.ic_precision);
            imageView16.setImageResource(R.drawable.ic_domination);
            imageView17.setImageResource(R.drawable.ic_brujeria);
            imageView18.setImageResource(R.drawable.ic_valor_round);
            imageView19.setImageResource(R.drawable.ic_inspiracion);
            imageView20.setImageResource(R.drawable.ic_precision);
            imageView21.setImageResource(R.drawable.ic_domination);
            imageView22.setImageResource(R.drawable.ic_brujeria_round);
            imageView23.setImageResource(R.drawable.ic_inspiracion);
            imageView24.setImageResource(R.drawable.ic_garras_del_inmortal);
            imageView25.setImageResource(R.drawable.ic_inquebrantable);
            imageView26.setImageResource(R.drawable.ic_piel_de_hierro);
            imageView27.setImageResource(R.drawable.ic_sobrecrecimiento);
            imageView28.setImageResource(R.drawable.ic_reverberacion_round);
            imageView29.setImageResource(R.drawable.ic_demoler);
            imageView30.setImageResource(R.drawable.ic_concha_espejo);
            imageView31.setImageResource(R.drawable.ic_revitalizar);
            imageView32.setImageResource(R.drawable.ic_protector);
            imageView33.setImageResource(R.drawable.ic_fuente_de_vida_round);
            imageView34.setImageResource(R.drawable.ic_condicionamiento_round);
            imageView35.setImageResource(R.drawable.ic_fuentes_renovadas_round);
            imageView36.setImageResource(R.drawable.ic_orbe_anulador);
            imageView37.setImageResource(R.drawable.ic_trascendencia);
            imageView38.setImageResource(R.drawable.ic_pirolaser);
            imageView39.setImageResource(R.drawable.ic_banda_de_mana_round);
            imageView40.setImageResource(R.drawable.ic_celeridad_round);
            imageView41.setImageResource(R.drawable.ic_caminar_sobre_agua);
            imageView42.setImageResource(R.drawable.ic_sombrero_definitivo);
            imageView43.setImageResource(R.drawable.ic_concentracion_absoluta);
            imageView44.setImageResource(R.drawable.ic_se_avecina_tormenta);

        }
        if (champId == 12) {
            this.setTitle(R.string.title_brand);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);

            toolbar.setNavigationOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(getApplicationContext(), MainActivity.class));
                    BuildActivity.this.finish();
                }
            });

            imageView1.setImageResource(R.drawable.ic_brand);
            textView1.setText("53,12 %");
            textView2.setText("Mid");
            textView3.setText("2011");
            imageView2.setImageResource(R.drawable.ic_vara_de_las_edades);
            imageView3.setImageResource(R.drawable.ic_botas_hechizero);
            imageView4.setImageResource(R.drawable.ic_tormento_de_liandry);
            imageView5.setImageResource(R.drawable.ic_rylai);
            imageView6.setImageResource(R.drawable.ic_baston_del_vacio);
            imageView7.setImageResource(R.drawable.ic_rabadon);
            imageView8.setImageResource(R.drawable.ic_flash);
            imageView9.setImageResource(R.drawable.ic_ignite);
            imageView10.setPadding(0, 0, 0, 0);
            imageView11.setImageResource(R.drawable.ic_anillo_de_doran);
            imageView12.setImageResource(R.drawable.ic_pocion);
            imageView13.setImageResource(R.drawable.ic_pocion);
            imageView14.setImageResource(R.drawable.ic_brand_lvl);
            imageView15.setImageResource(R.drawable.ic_precision);
            imageView16.setImageResource(R.drawable.ic_domination);
            imageView17.setImageResource(R.drawable.ic_brujeria_round);
            imageView18.setImageResource(R.drawable.ic_valor);
            imageView19.setImageResource(R.drawable.ic_inspiracion);
            imageView20.setImageResource(R.drawable.ic_precision);
            imageView21.setImageResource(R.drawable.ic_domination);
            imageView22.setImageResource(R.drawable.ic_valor);
            imageView23.setImageResource(R.drawable.ic_inspiracion_round);
            imageView24.setImageResource(R.drawable.ic_aery);
            imageView25.setImageResource(R.drawable.ic_orbe_anulador);
            imageView26.setImageResource(R.drawable.ic_trascendencia_round);
            imageView27.setImageResource(R.drawable.ic_pirolaser_round);
            imageView28.setImageResource(R.drawable.ic_cometa_arcano_round);
            imageView29.setImageResource(R.drawable.ic_banda_de_mana_round);
            imageView30.setImageResource(R.drawable.ic_celeridad);
            imageView31.setImageResource(R.drawable.ic_caminar_sobre_agua);
            imageView32.setImageResource(R.drawable.ic_irrupcion_de_fase);
            imageView33.setImageResource(R.drawable.ic_sombrero_definitivo);
            imageView34.setImageResource(R.drawable.ic_concentracion_absoluta);
            imageView35.setImageResource(R.drawable.ic_se_avecina_tormenta);
            imageView36.setImageResource(R.drawable.ic_destello_hextech);
            imageView37.setImageResource(R.drawable.ic_mercado_del_futuro);
            imageView38.setImageResource(R.drawable.ic_perspicacia_cosmica_round);
            imageView39.setImageResource(R.drawable.ic_botas_gratis);
            imageView40.setImageResource(R.drawable.ic_desmaterializador);
            imageView41.setImageResource(R.drawable.ic_velocidad_de_acercamiento);
            imageView42.setImageResource(R.drawable.ic_cronometro_round);
            imageView43.setImageResource(R.drawable.ic_entrega_de_galletas);
            imageView44.setImageResource(R.drawable.ic_cuerpo_celeste);

        }
        if (champId == 13) {
            this.setTitle(R.string.title_braum);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);

            toolbar.setNavigationOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(getApplicationContext(), MainActivity.class));
                    BuildActivity.this.finish();
                }
            });

            imageView1.setImageResource(R.drawable.ic_braum);
            textView1.setText("51,52 %");
            textView2.setText("Supp");
            textView3.setText("2014");
            imageView2.setImageResource(R.drawable.ic_botas_movilidad);
            imageView3.setImageResource(R.drawable.ic_restos_del_aspecto);
            imageView4.setImageResource(R.drawable.ic_solari);
            imageView5.setImageResource(R.drawable.ic_promesa_del_caballero);
            imageView6.setImageResource(R.drawable.ic_redencion);
            imageView7.setImageResource(R.drawable.ic_convergencia_del_zeke);
            imageView8.setImageResource(R.drawable.ic_exhaust);
            imageView9.setImageResource(R.drawable.ic_flash);
            imageView10.setImageResource(R.drawable.ic_pocion);
            imageView11.setImageResource(R.drawable.ic_pocion);
            imageView12.setImageResource(R.drawable.ic_pocion);
            imageView13.setImageResource(R.drawable.ic_escudo_reliquia);
            imageView14.setImageResource(R.drawable.ic_braum_lvl);
            imageView15.setImageResource(R.drawable.ic_precision);
            imageView16.setImageResource(R.drawable.ic_domination);
            imageView17.setImageResource(R.drawable.ic_brujeria);
            imageView18.setImageResource(R.drawable.ic_valor_round);
            imageView19.setImageResource(R.drawable.ic_inspiracion);
            imageView20.setImageResource(R.drawable.ic_precision);
            imageView21.setImageResource(R.drawable.ic_domination);
            imageView22.setImageResource(R.drawable.ic_brujeria);
            imageView23.setImageResource(R.drawable.ic_inspiracion_round);
            imageView24.setImageResource(R.drawable.ic_garras_del_inmortal);
            imageView25.setImageResource(R.drawable.ic_inquebrantable);
            imageView26.setImageResource(R.drawable.ic_piel_de_hierro_round);
            imageView27.setImageResource(R.drawable.ic_sobrecrecimiento);
            imageView28.setImageResource(R.drawable.ic_reverberacion);
            imageView29.setImageResource(R.drawable.ic_demoler);
            imageView30.setImageResource(R.drawable.ic_concha_espejo);
            imageView31.setImageResource(R.drawable.ic_revitalizar);
            imageView32.setImageResource(R.drawable.ic_protector_round);
            imageView33.setImageResource(R.drawable.ic_fuente_de_vida_round);
            imageView34.setImageResource(R.drawable.ic_condicionamiento);
            imageView35.setImageResource(R.drawable.ic_fuentes_renovadas_round);
            imageView36.setImageResource(R.drawable.ic_destello_hextech);
            imageView37.setImageResource(R.drawable.ic_mercado_del_futuro_round);
            imageView38.setImageResource(R.drawable.ic_perspicacia_cosmica);
            imageView39.setImageResource(R.drawable.ic_botas_gratis);
            imageView40.setImageResource(R.drawable.ic_desmaterializador);
            imageView41.setImageResource(R.drawable.ic_velocidad_de_acercamiento);
            imageView42.setImageResource(R.drawable.ic_cronometro);
            imageView43.setImageResource(R.drawable.ic_entrega_de_galletas);
            imageView44.setImageResource(R.drawable.ic_cuerpo_celeste_round);

        }
        if (champId == 14) {
            this.setTitle(R.string.title_caitlyn);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);

            toolbar.setNavigationOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(getApplicationContext(), MainActivity.class));
                    BuildActivity.this.finish();
                }
            });

            imageView1.setImageResource(R.drawable.ic_caitlyn);
            textView1.setText("46,97 %");
            textView2.setText("Adc");
            textView3.setText("2011");
            imageView2.setImageResource(R.drawable.ic_grebas_berserker);
            imageView3.setImageResource(R.drawable.ic_filo_infinito);
            imageView4.setImageResource(R.drawable.ic_statikk);
            imageView5.setImageResource(R.drawable.ic_canon_fuego_rapido);
            imageView6.setImageResource(R.drawable.ic_recuerdos_lord_dominik);
            imageView7.setImageResource(R.drawable.ic_sanguinaria);
            imageView8.setImageResource(R.drawable.ic_flash);
            imageView9.setImageResource(R.drawable.ic_heal);
            imageView10.setPadding(0, 0, 0, 0);
            imageView11.setPadding(0, 0, 0, 0);
            imageView12.setImageResource(R.drawable.ic_espada_de_doran);
            imageView13.setImageResource(R.drawable.ic_pocion);
            imageView14.setImageResource(R.drawable.ic_caitlyn_lvl);
            imageView15.setImageResource(R.drawable.ic_precision_round);
            imageView16.setImageResource(R.drawable.ic_domination);
            imageView17.setImageResource(R.drawable.ic_brujeria);
            imageView18.setImageResource(R.drawable.ic_valor);
            imageView19.setImageResource(R.drawable.ic_inspiracion);
            imageView20.setImageResource(R.drawable.ic_domination);
            imageView21.setImageResource(R.drawable.ic_brujeria_round);
            imageView22.setImageResource(R.drawable.ic_valor);
            imageView23.setImageResource(R.drawable.ic_inspiracion);
            imageView24.setImageResource(R.drawable.ic_ataque_intesificado);
            imageView25.setImageResource(R.drawable.ic_super_curacion_round);
            imageView26.setImageResource(R.drawable.ic_leyenda_presteza_round);
            imageView27.setImageResource(R.drawable.ic_golpe_de_gracia_round);
            imageView28.setImageResource(R.drawable.ic_compas_letal);
            imageView29.setImageResource(R.drawable.ic_triumfo);
            imageView30.setImageResource(R.drawable.ic_leyenda_tenacidad);
            imageView31.setImageResource(R.drawable.ic_derribado);
            imageView32.setImageResource(R.drawable.ic_pies_ligeros_round);
            imageView33.setImageResource(R.drawable.ic_claridad_mental);
            imageView34.setImageResource(R.drawable.ic_leyenda_linaje);
            imageView35.setImageResource(R.drawable.ic_ultimo_esfuerzo);
            imageView36.setImageResource(R.drawable.ic_orbe_anulador);
            imageView37.setImageResource(R.drawable.ic_trascendencia);
            imageView38.setImageResource(R.drawable.ic_pirolaser);
            imageView39.setImageResource(R.drawable.ic_banda_de_mana);
            imageView40.setImageResource(R.drawable.ic_celeridad_round);
            imageView41.setImageResource(R.drawable.ic_caminar_sobre_agua);
            imageView42.setImageResource(R.drawable.ic_sombrero_definitivo);
            imageView43.setImageResource(R.drawable.ic_concentracion_absoluta);
            imageView44.setImageResource(R.drawable.ic_se_avecina_tormenta_round);


        }
        if (champId == 15) {
            this.setTitle(R.string.title_camille);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);

            toolbar.setNavigationOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(getApplicationContext(), MainActivity.class));
                    BuildActivity.this.finish();
                }
            });

            imageView1.setImageResource(R.drawable.ic_camille);
            textView1.setText("49,63 %");
            textView2.setText("Top");
            textView3.setText("2016");
            imageView2.setImageResource(R.drawable.ic_tabi_ninja);
            imageView3.setImageResource(R.drawable.ic_trinidad);
            imageView4.setImageResource(R.drawable.ic_angel_de_la_guarda);
            imageView5.setImageResource(R.drawable.ic_sterak);
            imageView6.setImageResource(R.drawable.ic_angel_de_la_guarda);
            imageView7.setImageResource(R.drawable.ic_randuin);
            imageView8.setImageResource(R.drawable.ic_flash);
            imageView9.setImageResource(R.drawable.ic_teleport);
            imageView10.setPadding(0, 0, 0, 0);
            imageView11.setPadding(0, 0, 0, 0);
            imageView12.setImageResource(R.drawable.ic_espada_de_doran);
            imageView13.setImageResource(R.drawable.ic_pocion);
            imageView14.setImageResource(R.drawable.ic_camille_lvl);
            imageView15.setImageResource(R.drawable.ic_precision);
            imageView16.setImageResource(R.drawable.ic_domination);
            imageView17.setImageResource(R.drawable.ic_brujeria_round);
            imageView18.setImageResource(R.drawable.ic_valor);
            imageView19.setImageResource(R.drawable.ic_inspiracion);
            imageView20.setImageResource(R.drawable.ic_precision);
            imageView21.setImageResource(R.drawable.ic_domination);
            imageView22.setImageResource(R.drawable.ic_valor_round);
            imageView23.setImageResource(R.drawable.ic_inspiracion);
            imageView24.setImageResource(R.drawable.ic_aery);
            imageView25.setImageResource(R.drawable.ic_orbe_anulador);
            imageView26.setImageResource(R.drawable.ic_trascendencia);
            imageView27.setImageResource(R.drawable.ic_pirolaser_round);
            imageView28.setImageResource(R.drawable.ic_cometa_arcano_round);
            imageView29.setImageResource(R.drawable.ic_banda_de_mana_round);
            imageView30.setImageResource(R.drawable.ic_celeridad_round);
            imageView31.setImageResource(R.drawable.ic_caminar_sobre_agua);
            imageView32.setImageResource(R.drawable.ic_irrupcion_de_fase);
            imageView33.setImageResource(R.drawable.ic_sombrero_definitivo);
            imageView34.setImageResource(R.drawable.ic_concentracion_absoluta);
            imageView35.setImageResource(R.drawable.ic_se_avecina_tormenta);
            imageView36.setImageResource(R.drawable.ic_inquebrantable);
            imageView37.setImageResource(R.drawable.ic_piel_de_hierro_round);
            imageView38.setImageResource(R.drawable.ic_sobrecrecimiento);
            imageView39.setImageResource(R.drawable.ic_demoler);
            imageView40.setImageResource(R.drawable.ic_concha_espejo);
            imageView41.setImageResource(R.drawable.ic_revitalizar);
            imageView42.setImageResource(R.drawable.ic_fuente_de_vida);
            imageView43.setImageResource(R.drawable.ic_condicionamiento);
            imageView44.setImageResource(R.drawable.ic_fuentes_renovadas_round);

        }
        if (champId == 16) {
            this.setTitle(R.string.title_cassiopeia);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);

            toolbar.setNavigationOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(getApplicationContext(), MainActivity.class));
                    BuildActivity.this.finish();
                }
            });

            imageView1.setImageResource(R.drawable.ic_cassiopeia);
            textView1.setText("47,71 %");
            textView2.setText("Mid");
            textView3.setText("2010");
            imageView2.setImageResource(R.drawable.ic_vara_de_las_edades);
            imageView3.setImageResource(R.drawable.ic_morellonomicon);
            imageView4.setImageResource(R.drawable.ic_baston_del_arcangel);
            imageView5.setImageResource(R.drawable.ic_baston_del_vacio);
            imageView6.setImageResource(R.drawable.ic_reloj_zhonya);
            imageView7.setImageResource(R.drawable.ic_rabadon);
            imageView8.setImageResource(R.drawable.ic_flash);
            imageView9.setImageResource(R.drawable.ic_heal);
            imageView10.setPadding(0, 0, 0, 0);
            imageView11.setImageResource(R.drawable.ic_anillo_de_doran);
            imageView12.setImageResource(R.drawable.ic_pocion);
            imageView13.setImageResource(R.drawable.ic_pocion);
            imageView14.setImageResource(R.drawable.ic_cassiopeia_lvl);
            imageView15.setImageResource(R.drawable.ic_precision);
            imageView16.setImageResource(R.drawable.ic_domination);
            imageView17.setImageResource(R.drawable.ic_brujeria_round);
            imageView18.setImageResource(R.drawable.ic_valor);
            imageView19.setImageResource(R.drawable.ic_inspiracion);
            imageView20.setImageResource(R.drawable.ic_precision_round);
            imageView21.setImageResource(R.drawable.ic_domination);
            imageView22.setImageResource(R.drawable.ic_valor);
            imageView23.setImageResource(R.drawable.ic_inspiracion);
            imageView24.setImageResource(R.drawable.ic_aery);
            imageView25.setImageResource(R.drawable.ic_orbe_anulador);
            imageView26.setImageResource(R.drawable.ic_trascendencia);
            imageView27.setImageResource(R.drawable.ic_pirolaser_round);
            imageView28.setImageResource(R.drawable.ic_cometa_arcano);
            imageView29.setImageResource(R.drawable.ic_banda_de_mana_round);
            imageView30.setImageResource(R.drawable.ic_celeridad_round);
            imageView31.setImageResource(R.drawable.ic_caminar_sobre_agua);
            imageView32.setImageResource(R.drawable.ic_irrupcion_de_fase_round);
            imageView33.setImageResource(R.drawable.ic_sombrero_definitivo);
            imageView34.setImageResource(R.drawable.ic_concentracion_absoluta);
            imageView35.setImageResource(R.drawable.ic_se_avecina_tormenta);
            imageView36.setImageResource(R.drawable.ic_super_curacion);
            imageView37.setImageResource(R.drawable.ic_leyenda_presteza);
            imageView38.setImageResource(R.drawable.ic_golpe_de_gracia_round);
            imageView39.setImageResource(R.drawable.ic_triumfo);
            imageView40.setImageResource(R.drawable.ic_leyenda_tenacidad);
            imageView41.setImageResource(R.drawable.ic_derribado);
            imageView42.setImageResource(R.drawable.ic_claridad_mental_round);
            imageView43.setImageResource(R.drawable.ic_leyenda_linaje);
            imageView44.setImageResource(R.drawable.ic_ultimo_esfuerzo);

        }
        if (champId == 17) {
            this.setTitle(R.string.title_cho_gath);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);

            toolbar.setNavigationOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(getApplicationContext(), MainActivity.class));
                    BuildActivity.this.finish();
                }
            });

            imageView1.setImageResource(R.drawable.ic_chogath);
            textView1.setText("48,54 %");
            textView2.setText("Top");
            textView3.setText("2009");
            imageView2.setImageResource(R.drawable.ic_tabi_ninja);
            imageView3.setImageResource(R.drawable.ic_gloria_justiciera);
            imageView4.setImageResource(R.drawable.ic_warmog);
            imageView5.setImageResource(R.drawable.ic_gargola);
            imageView6.setImageResource(R.drawable.ic_malla_de_espinas);
            imageView7.setImageResource(R.drawable.ic_rostro_espiritual);
            imageView8.setImageResource(R.drawable.ic_flash);
            imageView9.setImageResource(R.drawable.ic_teleport);
            imageView10.setPadding(0, 0, 0, 0);
            imageView11.setPadding(0, 0, 0, 0);
            imageView12.setImageResource(R.drawable.ic_escudo_de_doran);
            imageView13.setImageResource(R.drawable.ic_pocion);
            imageView14.setImageResource(R.drawable.ic_cho_gath_lvl);
            imageView15.setImageResource(R.drawable.ic_precision);
            imageView16.setImageResource(R.drawable.ic_domination);
            imageView17.setImageResource(R.drawable.ic_brujeria);
            imageView18.setImageResource(R.drawable.ic_valor_round);
            imageView19.setImageResource(R.drawable.ic_inspiracion);
            imageView20.setImageResource(R.drawable.ic_precision);
            imageView21.setImageResource(R.drawable.ic_domination);
            imageView22.setImageResource(R.drawable.ic_brujeria_round);
            imageView23.setImageResource(R.drawable.ic_inspiracion);
            imageView24.setImageResource(R.drawable.ic_garras_del_inmortal_round);
            imageView25.setImageResource(R.drawable.ic_inquebrantable);
            imageView26.setImageResource(R.drawable.ic_piel_de_hierro);
            imageView27.setImageResource(R.drawable.ic_sobrecrecimiento_round);
            imageView28.setImageResource(R.drawable.ic_reverberacion);
            imageView29.setImageResource(R.drawable.ic_demoler_round);
            imageView30.setImageResource(R.drawable.ic_concha_espejo);
            imageView31.setImageResource(R.drawable.ic_revitalizar);
            imageView32.setImageResource(R.drawable.ic_protector);
            imageView33.setImageResource(R.drawable.ic_fuente_de_vida);
            imageView34.setImageResource(R.drawable.ic_condicionamiento_round);
            imageView35.setImageResource(R.drawable.ic_fuentes_renovadas);
            imageView36.setImageResource(R.drawable.ic_orbe_anulador);
            imageView37.setImageResource(R.drawable.ic_trascendencia_round);
            imageView38.setImageResource(R.drawable.ic_pirolaser);
            imageView39.setImageResource(R.drawable.ic_banda_de_mana);
            imageView40.setImageResource(R.drawable.ic_celeridad);
            imageView41.setImageResource(R.drawable.ic_caminar_sobre_agua);
            imageView42.setImageResource(R.drawable.ic_sombrero_definitivo_round);
            imageView43.setImageResource(R.drawable.ic_concentracion_absoluta);
            imageView44.setImageResource(R.drawable.ic_se_avecina_tormenta);

        }
        if (champId == 18) {
            this.setTitle(R.string.title_corki);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);

            toolbar.setNavigationOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(getApplicationContext(), MainActivity.class));
                    BuildActivity.this.finish();
                }
            });

            imageView1.setImageResource(R.drawable.ic_corki);
            textView1.setText("50,26 %");
            textView2.setText("Mid");
            textView3.setText("2009");
            imageView2.setImageResource(R.drawable.ic_trinidad);
            imageView3.setImageResource(R.drawable.ic_botas_hechizero);
            imageView4.setImageResource(R.drawable.ic_filo_infinito);
            imageView5.setImageResource(R.drawable.ic_canon_fuego_rapido);
            imageView6.setImageResource(R.drawable.ic_statikk);
            imageView7.setImageResource(R.drawable.ic_angel_de_la_guarda);
            imageView8.setImageResource(R.drawable.ic_flash);
            imageView9.setImageResource(R.drawable.ic_teleport);
            imageView10.setPadding(0, 0, 0, 0);
            imageView11.setPadding(0, 0, 0, 0);
            imageView12.setImageResource(R.drawable.ic_espada_de_doran);
            imageView13.setImageResource(R.drawable.ic_pocion);
            imageView14.setImageResource(R.drawable.ic_corki_lvl);
            imageView15.setImageResource(R.drawable.ic_precision_round);
            imageView16.setImageResource(R.drawable.ic_domination);
            imageView17.setImageResource(R.drawable.ic_brujeria);
            imageView18.setImageResource(R.drawable.ic_valor);
            imageView19.setImageResource(R.drawable.ic_inspiracion);
            imageView20.setImageResource(R.drawable.ic_domination);
            imageView21.setImageResource(R.drawable.ic_brujeria_round);
            imageView22.setImageResource(R.drawable.ic_valor);
            imageView23.setImageResource(R.drawable.ic_inspiracion);
            imageView24.setImageResource(R.drawable.ic_ataque_intesificado);
            imageView25.setImageResource(R.drawable.ic_super_curacion);
            imageView26.setImageResource(R.drawable.ic_leyenda_presteza_round);
            imageView27.setImageResource(R.drawable.ic_golpe_de_gracia_round);
            imageView28.setImageResource(R.drawable.ic_compas_letal);
            imageView29.setImageResource(R.drawable.ic_triumfo_round);
            imageView30.setImageResource(R.drawable.ic_leyenda_tenacidad);
            imageView31.setImageResource(R.drawable.ic_derribado);
            imageView32.setImageResource(R.drawable.ic_pies_ligeros_round);
            imageView33.setImageResource(R.drawable.ic_claridad_mental);
            imageView34.setImageResource(R.drawable.ic_leyenda_linaje);
            imageView35.setImageResource(R.drawable.ic_ultimo_esfuerzo);
            imageView36.setImageResource(R.drawable.ic_orbe_anulador);
            imageView37.setImageResource(R.drawable.ic_trascendencia);
            imageView38.setImageResource(R.drawable.ic_pirolaser);
            imageView39.setImageResource(R.drawable.ic_banda_de_mana_round);
            imageView40.setImageResource(R.drawable.ic_celeridad_round);
            imageView41.setImageResource(R.drawable.ic_caminar_sobre_agua);
            imageView42.setImageResource(R.drawable.ic_sombrero_definitivo);
            imageView43.setImageResource(R.drawable.ic_concentracion_absoluta);
            imageView44.setImageResource(R.drawable.ic_se_avecina_tormenta);

        }
        if (champId == 19) {
            this.setTitle(R.string.title_darius);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);

            toolbar.setNavigationOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(getApplicationContext(), MainActivity.class));
                    BuildActivity.this.finish();
                }
            });

            imageView1.setImageResource(R.drawable.ic_darius);
            textView1.setText("50,51 %");
            textView2.setText("Top");
            textView3.setText("2012");
            imageView2.setImageResource(R.drawable.ic_tabi_ninja);
            imageView3.setImageResource(R.drawable.ic_cuchilla_negra);
            imageView4.setImageResource(R.drawable.ic_coraza_del_hombre_muerto);
            imageView5.setImageResource(R.drawable.ic_rostro_espiritual);
            imageView6.setImageResource(R.drawable.ic_malla_de_espinas);
            imageView7.setImageResource(R.drawable.ic_randuin);
            imageView8.setImageResource(R.drawable.ic_flash);
            imageView9.setImageResource(R.drawable.ic_teleport);
            imageView10.setPadding(0, 0, 0, 0);
            imageView11.setPadding(0, 0, 0, 0);
            imageView12.setImageResource(R.drawable.ic_escudo_de_doran);
            imageView13.setImageResource(R.drawable.ic_pocion);
            imageView14.setImageResource(R.drawable.ic_darius_lvl);
            imageView15.setImageResource(R.drawable.ic_precision);
            imageView16.setImageResource(R.drawable.ic_domination);
            imageView17.setImageResource(R.drawable.ic_brujeria_round);
            imageView18.setImageResource(R.drawable.ic_valor);
            imageView19.setImageResource(R.drawable.ic_inspiracion);
            imageView20.setImageResource(R.drawable.ic_precision_round);
            imageView21.setImageResource(R.drawable.ic_domination);
            imageView22.setImageResource(R.drawable.ic_valor);
            imageView23.setImageResource(R.drawable.ic_inspiracion);
            imageView24.setImageResource(R.drawable.ic_aery);
            imageView25.setImageResource(R.drawable.ic_orbe_anulador);
            imageView26.setImageResource(R.drawable.ic_trascendencia);
            imageView27.setImageResource(R.drawable.ic_pirolaser_round);
            imageView28.setImageResource(R.drawable.ic_cometa_arcano);
            imageView29.setImageResource(R.drawable.ic_banda_de_mana_round);
            imageView30.setImageResource(R.drawable.ic_celeridad_round);
            imageView31.setImageResource(R.drawable.ic_caminar_sobre_agua);
            imageView32.setImageResource(R.drawable.ic_irrupcion_de_fase_round);
            imageView33.setImageResource(R.drawable.ic_sombrero_definitivo);
            imageView34.setImageResource(R.drawable.ic_concentracion_absoluta);
            imageView35.setImageResource(R.drawable.ic_se_avecina_tormenta);
            imageView36.setImageResource(R.drawable.ic_super_curacion);
            imageView37.setImageResource(R.drawable.ic_leyenda_presteza_round);
            imageView38.setImageResource(R.drawable.ic_golpe_de_gracia);
            imageView39.setImageResource(R.drawable.ic_triumfo_round);
            imageView40.setImageResource(R.drawable.ic_leyenda_tenacidad);
            imageView41.setImageResource(R.drawable.ic_derribado);
            imageView42.setImageResource(R.drawable.ic_claridad_mental);
            imageView43.setImageResource(R.drawable.ic_leyenda_linaje);
            imageView44.setImageResource(R.drawable.ic_ultimo_esfuerzo);

        }
        if (champId == 20) {
            this.setTitle(R.string.title_diana);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);

            toolbar.setNavigationOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(getApplicationContext(), MainActivity.class));
                    BuildActivity.this.finish();
                }
            });

            imageView1.setImageResource(R.drawable.ic_diana);
            textView1.setText("51,68 %");
            textView2.setText("Mid");
            textView3.setText("2012");
            imageView2.setImageResource(R.drawable.ic_diente_nashor);
            imageView3.setImageResource(R.drawable.ic_botas_hechizero);
            imageView4.setImageResource(R.drawable.ic_reloj_zhonya);
            imageView5.setImageResource(R.drawable.ic_perdicion_del_liche);
            imageView6.setImageResource(R.drawable.ic_reloj_zhonya);
            imageView7.setImageResource(R.drawable.ic_baston_del_vacio);
            imageView8.setImageResource(R.drawable.ic_flash);
            imageView9.setImageResource(R.drawable.ic_ignite);
            imageView10.setPadding(0, 0, 0, 0);
            imageView11.setImageResource(R.drawable.ic_anillo_de_doran);
            imageView12.setImageResource(R.drawable.ic_pocion);
            imageView13.setImageResource(R.drawable.ic_pocion);
            imageView14.setImageResource(R.drawable.ic_diana_lvl);
            imageView15.setImageResource(R.drawable.ic_precision);
            imageView16.setImageResource(R.drawable.ic_domination_round);
            imageView17.setImageResource(R.drawable.ic_brujeria);
            imageView18.setImageResource(R.drawable.ic_valor);
            imageView19.setImageResource(R.drawable.ic_inspiracion);
            imageView20.setImageResource(R.drawable.ic_precision_round);
            imageView21.setImageResource(R.drawable.ic_brujeria);
            imageView22.setImageResource(R.drawable.ic_valor);
            imageView23.setImageResource(R.drawable.ic_inspiracion);
            imageView24.setImageResource(R.drawable.ic_electrocutar_round);
            imageView25.setImageResource(R.drawable.ic_golpe_bajo);
            imageView26.setImageResource(R.drawable.ic_guardian_zombi);
            imageView27.setImageResource(R.drawable.ic_cazador_voraz_round);
            imageView28.setImageResource(R.drawable.ic_depredador);
            imageView29.setImageResource(R.drawable.ic_sabor_a_sangre);
            imageView30.setImageResource(R.drawable.ic_poro_fantasmal);
            imageView31.setImageResource(R.drawable.ic_cazador_ingenioso);
            imageView32.setImageResource(R.drawable.ic_cosecha_oscura);
            imageView33.setImageResource(R.drawable.ic_impacto_repentino_round);
            imageView34.setImageResource(R.drawable.ic_coleccion_de_globos_oculares_round);
            imageView35.setImageResource(R.drawable.ic_cazador_incesante);
            imageView36.setImageResource(R.drawable.ic_super_curacion);
            imageView37.setImageResource(R.drawable.ic_leyenda_presteza);
            imageView38.setImageResource(R.drawable.ic_golpe_de_gracia_round);
            imageView39.setImageResource(R.drawable.ic_triumfo_round);
            imageView40.setImageResource(R.drawable.ic_leyenda_tenacidad);
            imageView41.setImageResource(R.drawable.ic_derribado);
            imageView42.setImageResource(R.drawable.ic_claridad_mental);
            imageView43.setImageResource(R.drawable.ic_leyenda_linaje);
            imageView44.setImageResource(R.drawable.ic_ultimo_esfuerzo);

        }
        if (champId == 21) {
            this.setTitle(R.string.title_dr_mundo);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);

            toolbar.setNavigationOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(getApplicationContext(), MainActivity.class));
                    BuildActivity.this.finish();
                }
            });

            imageView1.setImageResource(R.drawable.ic_dr_mundo);
            textView1.setText("49,01 %");
            textView2.setText("Top");
            textView3.setText("2019");
            imageView2.setImageResource(R.drawable.ic_tabi_ninja);
            imageView3.setImageResource(R.drawable.ic_capa_de_fuego_solar);
            imageView4.setImageResource(R.drawable.ic_rostro_espiritual);
            imageView5.setImageResource(R.drawable.ic_malla_de_espinas);
            imageView6.setImageResource(R.drawable.ic_warmog);
            imageView7.setImageResource(R.drawable.ic_coraza_del_hombre_muerto);
            imageView8.setImageResource(R.drawable.ic_flash);
            imageView9.setImageResource(R.drawable.ic_teleport);
            imageView10.setPadding(0, 0, 0, 0);
            imageView11.setPadding(0, 0, 0, 0);
            imageView12.setImageResource(R.drawable.ic_escudo_de_doran);
            imageView13.setImageResource(R.drawable.ic_pocion);
            imageView14.setImageResource(R.drawable.ic_dr_mundo_lvl);
            imageView15.setImageResource(R.drawable.ic_precision);
            imageView16.setImageResource(R.drawable.ic_domination);
            imageView17.setImageResource(R.drawable.ic_brujeria);
            imageView18.setImageResource(R.drawable.ic_valor_round);
            imageView19.setImageResource(R.drawable.ic_inspiracion);
            imageView20.setImageResource(R.drawable.ic_precision);
            imageView21.setImageResource(R.drawable.ic_domination);
            imageView22.setImageResource(R.drawable.ic_brujeria_round);
            imageView23.setImageResource(R.drawable.ic_inspiracion);
            imageView24.setImageResource(R.drawable.ic_garras_del_inmortal_round);
            imageView25.setImageResource(R.drawable.ic_inquebrantable_round);
            imageView26.setImageResource(R.drawable.ic_piel_de_hierro_round);
            imageView27.setImageResource(R.drawable.ic_sobrecrecimiento_round);
            imageView28.setImageResource(R.drawable.ic_reverberacion);
            imageView29.setImageResource(R.drawable.ic_demoler);
            imageView30.setImageResource(R.drawable.ic_concha_espejo);
            imageView31.setImageResource(R.drawable.ic_revitalizar);
            imageView32.setImageResource(R.drawable.ic_protector);
            imageView33.setImageResource(R.drawable.ic_fuente_de_vida);
            imageView34.setImageResource(R.drawable.ic_condicionamiento);
            imageView35.setImageResource(R.drawable.ic_fuentes_renovadas);
            imageView36.setImageResource(R.drawable.ic_orbe_anulador_round);
            imageView37.setImageResource(R.drawable.ic_trascendencia);
            imageView38.setImageResource(R.drawable.ic_pirolaser_round);
            imageView39.setImageResource(R.drawable.ic_banda_de_mana);
            imageView40.setImageResource(R.drawable.ic_celeridad);
            imageView41.setImageResource(R.drawable.ic_caminar_sobre_agua);
            imageView42.setImageResource(R.drawable.ic_sombrero_definitivo);
            imageView43.setImageResource(R.drawable.ic_concentracion_absoluta);
            imageView44.setImageResource(R.drawable.ic_se_avecina_tormenta);


        }
        if (champId == 22) {
            this.setTitle(R.string.title_draven);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);

            toolbar.setNavigationOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(getApplicationContext(), MainActivity.class));
                    BuildActivity.this.finish();
                }
            });

            imageView1.setImageResource(R.drawable.ic_draven);
            textView1.setText("49,36 %");
            textView2.setText("Adc");
            textView3.setText("2012");
            imageView2.setImageResource(R.drawable.ic_filo_infinito);
            imageView3.setImageResource(R.drawable.ic_grebas_berserker);
            imageView4.setImageResource(R.drawable.ic_statikk);
            imageView5.setImageResource(R.drawable.ic_sanguinaria);
            imageView6.setImageResource(R.drawable.ic_canon_fuego_rapido);
            imageView7.setImageResource(R.drawable.ic_recuerdos_lord_dominik);
            imageView8.setImageResource(R.drawable.ic_flash);
            imageView9.setImageResource(R.drawable.ic_heal);
            imageView10.setPadding(0, 0, 0, 0);
            imageView11.setPadding(0, 0, 0, 0);
            imageView12.setImageResource(R.drawable.ic_espada_de_doran);
            imageView13.setImageResource(R.drawable.ic_pocion);
            imageView14.setImageResource(R.drawable.ic_draven_lvl);
            imageView15.setImageResource(R.drawable.ic_precision);
            imageView16.setImageResource(R.drawable.ic_domination);
            imageView17.setImageResource(R.drawable.ic_brujeria_round);
            imageView18.setImageResource(R.drawable.ic_valor);
            imageView19.setImageResource(R.drawable.ic_inspiracion);
            imageView20.setImageResource(R.drawable.ic_precision_round);
            imageView21.setImageResource(R.drawable.ic_domination);
            imageView22.setImageResource(R.drawable.ic_valor);
            imageView23.setImageResource(R.drawable.ic_inspiracion);
            imageView24.setImageResource(R.drawable.ic_aery_round);
            imageView25.setImageResource(R.drawable.ic_orbe_anulador);
            imageView26.setImageResource(R.drawable.ic_trascendencia);
            imageView27.setImageResource(R.drawable.ic_pirolaser);
            imageView28.setImageResource(R.drawable.ic_cometa_arcano);
            imageView29.setImageResource(R.drawable.ic_banda_de_mana_round);
            imageView30.setImageResource(R.drawable.ic_celeridad_round);
            imageView31.setImageResource(R.drawable.ic_caminar_sobre_agua);
            imageView32.setImageResource(R.drawable.ic_irrupcion_de_fase);
            imageView33.setImageResource(R.drawable.ic_sombrero_definitivo);
            imageView34.setImageResource(R.drawable.ic_concentracion_absoluta);
            imageView35.setImageResource(R.drawable.ic_se_avecina_tormenta_round);
            imageView36.setImageResource(R.drawable.ic_super_curacion);
            imageView37.setImageResource(R.drawable.ic_leyenda_presteza_round);
            imageView38.setImageResource(R.drawable.ic_golpe_de_gracia_round);
            imageView39.setImageResource(R.drawable.ic_triumfo);
            imageView40.setImageResource(R.drawable.ic_leyenda_tenacidad);
            imageView41.setImageResource(R.drawable.ic_derribado);
            imageView42.setImageResource(R.drawable.ic_claridad_mental);
            imageView43.setImageResource(R.drawable.ic_leyenda_linaje);
            imageView44.setImageResource(R.drawable.ic_ultimo_esfuerzo);

        }
        if (champId == 23) {
            this.setTitle(R.string.title_ekko);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);

            toolbar.setNavigationOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(getApplicationContext(), MainActivity.class));
                    BuildActivity.this.finish();
                }
            });

            imageView1.setImageResource(R.drawable.ic_ekko);
            textView1.setText("50,35 %");
            textView2.setText("Mid");
            textView3.setText("2015");
            imageView2.setImageResource(R.drawable.ic_protocinturon);
            imageView3.setImageResource(R.drawable.ic_botas_hechizero);
            imageView4.setImageResource(R.drawable.ic_perdicion_del_liche);
            imageView5.setImageResource(R.drawable.ic_reloj_zhonya);
            imageView6.setImageResource(R.drawable.ic_baston_del_vacio);
            imageView7.setImageResource(R.drawable.ic_rabadon);
            imageView8.setImageResource(R.drawable.ic_flash);
            imageView9.setImageResource(R.drawable.ic_teleport);
            imageView10.setPadding(0, 0, 0, 0);
            imageView11.setImageResource(R.drawable.ic_anillo_de_doran);
            imageView12.setImageResource(R.drawable.ic_pocion);
            imageView13.setImageResource(R.drawable.ic_pocion);
            imageView14.setImageResource(R.drawable.ic_ekko_lvl);
            imageView15.setImageResource(R.drawable.ic_precision);
            imageView16.setImageResource(R.drawable.ic_domination_round);
            imageView17.setImageResource(R.drawable.ic_brujeria);
            imageView18.setImageResource(R.drawable.ic_valor);
            imageView19.setImageResource(R.drawable.ic_inspiracion);
            imageView20.setImageResource(R.drawable.ic_precision);
            imageView21.setImageResource(R.drawable.ic_brujeria_round);
            imageView22.setImageResource(R.drawable.ic_valor);
            imageView23.setImageResource(R.drawable.ic_inspiracion);
            imageView24.setImageResource(R.drawable.ic_electrocutar_round);
            imageView25.setImageResource(R.drawable.ic_golpe_bajo);
            imageView26.setImageResource(R.drawable.ic_guardian_zombi);
            imageView27.setImageResource(R.drawable.ic_cazador_voraz_round);
            imageView28.setImageResource(R.drawable.ic_depredador);
            imageView29.setImageResource(R.drawable.ic_sabor_a_sangre);
            imageView30.setImageResource(R.drawable.ic_poro_fantasmal);
            imageView31.setImageResource(R.drawable.ic_cazador_ingenioso);
            imageView32.setImageResource(R.drawable.ic_cosecha_oscura);
            imageView33.setImageResource(R.drawable.ic_impacto_repentino_round);
            imageView34.setImageResource(R.drawable.ic_coleccion_de_globos_oculares_round);
            imageView35.setImageResource(R.drawable.ic_cazador_incesante);
            imageView36.setImageResource(R.drawable.ic_orbe_anulador);
            imageView37.setImageResource(R.drawable.ic_trascendencia_round);
            imageView38.setImageResource(R.drawable.ic_pirolaser);
            imageView39.setImageResource(R.drawable.ic_banda_de_mana);
            imageView40.setImageResource(R.drawable.ic_celeridad);
            imageView41.setImageResource(R.drawable.ic_caminar_sobre_agua);
            imageView42.setImageResource(R.drawable.ic_sombrero_definitivo);
            imageView43.setImageResource(R.drawable.ic_concentracion_absoluta);
            imageView44.setImageResource(R.drawable.ic_se_avecina_tormenta_round);

        }
        if (champId == 24) {
            this.setTitle(R.string.title_elise);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);

            toolbar.setNavigationOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(getApplicationContext(), MainActivity.class));
                    BuildActivity.this.finish();
                }
            });

            imageView1.setImageResource(R.drawable.ic_elise);
            textView1.setText("52,06 %");
            textView2.setText("Jung");
            textView3.setText("2012");
            imageView2.setImageResource(R.drawable.ic_botas_movilidad);
            imageView3.setImageResource(R.drawable.ic_azul_ecos_runicos);
            imageView4.setImageResource(R.drawable.ic_protocinturon);
            imageView5.setImageResource(R.drawable.ic_tormento_de_liandry);
            imageView6.setImageResource(R.drawable.ic_reloj_zhonya);
            imageView7.setImageResource(R.drawable.ic_coraza_del_hombre_muerto);
            imageView8.setImageResource(R.drawable.ic_flash);
            imageView9.setImageResource(R.drawable.ic_smite);
            imageView10.setPadding(0, 0, 0, 0);
            imageView11.setPadding(0, 0, 0, 0);
            imageView12.setImageResource(R.drawable.ic_machete_del_cazador);
            imageView13.setImageResource(R.drawable.ic_pocion_reutilizable);
            imageView14.setImageResource(R.drawable.ic_elise_lvl);
            imageView15.setImageResource(R.drawable.ic_precision);
            imageView16.setImageResource(R.drawable.ic_domination_round);
            imageView17.setImageResource(R.drawable.ic_brujeria);
            imageView18.setImageResource(R.drawable.ic_valor);
            imageView19.setImageResource(R.drawable.ic_inspiracion);
            imageView20.setImageResource(R.drawable.ic_precision);
            imageView21.setImageResource(R.drawable.ic_brujeria_round);
            imageView22.setImageResource(R.drawable.ic_valor);
            imageView23.setImageResource(R.drawable.ic_inspiracion);
            imageView24.setImageResource(R.drawable.ic_electrocutar_round);
            imageView25.setImageResource(R.drawable.ic_golpe_bajo_round);
            imageView26.setImageResource(R.drawable.ic_guardian_zombi);
            imageView27.setImageResource(R.drawable.ic_cazador_voraz);
            imageView28.setImageResource(R.drawable.ic_depredador);
            imageView29.setImageResource(R.drawable.ic_sabor_a_sangre);
            imageView30.setImageResource(R.drawable.ic_poro_fantasmal);
            imageView31.setImageResource(R.drawable.ic_cazador_ingenioso);
            imageView32.setImageResource(R.drawable.ic_cosecha_oscura);
            imageView33.setImageResource(R.drawable.ic_impacto_repentino);
            imageView34.setImageResource(R.drawable.ic_coleccion_de_globos_oculares_round);
            imageView35.setImageResource(R.drawable.ic_cazador_incesante_round);
            imageView36.setImageResource(R.drawable.ic_orbe_anulador);
            imageView37.setImageResource(R.drawable.ic_trascendencia);
            imageView38.setImageResource(R.drawable.ic_pirolaser_round);
            imageView39.setImageResource(R.drawable.ic_banda_de_mana);
            imageView40.setImageResource(R.drawable.ic_celeridad_round);
            imageView41.setImageResource(R.drawable.ic_caminar_sobre_agua);
            imageView42.setImageResource(R.drawable.ic_sombrero_definitivo);
            imageView43.setImageResource(R.drawable.ic_concentracion_absoluta);
            imageView44.setImageResource(R.drawable.ic_se_avecina_tormenta);

        }
        if (champId == 25) {
            this.setTitle(R.string.title_evelynn);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);

            toolbar.setNavigationOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(getApplicationContext(), MainActivity.class));
                    BuildActivity.this.finish();
                }
            });

            imageView1.setImageResource(R.drawable.ic_evelynn);
            textView1.setText("52,72 %");
            textView2.setText("Jung");
            textView3.setText("2009");
            imageView2.setImageResource(R.drawable.ic_azul_ecos_runicos);
            imageView3.setImageResource(R.drawable.ic_botas_hechizero);
            imageView4.setImageResource(R.drawable.ic_perdicion_del_liche);
            imageView5.setImageResource(R.drawable.ic_tormento_de_liandry);
            imageView6.setImageResource(R.drawable.ic_baston_del_vacio);
            imageView7.setImageResource(R.drawable.ic_rabadon);
            imageView8.setImageResource(R.drawable.ic_flash);
            imageView9.setImageResource(R.drawable.ic_ignite);
            imageView10.setPadding(0, 0, 0, 0);
            imageView11.setPadding(0, 0, 0, 0);
            imageView12.setImageResource(R.drawable.ic_talisman_del_cazador);
            imageView13.setImageResource(R.drawable.ic_pocion_reutilizable);
            imageView14.setImageResource(R.drawable.ic_evelynn_lvl);
            imageView15.setImageResource(R.drawable.ic_precision);
            imageView16.setImageResource(R.drawable.ic_domination_round);
            imageView17.setImageResource(R.drawable.ic_brujeria);
            imageView18.setImageResource(R.drawable.ic_valor);
            imageView19.setImageResource(R.drawable.ic_inspiracion);
            imageView20.setImageResource(R.drawable.ic_precision);
            imageView21.setImageResource(R.drawable.ic_brujeria_round);
            imageView22.setImageResource(R.drawable.ic_valor);
            imageView23.setImageResource(R.drawable.ic_inspiracion);
            imageView24.setImageResource(R.drawable.ic_electrocutar_round);
            imageView25.setImageResource(R.drawable.ic_golpe_bajo);
            imageView26.setImageResource(R.drawable.ic_guardian_zombi);
            imageView27.setImageResource(R.drawable.ic_cazador_voraz);
            imageView28.setImageResource(R.drawable.ic_depredador);
            imageView29.setImageResource(R.drawable.ic_sabor_a_sangre);
            imageView30.setImageResource(R.drawable.ic_poro_fantasmal);
            imageView31.setImageResource(R.drawable.ic_cazador_ingenioso);
            imageView32.setImageResource(R.drawable.ic_cosecha_oscura);
            imageView33.setImageResource(R.drawable.ic_impacto_repentino_round);
            imageView34.setImageResource(R.drawable.ic_coleccion_de_globos_oculares_round);
            imageView35.setImageResource(R.drawable.ic_cazador_incesante_round);
            imageView36.setImageResource(R.drawable.ic_orbe_anulador);
            imageView37.setImageResource(R.drawable.ic_trascendencia);
            imageView38.setImageResource(R.drawable.ic_pirolaser);
            imageView39.setImageResource(R.drawable.ic_banda_de_mana);
            imageView40.setImageResource(R.drawable.ic_celeridad_round);
            imageView41.setImageResource(R.drawable.ic_caminar_sobre_agua);
            imageView42.setImageResource(R.drawable.ic_sombrero_definitivo_round);
            imageView43.setImageResource(R.drawable.ic_concentracion_absoluta);
            imageView44.setImageResource(R.drawable.ic_se_avecina_tormenta);

        }
        if (champId == 26) {
            this.setTitle(R.string.title_ezreal);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);

            toolbar.setNavigationOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(getApplicationContext(), MainActivity.class));
                    BuildActivity.this.finish();
                }
            });

            imageView1.setImageResource(R.drawable.ic_ezreal);
            textView1.setText("51,41 %");
            textView2.setText("Adc");
            textView3.setText("2010");
            imageView2.setImageResource(R.drawable.ic_manamune);
            imageView3.setImageResource(R.drawable.botas_jonias);
            imageView4.setImageResource(R.drawable.ic_guantelete_de_hielo);
            imageView5.setImageResource(R.drawable.ic_rey_arruinado);
            imageView6.setImageResource(R.drawable.ic_recuerdos_lord_dominik);
            imageView7.setImageResource(R.drawable.ic_cimitarra_mercurial);
            imageView8.setImageResource(R.drawable.ic_flash);
            imageView9.setImageResource(R.drawable.ic_heal);
            imageView10.setPadding(0, 0, 0, 0);
            imageView11.setPadding(0, 0, 0, 0);
            imageView12.setImageResource(R.drawable.ic_espada_de_doran);
            imageView13.setImageResource(R.drawable.ic_pocion);
            imageView14.setImageResource(R.drawable.ic_ezreal_lvl);
            imageView15.setImageResource(R.drawable.ic_precision);
            imageView16.setImageResource(R.drawable.ic_domination);
            imageView17.setImageResource(R.drawable.ic_brujeria);
            imageView18.setImageResource(R.drawable.ic_valor);
            imageView19.setImageResource(R.drawable.ic_inspiracion_round);
            imageView20.setImageResource(R.drawable.ic_precision);
            imageView21.setImageResource(R.drawable.ic_domination);
            imageView22.setImageResource(R.drawable.ic_brujeria_round);
            imageView23.setImageResource(R.drawable.ic_valor);
            imageView24.setImageResource(R.drawable.ic_libro_de_hechizos);
            imageView25.setImageResource(R.drawable.ic_destello_hextech);
            imageView26.setImageResource(R.drawable.ic_mercado_del_futuro_round);
            imageView27.setImageResource(R.drawable.ic_perspicacia_cosmica_round);
            imageView28.setImageResource(R.drawable.ic_mejora_glacial);
            imageView29.setImageResource(R.drawable.ic_botas_gratis);
            imageView30.setImageResource(R.drawable.ic_desmaterializador);
            imageView31.setImageResource(R.drawable.ic_velocidad_de_acercamiento);
            imageView32.setImageResource(R.drawable.ic_cleptomania_round);
            imageView33.setImageResource(R.drawable.ic_cronometro_round);
            imageView34.setImageResource(R.drawable.ic_entrega_de_galletas);
            imageView35.setImageResource(R.drawable.ic_cuerpo_celeste);
            imageView36.setImageResource(R.drawable.ic_orbe_anulador);
            imageView37.setImageResource(R.drawable.ic_trascendencia);
            imageView38.setImageResource(R.drawable.ic_pirolaser_round);
            imageView39.setImageResource(R.drawable.ic_banda_de_mana_round);
            imageView40.setImageResource(R.drawable.ic_celeridad);
            imageView41.setImageResource(R.drawable.ic_caminar_sobre_agua);
            imageView42.setImageResource(R.drawable.ic_sombrero_definitivo);
            imageView43.setImageResource(R.drawable.ic_concentracion_absoluta);
            imageView44.setImageResource(R.drawable.ic_se_avecina_tormenta);

        }
        if (champId == 27) {
            this.setTitle(R.string.title_fiddlesticks);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);

            toolbar.setNavigationOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(getApplicationContext(), MainActivity.class));
                    BuildActivity.this.finish();
                }
            });

            imageView1.setImageResource(R.drawable.ic_fiddlesticks);
            textView1.setText("52,06 %");
            textView2.setText("Jung");
            textView3.setText("2009");
            imageView2.setImageResource(R.drawable.ic_azul_ecos_runicos);
            imageView3.setImageResource(R.drawable.ic_botas_hechizero);
            imageView4.setImageResource(R.drawable.ic_reloj_zhonya);
            imageView5.setImageResource(R.drawable.ic_tormento_de_liandry);
            imageView6.setImageResource(R.drawable.ic_baston_del_vacio);
            imageView7.setImageResource(R.drawable.ic_rylai);
            imageView8.setImageResource(R.drawable.ic_flash);
            imageView9.setImageResource(R.drawable.ic_smite);
            imageView10.setPadding(0, 0, 0, 0);
            imageView11.setPadding(0, 0, 0, 0);
            imageView12.setImageResource(R.drawable.ic_talisman_del_cazador);
            imageView13.setImageResource(R.drawable.ic_pocion_reutilizable);
            imageView14.setImageResource(R.drawable.ic_fiddlesticks_lvl);
            imageView15.setImageResource(R.drawable.ic_precision);
            imageView16.setImageResource(R.drawable.ic_domination);
            imageView17.setImageResource(R.drawable.ic_brujeria);
            imageView18.setImageResource(R.drawable.ic_valor);
            imageView19.setImageResource(R.drawable.ic_inspiracion_round);
            imageView20.setImageResource(R.drawable.ic_precision);
            imageView21.setImageResource(R.drawable.ic_domination);
            imageView22.setImageResource(R.drawable.ic_brujeria_round);
            imageView23.setImageResource(R.drawable.ic_valor);
            imageView24.setImageResource(R.drawable.ic_libro_de_hechizos_round);
            imageView25.setImageResource(R.drawable.ic_destello_hextech);
            imageView26.setImageResource(R.drawable.ic_mercado_del_futuro_round);
            imageView27.setImageResource(R.drawable.ic_perspicacia_cosmica_round);
            imageView28.setImageResource(R.drawable.ic_mejora_glacial);
            imageView29.setImageResource(R.drawable.ic_botas_gratis);
            imageView30.setImageResource(R.drawable.ic_desmaterializador);
            imageView31.setImageResource(R.drawable.ic_velocidad_de_acercamiento);
            imageView32.setImageResource(R.drawable.ic_cleptomania);
            imageView33.setImageResource(R.drawable.ic_cronometro_round);
            imageView34.setImageResource(R.drawable.ic_entrega_de_galletas);
            imageView35.setImageResource(R.drawable.ic_cuerpo_celeste);
            imageView36.setImageResource(R.drawable.ic_orbe_anulador);
            imageView37.setImageResource(R.drawable.ic_trascendencia_round);
            imageView38.setImageResource(R.drawable.ic_pirolaser);
            imageView39.setImageResource(R.drawable.ic_banda_de_mana);
            imageView40.setImageResource(R.drawable.ic_celeridad);
            imageView41.setImageResource(R.drawable.ic_caminar_sobre_agua);
            imageView42.setImageResource(R.drawable.ic_sombrero_definitivo_round);
            imageView43.setImageResource(R.drawable.ic_concentracion_absoluta);
            imageView44.setImageResource(R.drawable.ic_se_avecina_tormenta);

        }
        if (champId == 28) {
            this.setTitle(R.string.title_fiora);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);

            toolbar.setNavigationOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(getApplicationContext(), MainActivity.class));
                    BuildActivity.this.finish();
                }
            });

            imageView1.setImageResource(R.drawable.ic_fiora);
            textView1.setText("49,82 %");
            textView2.setText("Top");
            textView3.setText("2012");
            imageView2.setImageResource(R.drawable.ic_tabi_ninja);
            imageView3.setImageResource(R.drawable.ic_hidra_voraz);
            imageView4.setImageResource(R.drawable.ic_trinidad);
            imageView5.setImageResource(R.drawable.ic_angel_de_la_guarda);
            imageView6.setImageResource(R.drawable.ic_baile_de_la_muerte);
            imageView7.setImageResource(R.drawable.ic_rostro_espiritual);
            imageView8.setImageResource(R.drawable.ic_flash);
            imageView9.setImageResource(R.drawable.ic_teleport);
            imageView10.setPadding(0, 0, 0, 0);
            imageView11.setPadding(0, 0, 0, 0);
            imageView12.setImageResource(R.drawable.ic_espada_de_doran);
            imageView13.setImageResource(R.drawable.ic_pocion);
            imageView14.setImageResource(R.drawable.ic_fiora_lvl);
            imageView15.setImageResource(R.drawable.ic_precision);
            imageView16.setImageResource(R.drawable.ic_domination);
            imageView17.setImageResource(R.drawable.ic_brujeria);
            imageView18.setImageResource(R.drawable.ic_valor);
            imageView19.setImageResource(R.drawable.ic_inspiracion_round);
            imageView20.setImageResource(R.drawable.ic_precision);
            imageView21.setImageResource(R.drawable.ic_domination);
            imageView22.setImageResource(R.drawable.ic_brujeria_round);
            imageView23.setImageResource(R.drawable.ic_valor);
            imageView24.setImageResource(R.drawable.ic_libro_de_hechizos);
            imageView25.setImageResource(R.drawable.ic_destello_hextech);
            imageView26.setImageResource(R.drawable.ic_mercado_del_futuro);
            imageView27.setImageResource(R.drawable.ic_perspicacia_cosmica_round);
            imageView28.setImageResource(R.drawable.ic_mejora_glacial);
            imageView29.setImageResource(R.drawable.ic_botas_gratis);
            imageView30.setImageResource(R.drawable.ic_desmaterializador);
            imageView31.setImageResource(R.drawable.ic_velocidad_de_acercamiento);
            imageView32.setImageResource(R.drawable.ic_cleptomania_round);
            imageView33.setImageResource(R.drawable.ic_cronometro_round);
            imageView34.setImageResource(R.drawable.ic_entrega_de_galletas_round);
            imageView35.setImageResource(R.drawable.ic_cuerpo_celeste);
            imageView36.setImageResource(R.drawable.ic_orbe_anulador);
            imageView37.setImageResource(R.drawable.ic_trascendencia_round);
            imageView38.setImageResource(R.drawable.ic_pirolaser);
            imageView39.setImageResource(R.drawable.ic_banda_de_mana);
            imageView40.setImageResource(R.drawable.ic_celeridad);
            imageView41.setImageResource(R.drawable.ic_caminar_sobre_agua);
            imageView42.setImageResource(R.drawable.ic_sombrero_definitivo);
            imageView43.setImageResource(R.drawable.ic_concentracion_absoluta);
            imageView44.setImageResource(R.drawable.ic_se_avecina_tormenta_round);

        }
        if (champId == 29) {
            this.setTitle(R.string.title_fizz);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);

            toolbar.setNavigationOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(getApplicationContext(), MainActivity.class));
                    BuildActivity.this.finish();
                }
            });

            imageView1.setImageResource(R.drawable.ic_fizz);
            textView1.setText("52,36 %");
            textView2.setText("Mid");
            textView3.setText("2011");
            imageView2.setImageResource(R.drawable.ic_protocinturon);
            imageView3.setImageResource(R.drawable.ic_botas_hechizero);
            imageView4.setImageResource(R.drawable.ic_perdicion_del_liche);
            imageView5.setImageResource(R.drawable.ic_reloj_zhonya);
            imageView6.setImageResource(R.drawable.ic_baston_del_vacio);
            imageView7.setImageResource(R.drawable.ic_rabadon);
            imageView8.setImageResource(R.drawable.ic_flash);
            imageView9.setImageResource(R.drawable.ic_ignite);
            imageView10.setPadding(0, 0, 0, 0);
            imageView11.setImageResource(R.drawable.ic_anillo_de_doran);
            imageView12.setImageResource(R.drawable.ic_pocion);
            imageView13.setImageResource(R.drawable.ic_pocion);
            imageView14.setImageResource(R.drawable.ic_fizz_lvl);
            imageView15.setImageResource(R.drawable.ic_precision);
            imageView16.setImageResource(R.drawable.ic_domination_round);
            imageView17.setImageResource(R.drawable.ic_brujeria);
            imageView18.setImageResource(R.drawable.ic_valor);
            imageView19.setImageResource(R.drawable.ic_inspiracion);
            imageView20.setImageResource(R.drawable.ic_precision_round);
            imageView21.setImageResource(R.drawable.ic_brujeria);
            imageView22.setImageResource(R.drawable.ic_valor);
            imageView23.setImageResource(R.drawable.ic_inspiracion);
            imageView24.setImageResource(R.drawable.ic_electrocutar_round);
            imageView25.setImageResource(R.drawable.ic_golpe_bajo);
            imageView26.setImageResource(R.drawable.ic_guardian_zombi);
            imageView27.setImageResource(R.drawable.ic_cazador_voraz_round);
            imageView28.setImageResource(R.drawable.ic_depredador);
            imageView29.setImageResource(R.drawable.ic_sabor_a_sangre);
            imageView30.setImageResource(R.drawable.ic_poro_fantasmal);
            imageView31.setImageResource(R.drawable.ic_cazador_ingenioso);
            imageView32.setImageResource(R.drawable.ic_cosecha_oscura);
            imageView33.setImageResource(R.drawable.ic_impacto_repentino_round);
            imageView34.setImageResource(R.drawable.ic_coleccion_de_globos_oculares_round);
            imageView35.setImageResource(R.drawable.ic_cazador_incesante);
            imageView36.setImageResource(R.drawable.ic_super_curacion);
            imageView37.setImageResource(R.drawable.ic_leyenda_presteza);
            imageView38.setImageResource(R.drawable.ic_golpe_de_gracia_round);
            imageView39.setImageResource(R.drawable.ic_triumfo_round);
            imageView40.setImageResource(R.drawable.ic_leyenda_tenacidad);
            imageView41.setImageResource(R.drawable.ic_derribado);
            imageView42.setImageResource(R.drawable.ic_claridad_mental);
            imageView43.setImageResource(R.drawable.ic_leyenda_linaje);
            imageView44.setImageResource(R.drawable.ic_ultimo_esfuerzo);

        }
        if (champId == 30) {
            this.setTitle(R.string.title_galio);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);

            toolbar.setNavigationOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(getApplicationContext(), MainActivity.class));
                    BuildActivity.this.finish();
                }
            });

            imageView1.setImageResource(R.drawable.ic_galio);
            textView1.setText("47,89 %");
            textView2.setText("Top");
            textView3.setText("2010");
            imageView2.setImageResource(R.drawable.ic_vara_de_las_edades);
            imageView3.setImageResource(R.drawable.ic_botas_mercurio);
            imageView4.setImageResource(R.drawable.ic_tormento_de_liandry);
            imageView5.setImageResource(R.drawable.ic_reloj_zhonya);
            imageView6.setImageResource(R.drawable.ic_baston_del_vacio);
            imageView7.setImageResource(R.drawable.ic_rabadon);
            imageView8.setImageResource(R.drawable.ic_flash);
            imageView9.setImageResource(R.drawable.ic_teleport);
            imageView10.setPadding(0, 0, 0, 0);
            imageView11.setImageResource(R.drawable.ic_anillo_de_doran);
            imageView12.setImageResource(R.drawable.ic_pocion);
            imageView13.setImageResource(R.drawable.ic_pocion);
            imageView14.setImageResource(R.drawable.ic_galio_lvl);
            imageView15.setImageResource(R.drawable.ic_precision);
            imageView16.setImageResource(R.drawable.ic_domination);
            imageView17.setImageResource(R.drawable.ic_brujeria);
            imageView18.setImageResource(R.drawable.ic_valor);
            imageView19.setImageResource(R.drawable.ic_inspiracion_round);
            imageView20.setImageResource(R.drawable.ic_precision);
            imageView21.setImageResource(R.drawable.ic_domination);
            imageView22.setImageResource(R.drawable.ic_brujeria_round);
            imageView23.setImageResource(R.drawable.ic_valor);
            imageView24.setImageResource(R.drawable.ic_libro_de_hechizos_round);
            imageView25.setImageResource(R.drawable.ic_destello_hextech);
            imageView26.setImageResource(R.drawable.ic_mercado_del_futuro_round);
            imageView27.setImageResource(R.drawable.ic_perspicacia_cosmica_round);
            imageView28.setImageResource(R.drawable.ic_mejora_glacial);
            imageView29.setImageResource(R.drawable.ic_botas_gratis);
            imageView30.setImageResource(R.drawable.ic_desmaterializador);
            imageView31.setImageResource(R.drawable.ic_velocidad_de_acercamiento);
            imageView32.setImageResource(R.drawable.ic_cleptomania);
            imageView33.setImageResource(R.drawable.ic_cronometro_round);
            imageView34.setImageResource(R.drawable.ic_entrega_de_galletas);
            imageView35.setImageResource(R.drawable.ic_cuerpo_celeste);
            imageView36.setImageResource(R.drawable.ic_orbe_anulador);
            imageView37.setImageResource(R.drawable.ic_trascendencia_round);
            imageView38.setImageResource(R.drawable.ic_pirolaser);
            imageView39.setImageResource(R.drawable.ic_banda_de_mana_round);
            imageView40.setImageResource(R.drawable.ic_celeridad);
            imageView41.setImageResource(R.drawable.ic_caminar_sobre_agua);
            imageView42.setImageResource(R.drawable.ic_sombrero_definitivo);
            imageView43.setImageResource(R.drawable.ic_concentracion_absoluta);
            imageView44.setImageResource(R.drawable.ic_se_avecina_tormenta);

        }
        if (champId == 31) {
            this.setTitle(R.string.title_gangplank);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);

            toolbar.setNavigationOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(getApplicationContext(), MainActivity.class));
                    BuildActivity.this.finish();
                }
            });

            imageView1.setImageResource(R.drawable.ic_gangplank);
            textView1.setText("51,86 %");
            textView2.setText("Top");
            textView3.setText("2009");
            imageView2.setImageResource(R.drawable.ic_botas_rapidez);
            imageView3.setImageResource(R.drawable.ic_hextech_glp);
            imageView4.setImageResource(R.drawable.ic_rylai);
            imageView5.setImageResource(R.drawable.ic_tormento_de_liandry);
            imageView6.setImageResource(R.drawable.ic_reloj_zhonya);
            imageView7.setImageResource(R.drawable.ic_baston_del_vacio);
            imageView8.setImageResource(R.drawable.ic_flash);
            imageView9.setImageResource(R.drawable.ic_ignite);
            imageView10.setPadding(0, 0, 0, 0);
            imageView11.setPadding(0, 0, 0, 0);
            imageView12.setPadding(0, 0, 0, 0);
            imageView13.setImageResource(R.drawable.ic_pocion_corrupcion);
            imageView14.setImageResource(R.drawable.ic_gangplank_lvl);
            imageView15.setImageResource(R.drawable.ic_precision);
            imageView16.setImageResource(R.drawable.ic_domination);
            imageView17.setImageResource(R.drawable.ic_brujeria);
            imageView18.setImageResource(R.drawable.ic_valor);
            imageView19.setImageResource(R.drawable.ic_inspiracion_round);
            imageView20.setImageResource(R.drawable.ic_precision);
            imageView21.setImageResource(R.drawable.ic_domination);
            imageView22.setImageResource(R.drawable.ic_brujeria);
            imageView23.setImageResource(R.drawable.ic_valor_round);
            imageView24.setImageResource(R.drawable.ic_libro_de_hechizos);
            imageView25.setImageResource(R.drawable.ic_destello_hextech);
            imageView26.setImageResource(R.drawable.ic_mercado_del_futuro_round);
            imageView27.setImageResource(R.drawable.ic_perspicacia_cosmica_round);
            imageView28.setImageResource(R.drawable.ic_mejora_glacial);
            imageView29.setImageResource(R.drawable.ic_botas_gratis);
            imageView30.setImageResource(R.drawable.ic_desmaterializador);
            imageView31.setImageResource(R.drawable.ic_velocidad_de_acercamiento);
            imageView32.setImageResource(R.drawable.ic_cleptomania_round);
            imageView33.setImageResource(R.drawable.ic_cronometro_round);
            imageView34.setImageResource(R.drawable.ic_entrega_de_galletas);
            imageView35.setImageResource(R.drawable.ic_cuerpo_celeste);
            imageView36.setImageResource(R.drawable.ic_inquebrantable);
            imageView37.setImageResource(R.drawable.ic_piel_de_hierro_round);
            imageView38.setImageResource(R.drawable.ic_sobrecrecimiento);
            imageView39.setImageResource(R.drawable.ic_demoler);
            imageView40.setImageResource(R.drawable.ic_concha_espejo);
            imageView41.setImageResource(R.drawable.ic_revitalizar);
            imageView42.setImageResource(R.drawable.ic_fuente_de_vida);
            imageView43.setImageResource(R.drawable.ic_condicionamiento);
            imageView44.setImageResource(R.drawable.ic_fuentes_renovadas_round);

        }
        if (champId == 32) {
            this.setTitle(R.string.title_garen);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);

            toolbar.setNavigationOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(getApplicationContext(), MainActivity.class));
                    BuildActivity.this.finish();
                }
            });

            imageView1.setImageResource(R.drawable.ic_garen);
            textView1.setText("50,81 %");
            textView2.setText("Top");
            textView3.setText("2010");
            imageView2.setImageResource(R.drawable.ic_cuchilla_negra);
            imageView3.setImageResource(R.drawable.ic_botas_mercurio);
            imageView4.setImageResource(R.drawable.ic_coraza_del_hombre_muerto);
            imageView5.setImageResource(R.drawable.ic_rostro_espiritual);
            imageView6.setImageResource(R.drawable.ic_malla_de_espinas);
            imageView7.setImageResource(R.drawable.ic_gargola);
            imageView8.setImageResource(R.drawable.ic_flash);
            imageView9.setImageResource(R.drawable.ic_teleport);
            imageView10.setPadding(0, 0, 0, 0);
            imageView11.setPadding(0, 0, 0, 0);
            imageView12.setImageResource(R.drawable.ic_escudo_de_doran);
            imageView13.setImageResource(R.drawable.ic_pocion);
            imageView14.setImageResource(R.drawable.ic_garen_lvl);
            imageView15.setImageResource(R.drawable.ic_precision);
            imageView16.setImageResource(R.drawable.ic_domination);
            imageView17.setImageResource(R.drawable.ic_brujeria);
            imageView18.setImageResource(R.drawable.ic_valor_round);
            imageView19.setImageResource(R.drawable.ic_inspiracion);
            imageView20.setImageResource(R.drawable.ic_precision);
            imageView21.setImageResource(R.drawable.ic_domination);
            imageView22.setImageResource(R.drawable.ic_brujeria_round);
            imageView23.setImageResource(R.drawable.ic_inspiracion);
            imageView24.setImageResource(R.drawable.ic_garras_del_inmortal_round);
            imageView25.setImageResource(R.drawable.ic_inquebrantable_round);
            imageView26.setImageResource(R.drawable.ic_piel_de_hierro_round);
            imageView27.setImageResource(R.drawable.ic_sobrecrecimiento_round);
            imageView28.setImageResource(R.drawable.ic_reverberacion);
            imageView29.setImageResource(R.drawable.ic_demoler);
            imageView30.setImageResource(R.drawable.ic_concha_espejo);
            imageView31.setImageResource(R.drawable.ic_revitalizar);
            imageView32.setImageResource(R.drawable.ic_protector);
            imageView33.setImageResource(R.drawable.ic_fuente_de_vida);
            imageView34.setImageResource(R.drawable.ic_condicionamiento);
            imageView35.setImageResource(R.drawable.ic_fuentes_renovadas);
            imageView36.setImageResource(R.drawable.ic_orbe_anulador);
            imageView37.setImageResource(R.drawable.ic_trascendencia_round);
            imageView38.setImageResource(R.drawable.ic_pirolaser);
            imageView39.setImageResource(R.drawable.ic_banda_de_mana_round);
            imageView40.setImageResource(R.drawable.ic_celeridad);
            imageView41.setImageResource(R.drawable.ic_caminar_sobre_agua);
            imageView42.setImageResource(R.drawable.ic_sombrero_definitivo);
            imageView43.setImageResource(R.drawable.ic_concentracion_absoluta);
            imageView44.setImageResource(R.drawable.ic_se_avecina_tormenta);

        }
        if (champId == 33) {
            this.setTitle(R.string.title_gnar);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);

            toolbar.setNavigationOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(getApplicationContext(), MainActivity.class));
                    BuildActivity.this.finish();
                }
            });

            imageView1.setImageResource(R.drawable.ic_gnar);
            textView1.setText("48,11 %");
            textView2.setText("Top");
            textView3.setText("2014");
            imageView2.setImageResource(R.drawable.ic_cuchilla_negra);
            imageView3.setImageResource(R.drawable.ic_tabi_ninja);
            imageView4.setImageResource(R.drawable.ic_mazo_helado);
            imageView5.setImageResource(R.drawable.ic_randuin);
            imageView6.setImageResource(R.drawable.ic_malla_de_espinas);
            imageView7.setImageResource(R.drawable.ic_gargola);
            imageView8.setImageResource(R.drawable.ic_flash);
            imageView9.setImageResource(R.drawable.ic_teleport);
            imageView10.setPadding(0, 0, 0, 0);
            imageView11.setPadding(0, 0, 0, 0);
            imageView12.setImageResource(R.drawable.ic_espada_de_doran);
            imageView13.setImageResource(R.drawable.ic_pocion);
            imageView14.setImageResource(R.drawable.ic_gnar_lvl);
            imageView15.setImageResource(R.drawable.ic_precision);
            imageView16.setImageResource(R.drawable.ic_domination);
            imageView17.setImageResource(R.drawable.ic_brujeria_round);
            imageView18.setImageResource(R.drawable.ic_valor);
            imageView19.setImageResource(R.drawable.ic_inspiracion);
            imageView20.setImageResource(R.drawable.ic_precision);
            imageView21.setImageResource(R.drawable.ic_domination);
            imageView22.setImageResource(R.drawable.ic_valor_round);
            imageView23.setImageResource(R.drawable.ic_inspiracion);
            imageView24.setImageResource(R.drawable.ic_aery_round);
            imageView25.setImageResource(R.drawable.ic_orbe_anulador_round);
            imageView26.setImageResource(R.drawable.ic_trascendencia);
            imageView27.setImageResource(R.drawable.ic_pirolaser_round);
            imageView28.setImageResource(R.drawable.ic_cometa_arcano);
            imageView29.setImageResource(R.drawable.ic_banda_de_mana);
            imageView30.setImageResource(R.drawable.ic_celeridad_round);
            imageView31.setImageResource(R.drawable.ic_caminar_sobre_agua);
            imageView32.setImageResource(R.drawable.ic_irrupcion_de_fase);
            imageView33.setImageResource(R.drawable.ic_sombrero_definitivo);
            imageView34.setImageResource(R.drawable.ic_concentracion_absoluta);
            imageView35.setImageResource(R.drawable.ic_se_avecina_tormenta);
            imageView36.setImageResource(R.drawable.ic_inquebrantable);
            imageView37.setImageResource(R.drawable.ic_piel_de_hierro_round);
            imageView38.setImageResource(R.drawable.ic_sobrecrecimiento);
            imageView39.setImageResource(R.drawable.ic_demoler);
            imageView40.setImageResource(R.drawable.ic_concha_espejo);
            imageView41.setImageResource(R.drawable.ic_revitalizar);
            imageView42.setImageResource(R.drawable.ic_fuente_de_vida);
            imageView43.setImageResource(R.drawable.ic_condicionamiento);
            imageView44.setImageResource(R.drawable.ic_fuentes_renovadas_round);

        }
        if (champId == 34) {
            this.setTitle(R.string.title_gragas);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);

            toolbar.setNavigationOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(getApplicationContext(), MainActivity.class));
                    BuildActivity.this.finish();
                }
            });

            imageView1.setImageResource(R.drawable.ic_gragas);
            textView1.setText("47,52 %");
            textView2.setText("Jungla");
            textView3.setText("2010");
            imageView2.setImageResource(R.drawable.ic_azul_ecos_runicos);
            imageView3.setImageResource(R.drawable.botas_jonias);
            imageView4.setImageResource(R.drawable.ic_guantelete_de_hielo);
            imageView5.setImageResource(R.drawable.ic_rostro_espiritual);
            imageView6.setImageResource(R.drawable.ic_coraza_del_hombre_muerto);
            imageView7.setImageResource(R.drawable.ic_gloria_justiciera);
            imageView8.setImageResource(R.drawable.ic_flash);
            imageView9.setImageResource(R.drawable.ic_smite);
            imageView10.setPadding(0, 0, 0, 0);
            imageView11.setPadding(0, 0, 0, 0);
            imageView12.setImageResource(R.drawable.ic_talisman_del_cazador);
            imageView13.setImageResource(R.drawable.ic_pocion_reutilizable);
            imageView14.setImageResource(R.drawable.ic_gragas_lvl);
            imageView15.setImageResource(R.drawable.ic_precision);
            imageView16.setImageResource(R.drawable.ic_domination);
            imageView17.setImageResource(R.drawable.ic_brujeria);
            imageView18.setImageResource(R.drawable.ic_valor_round);
            imageView19.setImageResource(R.drawable.ic_inspiracion);
            imageView20.setImageResource(R.drawable.ic_precision);
            imageView21.setImageResource(R.drawable.ic_domination_round);
            imageView22.setImageResource(R.drawable.ic_brujeria);
            imageView23.setImageResource(R.drawable.ic_inspiracion);
            imageView24.setImageResource(R.drawable.ic_garras_del_inmortal);
            imageView25.setImageResource(R.drawable.ic_inquebrantable);
            imageView26.setImageResource(R.drawable.ic_piel_de_hierro);
            imageView27.setImageResource(R.drawable.ic_sobrecrecimiento);
            imageView28.setImageResource(R.drawable.ic_reverberacion_round);
            imageView29.setImageResource(R.drawable.ic_demoler);
            imageView30.setImageResource(R.drawable.ic_concha_espejo);
            imageView31.setImageResource(R.drawable.ic_revitalizar);
            imageView32.setImageResource(R.drawable.ic_protector);
            imageView33.setImageResource(R.drawable.ic_fuente_de_vida_round);
            imageView34.setImageResource(R.drawable.ic_condicionamiento_round);
            imageView35.setImageResource(R.drawable.ic_fuentes_renovadas_round);
            imageView36.setImageResource(R.drawable.ic_golpe_bajo_round);
            imageView37.setImageResource(R.drawable.ic_guardian_zombi);
            imageView38.setImageResource(R.drawable.ic_cazador_voraz_round);
            imageView39.setImageResource(R.drawable.ic_sabor_a_sangre);
            imageView40.setImageResource(R.drawable.ic_poro_fantasmal);
            imageView41.setImageResource(R.drawable.ic_cazador_ingenioso);
            imageView42.setImageResource(R.drawable.ic_impacto_repentino);
            imageView43.setImageResource(R.drawable.ic_coleccion_de_globos_oculares);
            imageView44.setImageResource(R.drawable.ic_cazador_incesante);

        }
        if (champId == 35) {
            this.setTitle(R.string.title_graves);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);

            toolbar.setNavigationOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(getApplicationContext(), MainActivity.class));
                    BuildActivity.this.finish();
                }
            });

            imageView1.setImageResource(R.drawable.ic_graves);
            textView1.setText("48,41 %");
            textView2.setText("Jung");
            textView3.setText("2011");
            imageView2.setImageResource(R.drawable.ic_rojo_guerrero);
            imageView3.setImageResource(R.drawable.ic_grebas_berserker);
            imageView4.setImageResource(R.drawable.ic_draktharr);
            imageView5.setImageResource(R.drawable.ic_filo_fantasmal_youmuu);
            imageView6.setImageResource(R.drawable.ic_angel_de_la_guarda);
            imageView7.setImageResource(R.drawable.ic_malmortius);
            imageView8.setImageResource(R.drawable.ic_flash);
            imageView9.setImageResource(R.drawable.ic_smite);
            imageView10.setPadding(0, 0, 0, 0);
            imageView11.setPadding(0, 0, 0, 0);
            imageView12.setImageResource(R.drawable.ic_machete_del_cazador);
            imageView13.setImageResource(R.drawable.ic_pocion_reutilizable);
            imageView14.setImageResource(R.drawable.ic_graves_lvl);
            imageView15.setImageResource(R.drawable.ic_precision);
            imageView16.setImageResource(R.drawable.ic_domination_round);
            imageView17.setImageResource(R.drawable.ic_brujeria);
            imageView18.setImageResource(R.drawable.ic_valor);
            imageView19.setImageResource(R.drawable.ic_inspiracion);
            imageView20.setImageResource(R.drawable.ic_precision_round);
            imageView21.setImageResource(R.drawable.ic_brujeria);
            imageView22.setImageResource(R.drawable.ic_valor);
            imageView23.setImageResource(R.drawable.ic_inspiracion);
            imageView24.setImageResource(R.drawable.ic_electrocutar_round);
            imageView25.setImageResource(R.drawable.ic_golpe_bajo);
            imageView26.setImageResource(R.drawable.ic_guardian_zombi);
            imageView27.setImageResource(R.drawable.ic_cazador_voraz);
            imageView28.setImageResource(R.drawable.ic_depredador);
            imageView29.setImageResource(R.drawable.ic_sabor_a_sangre);
            imageView30.setImageResource(R.drawable.ic_poro_fantasmal);
            imageView31.setImageResource(R.drawable.ic_cazador_ingenioso);
            imageView32.setImageResource(R.drawable.ic_cosecha_oscura);
            imageView33.setImageResource(R.drawable.ic_impacto_repentino_round);
            imageView34.setImageResource(R.drawable.ic_coleccion_de_globos_oculares_round);
            imageView35.setImageResource(R.drawable.ic_cazador_incesante_round);
            imageView36.setImageResource(R.drawable.ic_super_curacion);
            imageView37.setImageResource(R.drawable.ic_leyenda_presteza);
            imageView38.setImageResource(R.drawable.ic_golpe_de_gracia_round);
            imageView39.setImageResource(R.drawable.ic_triumfo_round);
            imageView40.setImageResource(R.drawable.ic_leyenda_tenacidad);
            imageView41.setImageResource(R.drawable.ic_derribado);
            imageView42.setImageResource(R.drawable.ic_claridad_mental);
            imageView43.setImageResource(R.drawable.ic_leyenda_linaje);
            imageView44.setImageResource(R.drawable.ic_ultimo_esfuerzo);

        }
        if (champId == 36) {
            this.setTitle(R.string.title_hecarim);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);

            toolbar.setNavigationOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(getApplicationContext(), MainActivity.class));
                    BuildActivity.this.finish();
                }
            });

            imageView1.setImageResource(R.drawable.ic_hecarim);
            textView1.setText("2012 %");
            textView2.setText("Jungla");
            textView3.setText("2012");
            imageView2.setImageResource(R.drawable.ic_azul_mole_de_ceniza);
            imageView3.setImageResource(R.drawable.ic_tabi_ninja);
            imageView4.setImageResource(R.drawable.ic_trinidad);
            imageView5.setImageResource(R.drawable.ic_coraza_del_hombre_muerto);
            imageView6.setImageResource(R.drawable.ic_rostro_espiritual);
            imageView7.setImageResource(R.drawable.ic_malla_de_espinas);
            imageView8.setImageResource(R.drawable.ic_fantasmal);
            imageView9.setImageResource(R.drawable.ic_smite);
            imageView10.setPadding(0, 0, 0, 0);
            imageView11.setPadding(0, 0, 0, 0);
            imageView12.setImageResource(R.drawable.ic_talisman_del_cazador);
            imageView13.setImageResource(R.drawable.ic_pocion_reutilizable);
            imageView14.setImageResource(R.drawable.ic_hecarim_lvl);
            imageView15.setImageResource(R.drawable.ic_precision);
            imageView16.setImageResource(R.drawable.ic_domination_round);
            imageView17.setImageResource(R.drawable.ic_brujeria);
            imageView18.setImageResource(R.drawable.ic_valor);
            imageView19.setImageResource(R.drawable.ic_inspiracion);
            imageView20.setImageResource(R.drawable.ic_precision);
            imageView21.setImageResource(R.drawable.ic_brujeria_round);
            imageView22.setImageResource(R.drawable.ic_valor);
            imageView23.setImageResource(R.drawable.ic_inspiracion);
            imageView24.setImageResource(R.drawable.ic_electrocutar);
            imageView25.setImageResource(R.drawable.ic_golpe_bajo);
            imageView26.setImageResource(R.drawable.ic_guardian_zombi);
            imageView27.setImageResource(R.drawable.ic_cazador_voraz);
            imageView28.setImageResource(R.drawable.ic_depredador_round);
            imageView29.setImageResource(R.drawable.ic_sabor_a_sangre);
            imageView30.setImageResource(R.drawable.ic_poro_fantasmal);
            imageView31.setImageResource(R.drawable.ic_cazador_ingenioso);
            imageView32.setImageResource(R.drawable.ic_cosecha_oscura);
            imageView33.setImageResource(R.drawable.ic_impacto_repentino_round);
            imageView34.setImageResource(R.drawable.ic_coleccion_de_globos_oculares_round);
            imageView35.setImageResource(R.drawable.ic_cazador_incesante_round);
            imageView36.setImageResource(R.drawable.ic_orbe_anulador);
            imageView37.setImageResource(R.drawable.ic_trascendencia);
            imageView38.setImageResource(R.drawable.ic_pirolaser);
            imageView39.setImageResource(R.drawable.ic_banda_de_mana_round);
            imageView40.setImageResource(R.drawable.ic_celeridad_round);
            imageView41.setImageResource(R.drawable.ic_caminar_sobre_agua);
            imageView42.setImageResource(R.drawable.ic_sombrero_definitivo);
            imageView43.setImageResource(R.drawable.ic_concentracion_absoluta);
            imageView44.setImageResource(R.drawable.ic_se_avecina_tormenta);

        }
        if (champId == 37) {
            this.setTitle(R.string.title_heimerdinger);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);

            toolbar.setNavigationOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(getApplicationContext(), MainActivity.class));
                    BuildActivity.this.finish();
                }
            });

            imageView1.setImageResource(R.drawable.ic_heimerdinger);
            textView1.setText("52,18 %");
            textView2.setText("Mid");
            textView3.setText("2009");
            imageView2.setImageResource(R.drawable.ic_morellonomicon);
            imageView3.setImageResource(R.drawable.ic_botas_hechizero);
            imageView4.setImageResource(R.drawable.ic_reloj_zhonya);
            imageView5.setImageResource(R.drawable.ic_tormento_de_liandry);
            imageView6.setImageResource(R.drawable.ic_baston_del_vacio);
            imageView7.setImageResource(R.drawable.ic_rabadon);
            imageView8.setImageResource(R.drawable.ic_flash);
            imageView9.setImageResource(R.drawable.ic_teleport);
            imageView10.setPadding(0, 0, 0, 0);
            imageView11.setImageResource(R.drawable.ic_anillo_de_doran);
            imageView12.setImageResource(R.drawable.ic_pocion);
            imageView13.setImageResource(R.drawable.ic_pocion);
            imageView14.setImageResource(R.drawable.ic_heimerdinger_lvl);
            imageView15.setImageResource(R.drawable.ic_precision);
            imageView16.setImageResource(R.drawable.ic_domination);
            imageView17.setImageResource(R.drawable.ic_brujeria_round);
            imageView18.setImageResource(R.drawable.ic_valor);
            imageView19.setImageResource(R.drawable.ic_inspiracion);
            imageView20.setImageResource(R.drawable.ic_precision_round);
            imageView21.setImageResource(R.drawable.ic_domination);
            imageView22.setImageResource(R.drawable.ic_valor);
            imageView23.setImageResource(R.drawable.ic_inspiracion_round);
            imageView24.setImageResource(R.drawable.ic_aery);
            imageView25.setImageResource(R.drawable.ic_orbe_anulador);
            imageView26.setImageResource(R.drawable.ic_trascendencia_round);
            imageView27.setImageResource(R.drawable.ic_pirolaser_round);
            imageView28.setImageResource(R.drawable.ic_cometa_arcano_round);
            imageView29.setImageResource(R.drawable.ic_banda_de_mana);
            imageView30.setImageResource(R.drawable.ic_celeridad);
            imageView31.setImageResource(R.drawable.ic_caminar_sobre_agua);
            imageView32.setImageResource(R.drawable.ic_irrupcion_de_fase);
            imageView33.setImageResource(R.drawable.ic_sombrero_definitivo_round);
            imageView34.setImageResource(R.drawable.ic_concentracion_absoluta);
            imageView35.setImageResource(R.drawable.ic_se_avecina_tormenta);
            imageView36.setImageResource(R.drawable.ic_destello_hextech);
            imageView37.setImageResource(R.drawable.ic_mercado_del_futuro);
            imageView38.setImageResource(R.drawable.ic_perspicacia_cosmica_round);
            imageView39.setImageResource(R.drawable.ic_botas_gratis);
            imageView40.setImageResource(R.drawable.ic_desmaterializador);
            imageView41.setImageResource(R.drawable.ic_velocidad_de_acercamiento);
            imageView42.setImageResource(R.drawable.ic_cronometro_round);
            imageView43.setImageResource(R.drawable.ic_entrega_de_galletas);
            imageView44.setImageResource(R.drawable.ic_cuerpo_celeste);

        }
        if (champId == 38) {
            this.setTitle(R.string.title_illaoi);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);

            toolbar.setNavigationOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(getApplicationContext(), MainActivity.class));
                    BuildActivity.this.finish();
                }
            });

            imageView1.setImageResource(R.drawable.ic_illaoi);
            textView1.setText("51,84 %");
            textView2.setText("Top");
            textView3.setText("2015");
            imageView2.setImageResource(R.drawable.ic_cuchilla_negra);
            imageView3.setImageResource(R.drawable.ic_tabi_ninja);
            imageView4.setImageResource(R.drawable.ic_sterak);
            imageView5.setImageResource(R.drawable.ic_baile_de_la_muerte);
            imageView6.setImageResource(R.drawable.ic_rostro_espiritual);
            imageView7.setImageResource(R.drawable.ic_angel_de_la_guarda);
            imageView8.setImageResource(R.drawable.ic_flash);
            imageView9.setImageResource(R.drawable.ic_teleport);
            imageView10.setPadding(0, 0, 0, 0);
            imageView11.setPadding(0, 0, 0, 0);
            imageView12.setPadding(0, 0, 0, 0);
            imageView13.setImageResource(R.drawable.ic_pocion_corrupcion);
            imageView14.setImageResource(R.drawable.ic_illaoi_lvl);
            imageView15.setImageResource(R.drawable.ic_precision);
            imageView16.setImageResource(R.drawable.ic_domination);
            imageView17.setImageResource(R.drawable.ic_brujeria);
            imageView18.setImageResource(R.drawable.ic_valor);
            imageView19.setImageResource(R.drawable.ic_inspiracion_round);
            imageView20.setImageResource(R.drawable.ic_precision);
            imageView21.setImageResource(R.drawable.ic_domination_round);
            imageView22.setImageResource(R.drawable.ic_valor);
            imageView23.setImageResource(R.drawable.ic_inspiracion);
            imageView24.setImageResource(R.drawable.ic_libro_de_hechizos);
            imageView25.setImageResource(R.drawable.ic_destello_hextech);
            imageView26.setImageResource(R.drawable.ic_mercado_del_futuro);
            imageView27.setImageResource(R.drawable.ic_perspicacia_cosmica_round);
            imageView28.setImageResource(R.drawable.ic_mejora_glacial);
            imageView29.setImageResource(R.drawable.ic_botas_gratis);
            imageView30.setImageResource(R.drawable.ic_desmaterializador);
            imageView31.setImageResource(R.drawable.ic_velocidad_de_acercamiento);
            imageView32.setImageResource(R.drawable.ic_cleptomania_round);
            imageView33.setImageResource(R.drawable.ic_cronometro_round);
            imageView34.setImageResource(R.drawable.ic_entrega_de_galletas_round);
            imageView35.setImageResource(R.drawable.ic_cuerpo_celeste);
            imageView36.setImageResource(R.drawable.ic_golpe_bajo);
            imageView37.setImageResource(R.drawable.ic_guardian_zombi);
            imageView38.setImageResource(R.drawable.ic_cazador_voraz_round);
            imageView39.setImageResource(R.drawable.ic_sabor_a_sangre);
            imageView40.setImageResource(R.drawable.ic_poro_fantasmal);
            imageView41.setImageResource(R.drawable.ic_cazador_ingenioso);
            imageView42.setImageResource(R.drawable.ic_impacto_repentino_round);
            imageView43.setImageResource(R.drawable.ic_coleccion_de_globos_oculares);
            imageView44.setImageResource(R.drawable.ic_cazador_incesante);

        }
        if (champId == 39) {
            this.setTitle(R.string.title_irelia);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);

            toolbar.setNavigationOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(getApplicationContext(), MainActivity.class));
                    BuildActivity.this.finish();
                }
            });

            imageView1.setImageResource(R.drawable.ic_irelia);
            textView1.setText("50,25 %");
            textView2.setText("Top");
            textView3.setText("2010");
            imageView2.setImageResource(R.drawable.ic_trinidad);
            imageView3.setImageResource(R.drawable.ic_tabi_ninja);
            imageView4.setImageResource(R.drawable.ic_hidra_titanica);
            imageView5.setImageResource(R.drawable.ic_sterak);
            imageView6.setImageResource(R.drawable.ic_angel_de_la_guarda);
            imageView7.setImageResource(R.drawable.ic_rostro_espiritual);
            imageView8.setImageResource(R.drawable.ic_flash);
            imageView9.setImageResource(R.drawable.ic_teleport);
            imageView10.setPadding(0, 0, 0, 0);
            imageView11.setPadding(0, 0, 0, 0);
            imageView12.setPadding(0, 0, 0, 0);
            imageView13.setImageResource(R.drawable.ic_pocion_corrupcion);
            imageView14.setImageResource(R.drawable.ic_irelia_lvl);
            imageView15.setImageResource(R.drawable.ic_precision_round);
            imageView16.setImageResource(R.drawable.ic_domination);
            imageView17.setImageResource(R.drawable.ic_brujeria);
            imageView18.setImageResource(R.drawable.ic_valor);
            imageView19.setImageResource(R.drawable.ic_inspiracion);
            imageView20.setImageResource(R.drawable.ic_domination);
            imageView21.setImageResource(R.drawable.ic_brujeria);
            imageView22.setImageResource(R.drawable.ic_valor_round);
            imageView23.setImageResource(R.drawable.ic_inspiracion);
            imageView24.setImageResource(R.drawable.ic_ataque_intesificado_round);
            imageView25.setImageResource(R.drawable.ic_super_curacion);
            imageView26.setImageResource(R.drawable.ic_leyenda_presteza_round);
            imageView27.setImageResource(R.drawable.ic_golpe_de_gracia_round);
            imageView28.setImageResource(R.drawable.ic_compas_letal);
            imageView29.setImageResource(R.drawable.ic_triumfo_round);
            imageView30.setImageResource(R.drawable.ic_leyenda_tenacidad);
            imageView31.setImageResource(R.drawable.ic_derribado);
            imageView32.setImageResource(R.drawable.ic_pies_ligeros);
            imageView33.setImageResource(R.drawable.ic_claridad_mental);
            imageView34.setImageResource(R.drawable.ic_leyenda_linaje);
            imageView35.setImageResource(R.drawable.ic_ultimo_esfuerzo);
            imageView36.setImageResource(R.drawable.ic_inquebrantable);
            imageView37.setImageResource(R.drawable.ic_piel_de_hierro_round);
            imageView38.setImageResource(R.drawable.ic_sobrecrecimiento);
            imageView39.setImageResource(R.drawable.ic_demoler);
            imageView40.setImageResource(R.drawable.ic_concha_espejo);
            imageView41.setImageResource(R.drawable.ic_revitalizar);
            imageView42.setImageResource(R.drawable.ic_fuente_de_vida);
            imageView43.setImageResource(R.drawable.ic_condicionamiento);
            imageView44.setImageResource(R.drawable.ic_fuentes_renovadas_round);

        }
    }

    public void onBackPressed() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        BuildActivity.this.finish();
    }

}
