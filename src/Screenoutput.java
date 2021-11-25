public class Screenoutput implements ITuWas, ITastatur
{
    private Playerinfo playerinfo;

    int[] level;
    int[] names;
    int[] [] a; //1.Truppe
    int[] [] b; //2.Truppe
    int[] [] c; //3.Truppe
    int[] [] d; //4.Truppe
    int[] [] e; //5.Truppe
    int[] [] f; //6.Truppe
    int[] [] g; //7.Truppe
    int[] [] h; //8.Truppe
    int[] castles;
    MausBehaelter[] [] tileselect;

    private Audio greetings;
    private Audio let_the_war_begin;
    public Audio exit;
    //public MusicQB music;

    private Mapdata mapdata;

    private boolean dropdown_qbg;
    private boolean dropdown_game;
    private boolean dropdown_order;
    private boolean dropdown_report;
    private boolean dropdown_hero;
    private boolean dropdown_view;
    private boolean dropdown_history;
    private boolean dropdown_turn;
    private boolean cooldown = false;

    private Taktgeber updtrp;

    private Bild map;
    private Castles castles_pic;
    private Bild intro;
    private Bild border;
    private Bild begin;
    private Bild bar;
    private Bild playeroptions;
    private Bild player1off;
    private Bild player2off;
    private Bild player3off;
    private Bild player4off;
    private Bild player5off;
    private Bild player6off;
    private Bild player7off;
    private Bild player8off;
    private Bild PC1_cracked;
    private Bild PC2_cracked;
    private Bild PC3_cracked;
    private Bild PC4_cracked;
    private Bild PC5_cracked;
    private Bild PC6_cracked;
    private Bild PC7_cracked;
    private Bild PC8_cracked;
    private Bild Beginner;
    private Bild Intermediate;
    private Bild Advanced;
    private Bild Options;
    private Bild TheGreatest;
    private Bild Start;
    private Bild MainMenu;
    public Bild adviser_open_eyes;
    private Bild name2_weiss;
    private Bild name2_gelb;
    private Bild name2_orange;
    private Bild name2_rot;
    private Bild name2_gruen;
    private Bild name2_blau;
    private Bild name2_hellblau;
    private Bild name2_schwarz;
    private Bild name3_schwarz;
    public Bild Bar_QBG;
    public Bild Bar_Game;
    public Bild Bar_Order;
    public Bild Bar_Report;
    public Bild Bar_Hero;
    public Bild Bar_View;
    public Bild Bar_History;
    public Bild Bar_Turn;
    public Bild Turn_Player;
    public Ausgabe Display_Turn;
    private Bild marker;
    private Bild mapcursor;
    private Troops troops;
    private Bild activetroop;

    private MausBehaelter maus_begin;
    private MausBehaelter player1;
    private MausBehaelter player2;
    private MausBehaelter player3;
    private MausBehaelter player4;
    private MausBehaelter player5;
    private MausBehaelter player6;
    private MausBehaelter player7;
    private MausBehaelter player8;
    private MausBehaelter Beginner_button;
    private MausBehaelter Intermediate_button;
    private MausBehaelter Advanced_button;
    private MausBehaelter Options_button;
    private MausBehaelter TheGreatest_button;
    private MausBehaelter Start_button;
    private MausBehaelter MainMenu_button;
    private MausBehaelter name1;
    private MausBehaelter name2;
    private MausBehaelter name3;
    private MausBehaelter name4;
    private MausBehaelter name5;
    private MausBehaelter name6;
    private MausBehaelter name7;
    private MausBehaelter name8;
    private MausBehaelter reset;
    private MausBehaelter QBG;
    private MausBehaelter Game;
    private MausBehaelter Order;
    private MausBehaelter Report;
    private MausBehaelter Hero;
    private MausBehaelter View;
    private MausBehaelter History;
    private MausBehaelter Turn;
    private int hen,xField,yField,round,activePlayer,activeX,activeY,zuege;
    private Taste qbg_about;
    private Taste game_settings;
    private Taste game_shortcuts;
    private Taste game_new_game;
    private Taste game_save_game;
    private Taste game_load_game;
    private Taste game_save_map;
    private Taste game_load_map;
    private Taste game_quit;
    private Taste order_fight_order;
    private Taste order_move_all;
    private Taste order_disbund;
    private Taste order_signpost;
    private Taste order_resign;
    private Taste report_army;
    private Taste report_city;
    private Taste report_gold;
    private Taste report_production;
    private Taste report_winning;
    private Taste report_diplomacy;
    private Taste report_quest;
    private Taste hero_inspect;
    private Taste hero_plant_flag;
    private Taste hero_levels;
    private Taste hero_search;
    private Taste view_army_bonus;
    private Taste view_items;
    private Taste view_build;
    private Taste view_cities;
    private Taste view_production;
    private Taste view_vectoring;
    private Taste view_ruins;
    private Taste view_stack;
    private Taste history_city;
    private Taste history_events;
    private Taste history_gold;
    private Taste history_winners;
    private Taste history_triumphs;
    private Taste turn_end_turn;

    private Tastatur tastatur;

    public Screenoutput()
    {
        StaticTools.setzeFarbe("hellbraun",166,85,0);
        StaticTools.setzeFarbe("braun",117,52,0);
        StaticTools.setzeFarbe("grau",113,113,113);
        StaticTools.setzeFarbe("hellgrau",146,146,146);
        StaticTools.setzeFarbe("dunkelgrau",81,81,81);
        StaticTools.setzeFarbe("orange",255,162,0);
        StaticTools.setzeFarbe("gelb",255,239,32);
        StaticTools.setzeFarbe("gruen",0,142,0);
        StaticTools.setzeFarbe("hellgruen",81,174,28);
        StaticTools.setzeFarbe("dunkelgruen",0,89,0);
        StaticTools.setzeFarbe("weiss",255,255,255);
        StaticTools.setzeFarbe("schwarz",0,0,0);
        StaticTools.setzeFarbe("hellblau",44,186,255);
        StaticTools.setzeFarbe("dunkelblau",0,93,211);

        map = new Bild(32,60,8960,12480,"graphics/Overlays/Map_x2.png");
        map.unsichtbarMachen();
        castles_pic = new Castles();
        castles_pic.unsichtbarMachen();
        playerinfo = new Playerinfo();

        mapdata = new Mapdata();
        mapdata.map1();

        level = new int[3];
        level[0] = 1;
        names = new int[8];
        hen = 0;
        xField = 0;
        yField = 0;
        round = 0;
        activePlayer = 8;
        a = new int[112] [157];
        b = new int[112] [157];
        c = new int[112] [157];
        d = new int[112] [157];
        e = new int[112] [157];
        f = new int[112] [157];
        g = new int[112] [157];
        h = new int[112] [157];
        castles = new int[80];

        dropdown_qbg = false;
        dropdown_game = false;
        dropdown_order = false;
        dropdown_report = false;
        dropdown_hero = false;
        dropdown_view = false;
        dropdown_history = false;
        dropdown_turn = false;

        Zeichnung.setzeFenstergroesse(1299,1002);
        Zeichnung.setzeScrollbar(false);
        intro = new Bild(1280,960,"graphics/Overlays/Intro_x2.png");
        begin = new Bild(73,754,480,91,"graphics/Buttons/Begin.png");
        bar = new Bild(1280,34,"graphics/Dropdown/Bar.png");
        maus_begin = new MausBehaelter(73,754,480,91);
        maus_begin.setzeLink(this,1);
        maus_begin.setzeMausClick();

        Bar_QBG = new Bild(1280,960,"graphics/Dropdown/Bar_QBG.png");
        Bar_QBG.unsichtbarMachen();
        Bar_Game = new Bild(1280,960,"graphics/Dropdown/Bar_Game.png");
        Bar_Game.unsichtbarMachen();
        Bar_Order = new Bild(1280,960,"graphics/Dropdown/Bar_Order.png");
        Bar_Order.unsichtbarMachen();
        Bar_Report = new Bild(1280,960,"graphics/Dropdown/Bar_Report.png");
        Bar_Report.unsichtbarMachen();
        Bar_Hero = new Bild(1280,960,"graphics/Dropdown/Bar_Hero.png");
        Bar_Hero.unsichtbarMachen();
        Bar_View = new Bild(1280,960,"graphics/Dropdown/Bar_View.png");
        Bar_View.unsichtbarMachen();
        Bar_History = new Bild(1280,960,"graphics/Dropdown/Bar_History.png");
        Bar_History.unsichtbarMachen();
        Bar_Turn = new Bild(1280,960,"graphics/Dropdown/Bar_Turn.png");
        Bar_Turn.unsichtbarMachen();
        Turn_Player = new Bild(920,0,360,34,"graphics/Dropdown/Turn_Player.png");
        Turn_Player.unsichtbarMachen();
        Display_Turn = new Ausgabe(""+round,994,-6,29,44);
        Display_Turn.unsichtbarMachen();
        marker = new Bild(1018,0,34,34,"graphics/Dropdown/marker.png");
        marker.unsichtbarMachen();

        border = new Bild(0,34,1280,926,"graphics/Overlays/Border_x2.png");
        border.unsichtbarMachen();

        QBG = new MausBehaelter(16,0,74,32);
        Game = new MausBehaelter(112,0,96,32);
        Order = new MausBehaelter(224,0,98,32);
        Report = new MausBehaelter(336,0,106,32);
        Hero = new MausBehaelter(464,0,82,32);
        View = new MausBehaelter(560,0,84,32);
        History = new MausBehaelter(656,0,110,32);
        Turn = new MausBehaelter(784,0,74,32);
        QBG.setzeMausClick();
        Game.setzeMausClick();
        Order.setzeMausClick();
        Report.setzeMausClick();
        Hero.setzeMausClick();
        View.setzeMausClick();
        History.setzeMausClick();
        Turn.setzeMausClick();
        QBG.setzeLink(this,26);
        Game.setzeLink(this,27);
        Order.setzeLink(this,28);
        Report.setzeLink(this,29);
        Hero.setzeLink(this,30);
        View.setzeLink(this,31);
        History.setzeLink(this,32);
        Turn.setzeLink(this,33);

        playeroptions = new Bild(0,34,1280,926,"graphics/Playeroptions/playeroptions_x2.png");
        playeroptions.unsichtbarMachen();
        player1 = new MausBehaelter(192,104,160,50); 
        player2 = new MausBehaelter(192,284,160,50);
        player3 = new MausBehaelter(192,464,160,50);
        player4 = new MausBehaelter(192,644,160,50);
        player5 = new MausBehaelter(560,104,160,50);
        player6 = new MausBehaelter(560,284,160,50);
        player7 = new MausBehaelter(560,464,160,50);
        player8 = new MausBehaelter(560,644,160,50);
        player1.setzeLink(this,2);
        player2.setzeLink(this,3);
        player3.setzeLink(this,4);
        player4.setzeLink(this,5);
        player5.setzeLink(this,6);
        player6.setzeLink(this,7);
        player7.setzeLink(this,8);
        player8.setzeLink(this,9);
        player1.setzeMausClick();
        player2.setzeMausClick();
        player3.setzeMausClick();
        player4.setzeMausClick();
        player5.setzeMausClick();
        player6.setzeMausClick();
        player7.setzeMausClick();
        player8.setzeMausClick();
        player1.unsichtbarMachen();
        player2.unsichtbarMachen();
        player3.unsichtbarMachen();
        player4.unsichtbarMachen();
        player5.unsichtbarMachen();
        player6.unsichtbarMachen();
        player7.unsichtbarMachen();
        player8.unsichtbarMachen();
        player1off = new Bild(192,104,160,50,"graphics/Buttons/Off.png");
        player1off.unsichtbarMachen();
        player2off = new Bild(192,284,160,50,"graphics/Buttons/Off.png");
        player2off.unsichtbarMachen();
        player3off = new Bild(192,464,160,50,"graphics/Buttons/Off.png");
        player3off.unsichtbarMachen();
        player4off = new Bild(192,644,160,50,"graphics/Buttons/Off.png");
        player4off.unsichtbarMachen();
        player5off = new Bild(560,104,160,50,"graphics/Buttons/Off.png");
        player5off.unsichtbarMachen();
        player6off = new Bild(560,284,160,50,"graphics/Buttons/Off.png");
        player6off.unsichtbarMachen();
        player7off = new Bild(560,464,160,50,"graphics/Buttons/Off.png");
        player7off.unsichtbarMachen();
        player8off = new Bild(560,644,160,50,"graphics/Buttons/Off.png");
        player8off.unsichtbarMachen();
        PC1_cracked = new Bild(80,112,80,80,"graphics/Playeroptions/PC_cracked.png");
        PC1_cracked.unsichtbarMachen();
        PC2_cracked = new Bild(80,292,80,80,"graphics/Playeroptions/PC_cracked.png");
        PC2_cracked.unsichtbarMachen();
        PC3_cracked = new Bild(80,472,80,80,"graphics/Playeroptions/PC_cracked.png");
        PC3_cracked.unsichtbarMachen();
        PC4_cracked = new Bild(80,652,80,80,"graphics/Playeroptions/PC_cracked.png");
        PC4_cracked.unsichtbarMachen();
        PC5_cracked = new Bild(448,112,80,80,"graphics/Playeroptions/PC_cracked.png");
        PC5_cracked.unsichtbarMachen();
        PC6_cracked = new Bild(448,292,80,80,"graphics/Playeroptions/PC_cracked.png");
        PC6_cracked.unsichtbarMachen();
        PC7_cracked = new Bild(448,472,80,80,"graphics/Playeroptions/PC_cracked.png");
        PC7_cracked.unsichtbarMachen();
        PC8_cracked = new Bild(448,652,80,80,"graphics/Playeroptions/PC_cracked.png");
        PC8_cracked.unsichtbarMachen();
        name2_weiss = new Bild(86,64,240,34,"graphics/Playeroptions/White_Knights.png");
        name2_weiss.unsichtbarMachen();
        name2_gelb = new Bild(86,244,240,34,"graphics/Playeroptions/Ice_Jarls.png");
        name2_gelb.unsichtbarMachen();
        name2_orange = new Bild(86,424,260,34,"graphics/Playeroptions/Khazarak.png");
        name2_orange.unsichtbarMachen();
        name2_rot = new Bild(86,604,240,34,"graphics/Playeroptions/Ogre_Lords.png");
        name2_rot.unsichtbarMachen();
        name2_gruen = new Bild(454,64,240,34,"graphics/Playeroptions/Forestfolk.png");
        name2_gruen.unsichtbarMachen();
        name2_blau = new Bild(454,244,240,34,"graphics/Playeroptions/Emphidians.png");
        name2_blau.unsichtbarMachen();
        name2_hellblau = new Bild(454,424,240,34,"graphics/Playeroptions/Wild_Men.png");
        name2_hellblau.unsichtbarMachen();
        name2_schwarz = new Bild(454,604,240,34,"graphics/Playeroptions/Deathmaster.png");
        name2_schwarz.unsichtbarMachen();
        name3_schwarz = new Bild(454,604,240,34,"graphics/Playeroptions/King_BBQ.png");
        name3_schwarz.unsichtbarMachen();

        name1 = new MausBehaelter(86,64,240,34);
        name2 = new MausBehaelter(86,244,240,34);
        name3 = new MausBehaelter(86,424,240,34);
        name4 = new MausBehaelter(86,604,240,34);
        name5 = new MausBehaelter(454,64,240,34);
        name6 = new MausBehaelter(454,244,240,34);
        name7 = new MausBehaelter(454,424,240,34);
        name8 = new MausBehaelter(454,604,240,34);
        name1.setzeLink(this,18);
        name2.setzeLink(this,19);
        name3.setzeLink(this,20);
        name4.setzeLink(this,21);
        name5.setzeLink(this,22);
        name6.setzeLink(this,23);
        name7.setzeLink(this,24);
        name8.setzeLink(this,25);
        name1.setzeMausClick();
        name2.setzeMausClick();
        name3.setzeMausClick();
        name4.setzeMausClick();
        name5.setzeMausClick();
        name6.setzeMausClick();
        name7.setzeMausClick();
        name8.setzeMausClick();
        name1.unsichtbarMachen();
        name2.unsichtbarMachen();
        name3.unsichtbarMachen();
        name4.unsichtbarMachen();
        name5.unsichtbarMachen();
        name6.unsichtbarMachen();
        name7.unsichtbarMachen();
        name8.unsichtbarMachen();
        reset = new MausBehaelter(48,832,160,80);
        reset.setzeLink(this,17);
        reset.setzeMausClick();
        reset.unsichtbarMachen();

        updtrp = new Taktgeber();

        tileselect = new MausBehaelter[9] [9];
        for(int t2 = 0;t2 < 9;t2++)
        {
            for(int t1 = 0;t1 < 9;t1++)
            {
                tileselect[t1] [t2] = new MausBehaelter(t1*80+32,t2*80+26,80,80);
                tileselect[t1] [t2].setzeLink(this,200+t2*10+t1);
                tileselect[t1] [t2].setzeMausClick();
                tileselect[t1] [t2].unsichtbarMachen();
            }
        }

        Beginner = new Bild(832,140,384,46,"graphics/Buttons/Beginner.png");
        Beginner.unsichtbarMachen();
        Intermediate = new Bild(832,190,384,46,"graphics/Buttons/Intermediate.png");
        Intermediate.unsichtbarMachen();
        Advanced = new Bild(832,240,384,46,"graphics/Buttons/Advanced.png");
        Advanced.unsichtbarMachen();
        // TheGreatest = new Bild(832,290,384,46,"graphics/Buttons/TheGreatest.png");
        // TheGreatest.unsichtbarMachen();
        // Options = new Bild(832,340,384,46,"graphics/Buttons/Options.png");
        // Options.unsichtbarMachen();
        Start = new Bild(832,454,384,46,"graphics/Buttons/Start.png");
        Start.unsichtbarMachen();
        MainMenu = new Bild(832,504,384,46,"graphics/Buttons/MainMenu.png");
        MainMenu.unsichtbarMachen();
        Beginner_button = new MausBehaelter(832,140,384,46);
        Intermediate_button = new MausBehaelter(832,190,384,46);
        Advanced_button = new MausBehaelter(832,240,384,46);
        Options_button = new MausBehaelter(832,290,384,46);
        TheGreatest_button = new MausBehaelter(832,340,384,46);
        Start_button = new MausBehaelter(832,454,384,46);
        MainMenu_button = new MausBehaelter(832,504,384,46);
        Beginner_button.setzeLink(this,10);
        Intermediate_button.setzeLink(this,11);
        Advanced_button.setzeLink(this,12);
        Options_button.setzeLink(this,13);
        TheGreatest_button.setzeLink(this,14);
        Start_button.setzeLink(this,15);
        MainMenu_button.setzeLink(this,16);
        Beginner_button.setzeMausClick();
        Intermediate_button.setzeMausClick();
        Advanced_button.setzeMausClick();
        TheGreatest_button.setzeMausClick();
        Options_button.setzeMausClick();
        Start_button.setzeMausClick();
        MainMenu_button.setzeMausClick();
        Beginner_button.unsichtbarMachen();
        Intermediate_button.unsichtbarMachen();
        Advanced_button.unsichtbarMachen();
        TheGreatest_button.unsichtbarMachen();
        Options_button.unsichtbarMachen();
        Start_button.unsichtbarMachen();
        MainMenu_button.unsichtbarMachen();
        //name1 = new MausBehaelter();

        troops = new Troops();
        activetroop = new Bild(0,0,80,80,"graphics/Overlays/activetroop.png");
        activetroop.unsichtbarMachen();

        qbg_about = new Taste("About Warlords",0,34,200,34);
        qbg_about.setzePosition(-200,-200);
        game_settings  = new Taste("Settings   alt X",102,34,200,34);
        game_settings.setzePosition(-200,-200);
        game_shortcuts  = new Taste("Shortcuts  alt U",102,68,200,34);
        game_shortcuts.setzePosition(-200,-200);
        game_new_game  = new Taste("New Game   alt N",102,102,200,34);
        game_new_game.setzePosition(-200,-200);
        game_save_game  = new Taste("Save Game  alt S",102,136,200,34);
        game_save_game.setzePosition(-200,-200);
        game_load_game  = new Taste("Load Game  alt L",102,170,200,34);
        game_load_game.setzePosition(-200,-200);
        game_save_map  = new Taste("Save Map   alt M",102,204,200,34);
        game_save_map.setzePosition(-200,-200);
        game_load_map  = new Taste("Load Map   alt Z",102,238,200,34);
        game_load_map.setzePosition(-200,-200);
        game_quit  = new Taste("Quit          ^Q",102,272,200,34);
        game_quit.setzePosition(-200,-200);
        order_fight_order  = new Taste("Fight Order i",214,34,200,34);
        order_fight_order.setzePosition(-200,-200);
        order_move_all  = new Taste("Move All    m",214,68,200,34);
        order_move_all.setzePosition(-200,-200);
        order_disbund  = new Taste("Disbund      q",214,102,200,34);
        order_disbund.setzePosition(-200,-200);
        order_signpost  = new Taste("Signpost     x",214,136,200,34);
        order_signpost.setzePosition(-200,-200);
        order_resign  = new Taste("Resign       r",214,170,200,34);
        order_resign.setzePosition(-200,-200);
        report_army  = new Taste("Army       a",326,34,200,34);
        report_army.setzePosition(-200,-200);
        report_city  = new Taste("City       k",326,68,200,34);
        report_city.setzePosition(-200,-200);
        report_gold  = new Taste("Gold       g",326,102,200,34);
        report_gold.setzePosition(-200,-200);
        report_production  = new Taste("Production n",326,136,200,34);
        report_production.setzePosition(-200,-200);
        report_winning  = new Taste("Winning    w",326,170,200,34);
        report_winning.setzePosition(-200,-200);
        report_diplomacy  = new Taste("Diplomacy  d",326,204,200,34);
        report_diplomacy.setzePosition(-200,-200);
        report_quest  = new Taste("Quest      =",326,238,200,34);
        report_quest.setzePosition(-200,-200);
        hero_inspect  = new Taste("Inspect    ,",454,34,200,34);
        hero_inspect.setzePosition(-200,-200);
        hero_plant_flag = new Taste("Plant Flag f",454,68,200,34);
        hero_plant_flag.setzePosition(-200,-200);
        hero_levels = new Taste("Levels     u",454,102,200,34);
        hero_levels.setzePosition(-200,-200);
        hero_search = new Taste("Search     z",454,136,200,34);
        hero_search.setzePosition(-200,-200);
        view_army_bonus = new Taste("Army Bonus a",550,34,200,34);
        view_army_bonus.setzePosition(-200,-200);
        view_items = new Taste("Items      t",550,68,200,34);
        view_items.setzePosition(-200,-200);
        view_build = new Taste("Build      b",550,102,200,34);
        view_build.setzePosition(-200,-200);
        view_cities = new Taste("Cities     c",550,136,200,34);
        view_cities.setzePosition(-200,-200);
        view_production = new Taste("Production p",550,170,200,34);
        view_production.setzePosition(-200,-200);
        view_vectoring = new Taste("Vectoring  v",550,204,200,34);
        view_vectoring.setzePosition(-200,-200);
        view_ruins = new Taste("Ruins      .",550,238,200,34);
        view_ruins.setzePosition(-200,-200);
        view_stack = new Taste("Stack      s",550,272,200,34);
        view_stack.setzePosition(-200,-200);
        history_city = new Taste("City     h",646,34,200,34);
        history_city.setzePosition(-200,-200);
        history_events = new Taste("Events    e",646,68,200,34);
        history_events.setzePosition(-200,-200);
        history_gold = new Taste("Gold     i",646,102,200,34);
        history_gold.setzePosition(-200,-200);
        history_winners = new Taste("Winners  y",646,136,200,34);
        history_winners.setzePosition(-200,-200);
        history_triumphs = new Taste("Triumphs l",646,170,200,34);
        history_triumphs.setzePosition(-200,-200);
        turn_end_turn = new Taste("End Turn  alt E",774,34,200,34);
        turn_end_turn.setzePosition(-200,-200);

        qbg_about.setzeHintergrundfarbe("orange");
        game_settings.setzeHintergrundfarbe("orange");
        game_shortcuts.setzeHintergrundfarbe("orange");
        game_new_game.setzeHintergrundfarbe("orange");
        game_save_game.setzeHintergrundfarbe("orange");
        game_load_game.setzeHintergrundfarbe("orange");
        game_save_map.setzeHintergrundfarbe("orange");
        game_load_map.setzeHintergrundfarbe("orange");
        game_quit.setzeHintergrundfarbe("orange");
        order_fight_order.setzeHintergrundfarbe("orange");
        order_move_all.setzeHintergrundfarbe("orange");
        order_disbund.setzeHintergrundfarbe("orange");
        order_signpost.setzeHintergrundfarbe("orange");
        order_resign.setzeHintergrundfarbe("orange");
        report_army.setzeHintergrundfarbe("orange");
        report_city.setzeHintergrundfarbe("orange");
        report_gold.setzeHintergrundfarbe("orange");
        report_production.setzeHintergrundfarbe("orange");
        report_winning.setzeHintergrundfarbe("orange");
        report_diplomacy.setzeHintergrundfarbe("orange");
        report_quest.setzeHintergrundfarbe("orange");
        hero_inspect.setzeHintergrundfarbe("orange");
        hero_plant_flag.setzeHintergrundfarbe("orange");
        hero_levels.setzeHintergrundfarbe("orange");
        hero_search.setzeHintergrundfarbe("orange");
        view_army_bonus.setzeHintergrundfarbe("orange");
        view_items.setzeHintergrundfarbe("orange");
        view_build.setzeHintergrundfarbe("orange");
        view_cities.setzeHintergrundfarbe("orange");
        view_production.setzeHintergrundfarbe("orange");
        view_vectoring.setzeHintergrundfarbe("orange");
        view_ruins.setzeHintergrundfarbe("orange");
        view_stack.setzeHintergrundfarbe("orange");
        history_city.setzeHintergrundfarbe("orange");
        history_events.setzeHintergrundfarbe("orange");
        history_gold.setzeHintergrundfarbe("orange");
        history_winners.setzeHintergrundfarbe("orange");
        history_triumphs.setzeHintergrundfarbe("orange");
        turn_end_turn.setzeHintergrundfarbe("orange");

        qbg_about.setzeLink(this,100);
        game_settings.setzeLink(this,101);
        game_shortcuts.setzeLink(this,102);
        game_new_game.setzeLink(this,103);
        game_save_game.setzeLink(this,104);
        game_load_game.setzeLink(this,105);
        game_save_map.setzeLink(this,106);
        game_load_map.setzeLink(this,107);
        game_quit.setzeLink(this,108);
        order_fight_order.setzeLink(this,109);
        order_move_all.setzeLink(this,110);
        order_disbund.setzeLink(this,111);
        order_signpost.setzeLink(this,112);
        order_resign.setzeLink(this,113);
        report_army.setzeLink(this,114);
        report_city.setzeLink(this,115);
        report_gold.setzeLink(this,116);
        report_production.setzeLink(this,117);
        report_winning.setzeLink(this,118);
        report_diplomacy.setzeLink(this,119);
        report_quest.setzeLink(this,120);
        hero_inspect.setzeLink(this,121);
        hero_plant_flag.setzeLink(this,122);
        hero_levels.setzeLink(this,123);
        hero_search.setzeLink(this,124);
        view_army_bonus.setzeLink(this,125);
        view_items.setzeLink(this,126);
        view_build.setzeLink(this,127);
        view_cities.setzeLink(this,128);
        view_production.setzeLink(this,129);
        view_vectoring.setzeLink(this,130);
        view_ruins.setzeLink(this,131);
        view_stack.setzeLink(this,132);
        history_city.setzeLink(this,133);
        history_events.setzeLink(this,134);
        history_gold.setzeLink(this,135);
        history_winners.setzeLink(this,136);
        history_triumphs.setzeLink(this,137);
        turn_end_turn.setzeLink(this,138);

        tastatur = new Tastatur();
        tastatur.setzeLink(this);
        tastatur.tstAbisZ(tastatur);
        tastatur.tstaBISz();
        tastatur.meldeAnTaste("ctrl Q","QUIT");
        tastatur.meldeAnTaste("alt X","SETTINGS");
        tastatur.meldeAnTaste("alt U","SHORTCUTS");
        tastatur.meldeAnTaste("alt N","NEW GAME");
        tastatur.meldeAnTaste("alt S","SAVE GAME");
        tastatur.meldeAnTaste("alt L","LOAD GAME");
        tastatur.meldeAnTaste("alt E","END TURN");

        StaticTools.warte(1000);
        if(hen == 1)
        {
            adviser_open_eyes = new Bild(331,49,646,862,"graphics/adviser/hen.png");
        }
        else
        {
            adviser_open_eyes = new Bild(331,49,618,862,"graphics/adviser/adviser_open_eyes.png");
        }
        greetings = new Audio("sounds/adviser/greetings.wav");
        greetings.play();
        StaticTools.warte(2500);
        adviser_open_eyes.unsichtbarMachen();
        //music = new MusicQB("sounds/adviser/OverworldTheme.wav");
        //music.play();

    }

    public void jumpTo(int xTile, int yTile)
    {
        int nachX = xTile - xField;
        int nachY = yTile - yField;
        if(nachX < 0)
        {
            xField = xField + nachX;
            for(int i = 0;i < -nachX;i++)
            {
                // tastenAktion("LEFT");
                mapcursor.horizontalBewegen(-4);
                StaticTools.warte(10);
            }
            map.horizontalBewegen(-(nachX*80));
            castles_pic.moveLEFT(-nachX);
            for(int fy = 0;fy < 9;fy++)
            {
                for(int fx = 0;fx < 9;fx++)
                {
                    troops.troops[fx] [fy].unsichtbarMachen();
                }
            }
            activetroop.unsichtbarMachen();
        }
        else
        {
            xField = xField + nachX;
            for(int i = 0;i < nachX;i++)
            {
                // tastenAktion("RIGHT");
                mapcursor.horizontalBewegen(4);
                StaticTools.warte(10);
            }
            map.horizontalBewegen(-(nachX*80));
            castles_pic.moveRIGHT(nachX);
            for(int fy = 0;fy < 9;fy++)
            {
                for(int fx = 0;fx < 9;fx++)
                {
                    troops.troops[fx] [fy].unsichtbarMachen();
                }
            }
            activetroop.unsichtbarMachen();
        }
        if(nachY < 0)
        {
            yField = yField + nachY;
            for(int i = 0;i < -nachY;i++)
            {
                // tastenAktion("UP");
                mapcursor.vertikalBewegen(-4);
                StaticTools.warte(10);
            }
            map.vertikalBewegen(-(nachY*80));
            castles_pic.moveUP(-nachY);
            for(int fy = 0;fy < 9;fy++)
            {
                for(int fx = 0;fx < 9;fx++)
                {
                    troops.troops[fx] [fy].unsichtbarMachen();
                }
            }
            activetroop.unsichtbarMachen();
        }
        else
        {
            yField = yField + nachY;
            for(int i = 0;i < nachY;i++)
            {
                // tastenAktion("DOWN");
                mapcursor.vertikalBewegen(4);
                StaticTools.warte(10);
            }
            map.vertikalBewegen(-(nachY*80));
            castles_pic.moveDOWN(nachY);
            for(int fy = 0;fy < 9;fy++)
            {
                for(int fx = 0;fx < 9;fx++)
                {
                    troops.troops[fx] [fy].unsichtbarMachen();
                }
            }
            activetroop.unsichtbarMachen();
        }
    }

    public void tuWas(int ID)
    {
        if(ID == 1) //Begin_Title Screen
        {
            maus_begin.unsichtbarMachen();
            intro.unsichtbarMachen();
            begin.unsichtbarMachen();
            playeroptions.sichtbarMachen();
            player1.sichtbarMachen();
            player2.sichtbarMachen();
            player3.sichtbarMachen();
            player4.sichtbarMachen();
            player5.sichtbarMachen();
            player6.sichtbarMachen();
            player7.sichtbarMachen();
            player8.sichtbarMachen();
            Beginner_button.sichtbarMachen();
            Intermediate_button.sichtbarMachen();
            Advanced_button.sichtbarMachen();
            TheGreatest_button.sichtbarMachen();
            Options_button.sichtbarMachen();
            Start_button.sichtbarMachen();
            MainMenu_button.sichtbarMachen();
            name1.sichtbarMachen();
            name2.sichtbarMachen();
            name3.sichtbarMachen();
            name4.sichtbarMachen();
            name5.sichtbarMachen();
            name6.sichtbarMachen();
            name7.sichtbarMachen();
            name8.sichtbarMachen();
            reset.sichtbarMachen();
        }
        else if(ID == 2) //Player 1
        {
            if(playerinfo.onoff[0] == 1)
            {
                player1off.sichtbarMachen();
                PC1_cracked.sichtbarMachen();
                playerinfo.onoff[0] = 0;
            }
            else if(playerinfo.onoff[0] == 0)
            {
                player1off.unsichtbarMachen();
                PC1_cracked.unsichtbarMachen();
                playerinfo.onoff[0] = 1;
            }
        }
        else if(ID == 3) //Player 2
        {
            if(playerinfo.onoff[1] == 1)
            {
                player2off.sichtbarMachen();
                PC2_cracked.sichtbarMachen();
                playerinfo.onoff[1] = 0;
            }
            else if(playerinfo.onoff[1] == 0)
            {
                player2off.unsichtbarMachen();
                PC2_cracked.unsichtbarMachen();
                playerinfo.onoff[1] = 1;
            }
        }
        else if(ID == 4) //Player 3
        {
            if(playerinfo.onoff[2] == 1)
            {
                player3off.sichtbarMachen();
                PC3_cracked.sichtbarMachen();
                playerinfo.onoff[2] = 0;
            }
            else if(playerinfo.onoff[2] == 0)
            {
                player3off.unsichtbarMachen();
                PC3_cracked.unsichtbarMachen();
                playerinfo.onoff[2] = 1;
            }
        }
        else if(ID == 5) //Player 4
        {
            if(playerinfo.onoff[3] == 1)
            {
                player4off.sichtbarMachen();
                PC4_cracked.sichtbarMachen();
                playerinfo.onoff[3] = 0;
            }
            else if(playerinfo.onoff[3] == 0)
            {
                player4off.unsichtbarMachen();
                PC4_cracked.unsichtbarMachen();
                playerinfo.onoff[3] = 1;
            }
        }
        else if(ID == 6) //Player 5
        {
            if(playerinfo.onoff[4] == 1)
            {
                player5off.sichtbarMachen();
                PC5_cracked.sichtbarMachen();
                playerinfo.onoff[4] = 0;
            }
            else if(playerinfo.onoff[4] == 0)
            {
                player5off.unsichtbarMachen();
                PC5_cracked.unsichtbarMachen();
                playerinfo.onoff[4] = 1;
            }
        }
        else if(ID == 7) //Player 6
        {
            if(playerinfo.onoff[5] == 1)
            {
                player6off.sichtbarMachen();
                PC6_cracked.sichtbarMachen();
                playerinfo.onoff[5] = 0;
            }
            else if(playerinfo.onoff[5] == 0)
            {
                player6off.unsichtbarMachen();
                PC6_cracked.unsichtbarMachen();
                playerinfo.onoff[5] = 1;
            }
        }
        else if(ID == 8) //Player 7
        {
            if(playerinfo.onoff[6] == 1)
            {
                player7off.sichtbarMachen();
                PC7_cracked.sichtbarMachen();
                playerinfo.onoff[6] = 0;
            }
            else if(playerinfo.onoff[6] == 0)
            {
                player7off.unsichtbarMachen();
                PC7_cracked.unsichtbarMachen();
                playerinfo.onoff[6] = 1;
            }
        }
        else if(ID == 9) //Player 8
        {
            if(playerinfo.onoff[7] == 1)
            {
                player8off.sichtbarMachen();
                PC8_cracked.sichtbarMachen();
                playerinfo.onoff[7] = 0;
            }
            else if(playerinfo.onoff[7] == 0)
            {
                player8off.unsichtbarMachen();
                PC8_cracked.unsichtbarMachen();
                playerinfo.onoff[7] = 1;
            }
        }
        else if(ID == 10) //Beginner
        {
            if(level[0] == 0)
            {
                Beginner.unsichtbarMachen();
                Intermediate.unsichtbarMachen();
                Advanced.unsichtbarMachen();
                level[0] = 1;
                level[1] = 0;
                level[2] = 0;
            }
        }
        else if(ID == 11) //Intermediate
        {
            if(level[1] == 0)
            {
                Beginner.sichtbarMachen();
                Intermediate.sichtbarMachen();
                Advanced.unsichtbarMachen();
                level[0] = 0;
                level[1] = 1;
                level[2] = 0;
            }
        }
        else if(ID == 12) //Advanced
        {
            if(level[2] == 0)
            {
                Beginner.sichtbarMachen();
                Intermediate.unsichtbarMachen();
                Advanced.sichtbarMachen();
                level[0] = 0;
                level[1] = 0;
                level[2] = 1;
            }
        }
        else if(ID == 13) //Options
        {
            System.out.println("There's NO point in opening something not implemented yet!!!");
        }
        else if(ID == 14) //I am the Greatest
        {
            System.out.println("Maybe you should check your psychological state. You have a Donald Trump like self confidence. That can't be healthy!!!");
        }
        else if(ID == 15) //Begin
        {
            map.sichtbarMachen();
            castles_pic.sichtbarMachen();
            mapcursor = new Bild(800,60,36,36,"graphics/Overlays/Mapcursor.png");
            border.sichtbarMachen();
            Turn_Player.sichtbarMachen();
            Display_Turn.sichtbarMachen();
            marker.sichtbarMachen();
            playeroptions.unsichtbarMachen();
            player1.unsichtbarMachen();
            player2.unsichtbarMachen();
            player3.unsichtbarMachen();
            player4.unsichtbarMachen();
            player5.unsichtbarMachen();
            player6.unsichtbarMachen();
            player7.unsichtbarMachen();
            player8.unsichtbarMachen();
            Beginner_button.unsichtbarMachen();
            Intermediate_button.unsichtbarMachen();
            Advanced_button.unsichtbarMachen();
            TheGreatest_button.unsichtbarMachen();
            Options_button.unsichtbarMachen();
            Start_button.unsichtbarMachen();
            MainMenu_button.unsichtbarMachen();
            PC1_cracked.unsichtbarMachen();
            PC2_cracked.unsichtbarMachen();
            PC3_cracked.unsichtbarMachen();
            PC4_cracked.unsichtbarMachen();
            PC5_cracked.unsichtbarMachen();
            PC6_cracked.unsichtbarMachen();
            PC7_cracked.unsichtbarMachen();
            PC8_cracked.unsichtbarMachen();
            player1off.unsichtbarMachen();
            player2off.unsichtbarMachen();
            player3off.unsichtbarMachen();
            player4off.unsichtbarMachen();
            player5off.unsichtbarMachen();
            player6off.unsichtbarMachen();
            player7off.unsichtbarMachen();
            player8off.unsichtbarMachen();
            name2_weiss.unsichtbarMachen();
            name2_gelb.unsichtbarMachen();
            name2_orange.unsichtbarMachen();
            name2_rot.unsichtbarMachen();
            name2_gruen.unsichtbarMachen();
            name2_blau.unsichtbarMachen();
            name2_hellblau.unsichtbarMachen();
            name2_schwarz.unsichtbarMachen();
            name3_schwarz.unsichtbarMachen();
            Beginner.unsichtbarMachen();
            Intermediate.unsichtbarMachen();
            Advanced.unsichtbarMachen();
            adviser_open_eyes.sichtbarMachen();
            let_the_war_begin = new Audio("sounds/adviser/let_the_war_begin.wav");
            let_the_war_begin.play();
            StaticTools.warte(3500);
            adviser_open_eyes.unsichtbarMachen();
            tastatur.tstRichtung();
            updtrp.endlos(0,10);
            updtrp.setzeLink(this,500);
            if(playerinfo.onoff[0] == 1){
                castles[32] = 1;
            }
            if(playerinfo.onoff[1] == 1){
                castles[69] = 2;
            }
            if(playerinfo.onoff[2] == 1){
                castles[23] = 3;
            }
            if(playerinfo.onoff[3] == 1){
                castles[72] = 4;
            }
            if(playerinfo.onoff[4] == 1){
                castles[49] = 5;
            }
            if(playerinfo.onoff[5] == 1){
                castles[9] = 6;
            }
            if(playerinfo.onoff[6] == 1){
                castles[48] = 7;
            }
            if(playerinfo.onoff[7] == 1){
                castles[2] = 8;
            }
            updateCastles();
            for(int t2 = 0;t2 < 9;t2++)
            {
                for(int t1 = 0;t1 < 9;t1++)
                {
                    tileselect[t1] [t2].sichtbarMachen();
                }
            }
            whichPlayerNext();
        }
        else if(ID == 16) //Main Menu
        {
            tuWas(17);
            maus_begin.sichtbarMachen();
            intro.sichtbarMachen();
            begin.sichtbarMachen();
            playeroptions.unsichtbarMachen();
            player1.unsichtbarMachen();
            player2.unsichtbarMachen();
            player3.unsichtbarMachen();
            player4.unsichtbarMachen();
            player5.unsichtbarMachen();
            player6.unsichtbarMachen();
            player7.unsichtbarMachen();
            player8.unsichtbarMachen();
            Beginner_button.unsichtbarMachen();
            Intermediate_button.unsichtbarMachen();
            Advanced_button.unsichtbarMachen();
            TheGreatest_button.unsichtbarMachen();
            Options_button.unsichtbarMachen();
            Start_button.unsichtbarMachen();
            MainMenu_button.unsichtbarMachen();
        }
        else if(ID == 17) //RESET
        {
            PC1_cracked.unsichtbarMachen();
            PC2_cracked.unsichtbarMachen();
            PC3_cracked.unsichtbarMachen();
            PC4_cracked.unsichtbarMachen();
            PC5_cracked.unsichtbarMachen();
            PC6_cracked.unsichtbarMachen();
            PC7_cracked.unsichtbarMachen();
            PC8_cracked.unsichtbarMachen();
            player1off.unsichtbarMachen();
            player2off.unsichtbarMachen();
            player3off.unsichtbarMachen();
            player4off.unsichtbarMachen();
            player5off.unsichtbarMachen();
            player6off.unsichtbarMachen();
            player7off.unsichtbarMachen();
            player8off.unsichtbarMachen();
            playerinfo.onoff[1] =  1;
            playerinfo.onoff[2] =  1;
            playerinfo.onoff[3] =  1;
            playerinfo.onoff[4] =  1;
            playerinfo.onoff[5] =  1;
            playerinfo.onoff[6] =  1;
            playerinfo.onoff[7] =  1;
            playerinfo.onoff[0] =  1;
            Beginner.unsichtbarMachen();
            Intermediate.unsichtbarMachen();
            Advanced.unsichtbarMachen();
            level[0] = 1;
            level[1] = 0;
            level[2] = 0;
            for(int i = 0;i<8;i++)
            {
                names[i] = 0;
            }
            name2_weiss.unsichtbarMachen();
            name2_gelb.unsichtbarMachen();
            name2_orange.unsichtbarMachen();
            name2_rot.unsichtbarMachen();
            name2_gruen.unsichtbarMachen();
            name2_blau.unsichtbarMachen();
            name2_hellblau.unsichtbarMachen();
            name2_schwarz.unsichtbarMachen();
            name3_schwarz.unsichtbarMachen();
        }
        else if(ID == 18) //Name Player 1
        {
            if(names[0] == 0)
            {
                name2_weiss.sichtbarMachen();
                names[0] = 1;
            }
            else if(names[0] == 1)
            {
                name2_weiss.unsichtbarMachen();
                names[0] = 0;
            }
        }
        else if(ID == 19) //Name Player 2
        {
            if(names[1] == 0)
            {
                name2_gelb.sichtbarMachen();
                names[1] = 1;
            }
            else if(names[1] == 1)
            {
                name2_gelb.unsichtbarMachen();
                names[1] = 0;
            }
        }
        else if(ID == 20) //Name Player 3
        {
            if(names[2] == 0)
            {
                name2_orange.sichtbarMachen();
                names[2] = 1;
            }
            else if(names[2] == 1)
            {
                name2_orange.unsichtbarMachen();
                names[2] = 0;
            }
        }
        else if(ID == 21) //Name Player 4
        {
            if(names[3] == 0)
            {
                name2_rot.sichtbarMachen();
                names[3] = 1;
            }
            else if(names[3] == 1)
            {
                name2_rot.unsichtbarMachen();
                names[3] = 0;
            }
        }
        else if(ID == 22) //Name Player 5
        {
            if(names[4] == 0)
            {
                name2_gruen.sichtbarMachen();
                names[4] = 1;
            }
            else if(names[4] == 1)
            {
                name2_gruen.unsichtbarMachen();
                names[4] = 0;
            }
        }
        else if(ID == 23) //Name Player 6
        {
            if(names[5] == 0)
            {
                name2_blau.sichtbarMachen();
                names[5] = 1;
            }
            else if(names[5] == 1)
            {
                name2_blau.unsichtbarMachen();
                names[5] = 0;
            }
        }
        else if(ID == 24) //Name Player 7
        {
            if(names[6] == 0)
            {
                name2_hellblau.sichtbarMachen();
                names[6] = 1;
            }
            else if(names[6] == 1)
            {
                name2_hellblau.unsichtbarMachen();
                names[6] = 0;
            }
        }
        else if(ID == 25) //Name Player 8
        {
            if(names[7] == 0)
            {
                name2_schwarz.sichtbarMachen();
                names[7] = 1;
            }
            else if(names[7] == 1)
            {
                name2_schwarz.unsichtbarMachen();
                name3_schwarz.sichtbarMachen();
                names[7] = 2;
            }
            else if(names[7] == 2)
            {
                name3_schwarz.unsichtbarMachen();
                names[7] = 0;
            }
        }
        else if(ID == 26)
        {
            if(dropdown_qbg)
            {
                DropdownClear();
                dropdown_qbg = false;
            }
            else
            {
                DropdownClear();
                Bar_QBG.sichtbarMachen();
                qbg_about.setzePosition(0,34);
                dropdown_qbg = true;
            }
        }
        else if(ID == 27)
        {
            if(dropdown_game)
            {
                DropdownClear();
                dropdown_game = false;
            }
            else
            {
                DropdownClear();
                Bar_Game.sichtbarMachen();
                game_settings.setzePosition(102,34);
                game_shortcuts.setzePosition(102,68);
                game_new_game.setzePosition(102,102);
                game_save_game.setzePosition(102,136);
                game_load_game.setzePosition(102,170);
                game_save_map.setzePosition(102,204);
                game_load_map.setzePosition(102,238);
                game_quit.setzePosition(102,272);
                dropdown_game = true;
            }
        }
        else if(ID == 28)
        {
            if(dropdown_order)
            {
                DropdownClear();
                dropdown_order = false;
            }
            else
            {
                DropdownClear();
                Bar_Order.sichtbarMachen();
                order_fight_order.setzePosition(214,34);
                order_move_all.setzePosition(214,68);
                order_disbund.setzePosition(214,102);
                order_signpost.setzePosition(214,136);
                order_resign.setzePosition(214,170);
                dropdown_order = true;
            }
        }
        else if(ID == 29)
        {
            if(dropdown_report)
            {
                DropdownClear();
                dropdown_report = false;
            }
            else
            {
                DropdownClear();
                Bar_Report.sichtbarMachen();
                report_army.setzePosition(326,34);
                report_city.setzePosition(326,68);
                report_gold.setzePosition(326,102);
                report_production.setzePosition(326,136);
                report_winning.setzePosition(326,170);
                report_diplomacy.setzePosition(326,204);
                report_quest.setzePosition(326,238);
                dropdown_report = true;
            }
        }
        else if(ID == 30)
        {
            if(dropdown_hero)
            {
                DropdownClear();
                dropdown_hero = false;
            }
            else
            {
                DropdownClear();
                Bar_Hero.sichtbarMachen();
                hero_inspect.setzePosition(454,34);
                hero_plant_flag.setzePosition(454,68);
                hero_levels.setzePosition(454,102);
                hero_search.setzePosition(454,136);
                dropdown_hero = true;
            }
        }
        else if(ID == 31)
        {
            if(dropdown_view)
            {
                DropdownClear();
                dropdown_view = false;
            }
            else
            {
                DropdownClear();
                Bar_View.sichtbarMachen();
                view_army_bonus.setzePosition(550,34);
                view_items.setzePosition(550,68);
                view_build.setzePosition(550,102);
                view_cities.setzePosition(550,136);
                view_production.setzePosition(550,170);
                view_vectoring.setzePosition(550,204);
                view_ruins.setzePosition(550,238);
                view_stack.setzePosition(550,272);
                dropdown_view = true;
            }
        }
        else if(ID == 32)
        {
            if(dropdown_history)
            {
                DropdownClear();
                dropdown_history = false;
            }
            else
            {
                DropdownClear();
                Bar_History.sichtbarMachen();
                history_city.setzePosition(646,34);
                history_events.setzePosition(646,68);
                history_gold.setzePosition(646,102);
                history_winners.setzePosition(646,136);
                history_triumphs.setzePosition(646,170);
                dropdown_history = true;
            }
        }
        else if(ID == 33)
        {
            if(dropdown_turn)
            {
                DropdownClear();
                dropdown_turn = false;
            }
            else
            {
                DropdownClear();
                Bar_Turn.sichtbarMachen();
                turn_end_turn.setzePosition(774,34);
                dropdown_turn = true;
            }
        }
        else if(ID == 34)
        {
            DropdownClear();
        }
        else if(ID == 100) //qbg_about
        {
            DropdownClear();
        }
        else if(ID == 101) //game_settings
        {
            DropdownClear();
        }
        else if(ID == 102) //game_shortcuts
        {
            DropdownClear();
        }
        else if(ID == 103) //game_new_game
        {
            DropdownClear();
        }
        else if(ID == 104) //game_save_game
        {
            DropdownClear();
        }
        else if(ID == 105) //game_load_game
        {
            DropdownClear();
        }
        else if(ID == 106) //game_save_map
        {
            DropdownClear();
        }
        else if(ID == 107) //game_load_map
        {
            DropdownClear();
        }
        else if(ID == 108) //game_quit
        {
            DropdownClear();
            adviser_open_eyes.sichtbarMachen();
            exit = new Audio("sounds/adviser/exit.wav");
            exit.play();
            StaticTools.warte(4000);
            adviser_open_eyes.unsichtbarMachen();
            System.exit(0);
        }
        else if(ID == 109) //order_fight_order
        {
            DropdownClear();
        }
        else if(ID == 110) //order_move_all
        {
            DropdownClear();
        }
        else if(ID == 111) //order_disbund
        {
            DropdownClear();
        }
        else if(ID == 112) //order_signpost
        {
            DropdownClear();
        }
        else if(ID == 113) //order_resign
        {
            DropdownClear();
        }
        else if(ID == 114) //report_army
        {
            DropdownClear();
        }
        else if(ID == 115) //report_city
        {
            DropdownClear();
        }
        else if(ID == 116) //report_gold
        {
            DropdownClear();
        }
        else if(ID == 117) //report_production
        {
            DropdownClear();
        }
        else if(ID == 118) //report_winning
        {
            DropdownClear();
        }
        else if(ID == 119) //report_diplomacy
        {
            DropdownClear();
        }
        else if(ID == 120) //report_quest
        {
            DropdownClear();
        }
        else if(ID == 121) //hero_inspect
        {
            DropdownClear();
        }
        else if(ID == 122) //hero_plant_flag
        {
            DropdownClear();
        }
        else if(ID == 123) //hero_levels
        {
            DropdownClear();
        }
        else if(ID == 124) //hero_search
        {
            DropdownClear();
        }
        else if(ID == 125) //view_army_bonus
        {
            DropdownClear();
        }
        else if(ID == 126) //view_items
        {
            DropdownClear();
        }
        else if(ID == 127) //view_build
        {
            DropdownClear();
        }
        else if(ID == 128) //view_cities
        {
            DropdownClear();
        }
        else if(ID == 129) //view_production
        {
            DropdownClear();
        }
        else if(ID == 130) //view_vectoring
        {
            DropdownClear();
        }
        else if(ID == 131) //view_ruins
        {
            DropdownClear();
        }
        else if(ID == 132) //view_stack
        {
            DropdownClear();
        }
        else if(ID == 133) //history_city
        {
            DropdownClear();
        }
        else if(ID == 134) //history_events
        {
            DropdownClear();
        }
        else if(ID == 135) //history_gold
        {
            DropdownClear();
        }
        else if(ID == 136) //history_winners
        {
            DropdownClear();
        }
        else if(ID == 137) //history_triumphs
        {
            DropdownClear();
        }
        else if(ID == 138) //turn_end_turn
        {
            DropdownClear();
            whichPlayerNext();
        }
        else if(ID == 200) //1.Reihe
        {
            // System.out.println("Behälter1x1");
            int workX = xField;
            int workY = yField;
            if((activeX+1) == workX||(activeX-1) == workX)
            {
                IFX(workX,workY);
            }
            else if((activeY+1) == workY||(activeY-1) == workY)
            {
                IFY(workX,workY);
            }
            else if(a[xField] [yField] == activePlayer)
            {
                activetroop.setzePosition(32,60);
                activetroop.sichtbarMachen();
                activeX = xField;
                activeY = yField;
            }
        }
        else if(ID == 201)
        {
            // System.out.println("Behälter2x1");
            int workX = xField+1;
            int workY = yField;
            if((activeX+1) == workX||(activeX-1) == workX)
            {
                IFX(workX,workY);
            }
            else if((activeY+1) == workY||(activeY-1) == workY)
            {
                IFY(workX,workY);
            }
            else if(a[(xField+1)] [yField] == activePlayer)
            {
                activetroop.setzePosition(112,60);
                activetroop.sichtbarMachen();
                activeX = xField+1;
                activeY = yField;
            }
        }
        else if(ID == 202)
        {
            // System.out.println("Behälter3x1");
            int workX = xField+2;
            int workY = yField;
            if((activeX+1) == workX||(activeX-1) == workX)
            {
                IFX(workX,workY);
            }
            else if((activeY+1) == workY||(activeY-1) == workY)
            {
                IFY(workX,workY);
            }
            else if(a[(xField+2)] [yField] == activePlayer)
            {
                activetroop.setzePosition(192,60);
                activetroop.sichtbarMachen();
                activeX = xField+2;
                activeY = yField;
            }
        }
        else if(ID == 203)
        {
            // System.out.println("Behälter4x1");
            int workX = xField+3;
            int workY = yField;
            if((activeX+1) == workX||(activeX-1) == workX)
            {
                IFX(workX,workY);
            }
            else if((activeY+1) == workY||(activeY-1) == workY)
            {
                IFY(workX,workY);
            }
            else if(a[(xField+3)] [yField] == activePlayer)
            {
                activetroop.setzePosition(272,60);
                activetroop.sichtbarMachen();
                activeX = xField+3;
                activeY = yField;
            }
        }
        else if(ID == 204)
        {
            // System.out.println("Behälter5x1");
            int workX = xField+4;
            int workY = yField;
            if((activeX+1) == workX||(activeX-1) == workX)
            {
                IFX(workX,workY);
            }
            else if((activeY+1) == workY||(activeY-1) == workY)
            {
                IFY(workX,workY);
            }
            else if(a[(xField+4)] [yField] == activePlayer)
            {
                activetroop.setzePosition(352,60);
                activetroop.sichtbarMachen();
                activeX = xField+4;
                activeY = yField;
            }
        }
        else if(ID == 205)
        {
            // System.out.println("Behälter6x1");
            int workX = xField+5;
            int workY = yField;
            if((activeX+1) == workX||(activeX-1) == workX)
            {
                IFX(workX,workY);
            }
            else if((activeY+1) == workY||(activeY-1) == workY)
            {
                IFY(workX,workY);
            }
            else if(a[(xField+5)] [yField] == activePlayer)
            {
                activetroop.setzePosition(432,60);
                activetroop.sichtbarMachen();
                activeX = xField+5;
                activeY = yField;
            }
        }
        else if(ID == 206)
        {
            // System.out.println("Behälter7x1");
            int workX = xField+6;
            int workY = yField;
            if((activeX+1) == workX||(activeX-1) == workX)
            {
                IFX(workX,workY);
            }
            else if((activeY+1) == workY||(activeY-1) == workY)
            {
                IFY(workX,workY);
            }
            else if(a[(xField+6)] [yField] == activePlayer)
            {
                activetroop.setzePosition(512,60);
                activetroop.sichtbarMachen();
                activeX = xField+6;
                activeY = yField;
            }
        }
        else if(ID == 207)
        {
            // System.out.println("Behälter8x1");
            int workX = xField+7;
            int workY = yField;
            if((activeX+1) == workX||(activeX-1) == workX)
            {
                IFX(workX,workY);
            }
            else if((activeY+1) == workY||(activeY-1) == workY)
            {
                IFY(workX,workY);
            }
            else if(a[(xField+7)] [yField] == activePlayer)
            {
                activetroop.setzePosition(592,60);
                activetroop.sichtbarMachen();
                activeX = xField+7;
                activeY = yField;
            }
        }
        else if(ID == 208)
        {
            // System.out.println("Behälter9x1");
            int workX = xField+8;
            int workY = yField;
            if((activeX+1) == workX||(activeX-1) == workX)
            {
                IFX(workX,workY);
            }
            else if((activeY+1) == workY||(activeY-1) == workY)
            {
                IFY(workX,workY);
            }
            else if(a[(xField+8)] [yField] == activePlayer)
            {
                activetroop.setzePosition(672,60);
                activetroop.sichtbarMachen();
                activeX = xField+8;
                activeY = yField;
            }
        }
        else if(ID == 210) //2.Reihe
        {
            // System.out.println("Behälter1x2");
            int workX = xField;
            int workY = yField+1;
            if((activeX+1) == workX||(activeX-1) == workX)
            {
                IFX(workX,workY);
            }
            else if((activeY+1) == workY||(activeY-1) == workY)
            {
                IFY(workX,workY);
            }
            else if(a[(xField)] [(yField+1)] == activePlayer)
            {
                activetroop.setzePosition(32,140);
                activetroop.sichtbarMachen();
                activeX = xField;
                activeY = yField+1;
            }
        }
        else if(ID == 211)
        {
            // System.out.println("Behälter2x2");
            int workX = xField+1;
            int workY = yField+1;
            if((activeX+1) == workX||(activeX-1) == workX)
            {
                IFX(workX,workY);
            }
            else if((activeY+1) == workY||(activeY-1) == workY)
            {
                IFY(workX,workY);
            }
            else if(a[(xField+1)] [(yField+1)] == activePlayer)
            {
                activetroop.setzePosition(112,140);
                activetroop.sichtbarMachen();
                activeX = xField+1;
                activeY = yField+1;
            }
        }
        else if(ID == 212)
        {
            // System.out.println("Behälter3x2");
            int workX = xField+2;
            int workY = yField+1;
            if((activeX+1) == workX||(activeX-1) == workX)
            {
                IFX(workX,workY);
            }
            else if((activeY+1) == workY||(activeY-1) == workY)
            {
                IFY(workX,workY);
            }
            else if(a[(xField+2)] [(yField+1)] == activePlayer)
            {
                activetroop.setzePosition(192,140);
                activetroop.sichtbarMachen();
                activeX = xField+2;
                activeY = yField+1;
            }
        }
        else if(ID == 213)
        {
            // System.out.println("Behälter4x2");
            int workX = xField+3;
            int workY = yField+1;
            if((activeX+1) == workX||(activeX-1) == workX)
            {
                IFX(workX,workY);
            }
            else if((activeY+1) == workY||(activeY-1) == workY)
            {
                IFY(workX,workY);
            }
            else if(a[(xField+3)] [(yField+1)] == activePlayer)
            {
                activetroop.setzePosition(272,140);
                activetroop.sichtbarMachen();
                activeX = xField+3;
                activeY = yField+1;
            }
        }
        else if(ID == 214)
        {
            // System.out.println("Behälter5x2");
            int workX = xField+4;
            int workY = yField+1;
            if((activeX+1) == workX||(activeX-1) == workX)
            {
                IFX(workX,workY);
            }
            else if((activeY+1) == workY||(activeY-1) == workY)
            {
                IFY(workX,workY);
            }
            else if(a[(xField+4)] [(yField+1)] == activePlayer)
            {
                activetroop.setzePosition(352,140);
                activetroop.sichtbarMachen();
                activeX = xField+4;
                activeY = yField+1;
            }
        }
        else if(ID == 215)
        {
            // System.out.println("Behälter6x2");
            int workX = xField+5;
            int workY = yField+1;
            if((activeX+1) == workX||(activeX-1) == workX)
            {
                IFX(workX,workY);
            }
            else if((activeY+1) == workY||(activeY-1) == workY)
            {
                IFY(workX,workY);
            }
            else if(a[(xField+5)] [(yField+1)] == activePlayer)
            {
                activetroop.setzePosition(432,140);
                activetroop.sichtbarMachen();
                activeX = xField+5;
                activeY = yField+1;
            }
        }
        else if(ID == 216)
        {
            // System.out.println("Behälter7x2");
            int workX = xField+6;
            int workY = yField+1;
            if((activeX+1) == workX||(activeX-1) == workX)
            {
                IFX(workX,workY);
            }
            else if((activeY+1) == workY||(activeY-1) == workY)
            {
                IFY(workX,workY);
            }
            else if(a[(xField+6)] [(yField+1)] == activePlayer)
            {
                activetroop.setzePosition(512,140);
                activetroop.sichtbarMachen();
                activeX = xField+6;
                activeY = yField+1;
            }
        }
        else if(ID == 217)
        {
            // System.out.println("Behälter8x2");
            int workX = xField+7;
            int workY = yField+1;
            if((activeX+1) == workX||(activeX-1) == workX)
            {
                IFX(workX,workY);
            }
            else if((activeY+1) == workY||(activeY-1) == workY)
            {
                IFY(workX,workY);
            }
            else if(a[(xField+7)] [(yField+1)] == activePlayer)
            {
                activetroop.setzePosition(592,140);
                activetroop.sichtbarMachen();
                activeX = xField+7;
                activeY = yField+1;
            }        }
        else if(ID == 218)
        {
            // System.out.println("Behälter9x2");
            int workX = xField+8;
            int workY = yField+1;
            if((activeX+1) == workX||(activeX-1) == workX)
            {
                IFX(workX,workY);
            }
            else if((activeY+1) == workY||(activeY-1) == workY)
            {
                IFY(workX,workY);
            }
            else if(a[(xField+8)] [(yField+1)] == activePlayer)
            {
                activetroop.setzePosition(672,140);
                activetroop.sichtbarMachen();
                activeX = xField+8;
                activeY = yField+1;
            }
        }
        else if(ID == 220) //3.Reihe
        {
            // System.out.println("Behälter1x3");
            int workX = xField;
            int workY = yField+2;
            if((activeX+1) == workX||(activeX-1) == workX)
            {
                IFX(workX,workY);
            }
            else if((activeY+1) == workY||(activeY-1) == workY)
            {
                IFY(workX,workY);
            }
            else if(a[(xField)] [(yField+2)] == activePlayer)
            {
                activetroop.setzePosition(32,220);
                activetroop.sichtbarMachen();
                activeX = xField;
                activeY = yField+2;
            }
        }
        else if(ID == 221)
        {
            // System.out.println("Behälter2x3");
            int workX = xField+1;
            int workY = yField+2;
            if((activeX+1) == workX||(activeX-1) == workX)
            {
                IFX(workX,workY);
            }
            else if((activeY+1) == workY||(activeY-1) == workY)
            {
                IFY(workX,workY);
            }
            else if(a[(xField+1)] [(yField+2)] == activePlayer)
            {
                activetroop.setzePosition(112,220);
                activetroop.sichtbarMachen();
                activeX = xField+1;
                activeY = yField+2;
            }
        }
        else if(ID == 222)
        {
            // System.out.println("Behälter3x3");
            int workX = xField+2;
            int workY = yField+2;
            if((activeX+1) == workX||(activeX-1) == workX)
            {
                IFX(workX,workY);
            }
            else if((activeY+1) == workY||(activeY-1) == workY)
            {
                IFY(workX,workY);
            }
            else if(a[(xField+2)] [(yField+2)] == activePlayer)
            {
                activetroop.setzePosition(192,220);
                activetroop.sichtbarMachen();
                activeX = xField+2;
                activeY = yField+2;
            }
        }
        else if(ID == 223)
        {
            // System.out.println("Behälter4x3");
            int workX = xField+3;
            int workY = yField+2;
            if((activeX+1) == workX||(activeX-1) == workX)
            {
                IFX(workX,workY);
            }
            else if((activeY+1) == workY||(activeY-1) == workY)
            {
                IFY(workX,workY);
            }
            else if(a[(xField+3)] [(yField+2)] == activePlayer)
            {
                activetroop.setzePosition(272,220);
                activetroop.sichtbarMachen();
                activeX = xField+3;
                activeY = yField+2;
            }
        }
        else if(ID == 224)
        {
            // System.out.println("Behälter5x3");
            int workX = xField+4;
            int workY = yField+2;
            if((activeX+1) == workX||(activeX-1) == workX)
            {
                IFX(workX,workY);
            }
            else if((activeY+1) == workY||(activeY-1) == workY)
            {
                IFY(workX,workY);
            }
            else if(a[(xField+4)] [(yField+2)] == activePlayer)
            {
                activetroop.setzePosition(352,220);
                activetroop.sichtbarMachen();
                activeX = xField+4;
                activeY = yField+2;
            }
        }
        else if(ID == 225)
        {
            // System.out.println("Behälter6x3");
            int workX = xField+5;
            int workY = yField+2;
            if((activeX+1) == workX||(activeX-1) == workX)
            {
                IFX(workX,workY);
            }
            else if((activeY+1) == workY||(activeY-1) == workY)
            {
                IFY(workX,workY);
            }
            else if(a[(xField+5)] [(yField+2)] == activePlayer)
            {
                activetroop.setzePosition(432,220);
                activetroop.sichtbarMachen();
                activeX = xField+5;
                activeY = yField+2;
            }
        }
        else if(ID == 226)
        {
            // System.out.println("Behälter7x3");
            int workX = xField+6;
            int workY = yField+2;
            if((activeX+1) == workX||(activeX-1) == workX)
            {
                IFX(workX,workY);
            }
            else if((activeY+1) == workY||(activeY-1) == workY)
            {
                IFY(workX,workY);
            }
            else if(a[(xField+6)] [(yField+2)] == activePlayer)
            {
                activetroop.setzePosition(512,220);
                activetroop.sichtbarMachen();
                activeX = xField+6;
                activeY = yField+2;
            }
        }
        else if(ID == 227)
        {
            // System.out.println("Behälter8x3");
            int workX = xField+7;
            int workY = yField+2;
            if((activeX+1) == workX||(activeX-1) == workX)
            {
                IFX(workX,workY);
            }
            else if((activeY+1) == workY||(activeY-1) == workY)
            {
                IFY(workX,workY);
            }
            else if(a[(xField+7)] [(yField+2)] == activePlayer)
            {
                activetroop.setzePosition(592,220);
                activetroop.sichtbarMachen();
                activeX = xField+7;
                activeY = yField+2;
            }
        }
        else if(ID == 228)
        {
            // System.out.println("Behälter9x3");
            int workX = xField+8;
            int workY = yField+2;
            if((activeX+1) == workX||(activeX-1) == workX)
            {
                IFX(workX,workY);
            }
            else if((activeY+1) == workY||(activeY-1) == workY)
            {
                IFY(workX,workY);
            }
            else if(a[(xField+8)] [(yField+2)] == activePlayer)
            {
                activetroop.setzePosition(672,220);
                activetroop.sichtbarMachen();
                activeX = xField+8;
                activeY = yField+2;
            }
        }
        else if(ID == 230) //4.Reihe
        {
            // System.out.println("Behälter1x4");
            int workX = xField;
            int workY = yField+3;
            if((activeX+1) == workX||(activeX-1) == workX)
            {
                IFX(workX,workY);
            }
            else if((activeY+1) == workY||(activeY-1) == workY)
            {
                IFY(workX,workY);
            }
            else if(a[(xField)] [(yField+3)] == activePlayer)
            {
                activetroop.setzePosition(32,300);
                activetroop.sichtbarMachen();
                activeX = xField;
                activeY = yField+3;
            }
        }
        else if(ID == 231)
        {
            // System.out.println("Behälter2x4");
            int workX = xField+1;
            int workY = yField+3;
            if((activeX+1) == workX||(activeX-1) == workX)
            {
                IFX(workX,workY);
            }
            else if((activeY+1) == workY||(activeY-1) == workY)
            {
                IFY(workX,workY);
            }
            else if(a[(xField+1)] [(yField+3)] == activePlayer)
            {
                activetroop.setzePosition(112,300);
                activetroop.sichtbarMachen();
                activeX = xField+1;
                activeY = yField+3;
            }
        }
        else if(ID == 232)
        {
            // System.out.println("Behälter3x4");
            int workX = xField+2;
            int workY = yField+3;
            if((activeX+1) == workX||(activeX-1) == workX)
            {
                IFX(workX,workY);
            }
            else if((activeY+1) == workY||(activeY-1) == workY)
            {
                IFY(workX,workY);
            }
            else if(a[(xField+2)] [(yField+3)] == activePlayer)
            {
                activetroop.setzePosition(192,300);
                activetroop.sichtbarMachen();
                activeX = xField+2;
                activeY = yField+3;
            }
        }
        else if(ID == 233)
        {
            // System.out.println("Behälter4x4");
            int workX = xField+3;
            int workY = yField+3;
            if((activeX+1) == workX||(activeX-1) == workX)
            {
                IFX(workX,workY);
            }
            else if((activeY+1) == workY||(activeY-1) == workY)
            {
                IFY(workX,workY);
            }
            else if(a[(xField+3)] [(yField+3)] == activePlayer)
            {
                activetroop.setzePosition(272,300);
                activetroop.sichtbarMachen();
                activeX = xField+3;
                activeY = yField+3;
            }
        }
        else if(ID == 234)
        {
            // System.out.println("Behälter5x4");
            int workX = xField+4;
            int workY = yField+3;
            if((activeX+1) == workX||(activeX-1) == workX)
            {
                IFX(workX,workY);
            }
            else if((activeY+1) == workY||(activeY-1) == workY)
            {
                IFY(workX,workY);
            }
            else if(a[(xField+4)] [(yField+3)] == activePlayer)
            {
                activetroop.setzePosition(352,300);
                activetroop.sichtbarMachen();
                activeX = xField+4;
                activeY = yField+3;
            }
        }
        else if(ID == 235)
        {
            // System.out.println("Behälter6x4");
            int workX = xField+5;
            int workY = yField+3;
            if((activeX+1) == workX||(activeX-1) == workX)
            {
                IFX(workX,workY);
            }
            else if((activeY+1) == workY||(activeY-1) == workY)
            {
                IFY(workX,workY);
            }
            else if(a[(xField+5)] [(yField+3)] == activePlayer)
            {
                activetroop.setzePosition(432,300);
                activetroop.sichtbarMachen();
                activeX = xField+5;
                activeY = yField+3;
            }
        }
        else if(ID == 236)
        {
            // System.out.println("Behälter7x4");
            int workX = xField+6;
            int workY = yField+3;
            if((activeX+1) == workX||(activeX-1) == workX)
            {
                IFX(workX,workY);
            }
            else if((activeY+1) == workY||(activeY-1) == workY)
            {
                IFY(workX,workY);
            }
            else if(a[(xField+6)] [(yField+3)] == activePlayer)
            {
                activetroop.setzePosition(512,300);
                activetroop.sichtbarMachen();
                activeX = xField+6;
                activeY = yField+3;
            }
        }
        else if(ID == 237)
        {
            // System.out.println("Behälter8x4");
            int workX = xField+7;
            int workY = yField+3;
            if((activeX+1) == workX||(activeX-1) == workX)
            {
                IFX(workX,workY);
            }
            else if((activeY+1) == workY||(activeY-1) == workY)
            {
                IFY(workX,workY);
            }
            else if(a[(xField+7)] [(yField+3)] == activePlayer)
            {
                activetroop.setzePosition(592,300);
                activetroop.sichtbarMachen();
                activeX = xField+7;
                activeY = yField+3;
            }
        }
        else if(ID == 238)
        {
            // System.out.println("Behälter9x4");
            int workX = xField+8;
            int workY = yField+3;
            if((activeX+1) == workX||(activeX-1) == workX)
            {
                IFX(workX,workY);
            }
            else if((activeY+1) == workY||(activeY-1) == workY)
            {
                IFY(workX,workY);
            }
            else if(a[(xField+8)] [(yField+3)] == activePlayer)
            {
                activetroop.setzePosition(672,300);
                activetroop.sichtbarMachen();
                activeX = xField+8;
                activeY = yField+3;
            }
        }
        else if(ID == 240) //5.Reihe
        {
            // System.out.println("Behälter1x5");
            int workX = xField;
            int workY = yField+4;
            if((activeX+1) == workX||(activeX-1) == workX)
            {
                IFX(workX,workY);
            }
            else if((activeY+1) == workY||(activeY-1) == workY)
            {
                IFY(workX,workY);
            }
            else if(a[(xField)] [(yField+4)] == activePlayer)
            {
                activetroop.setzePosition(32,380);
                activetroop.sichtbarMachen();
                activeX = xField;
                activeY = yField+4;
            }
        }
        else if(ID == 241)
        {
            // System.out.println("Behälter2x5");
            int workX = xField+1;
            int workY = yField+4;
            if((activeX+1) == workX||(activeX-1) == workX)
            {
                IFX(workX,workY);
            }
            else if((activeY+1) == workY||(activeY-1) == workY)
            {
                IFY(workX,workY);
            }
            else if(a[(xField+1)] [(yField+4)] == activePlayer)
            {
                activetroop.setzePosition(112,380);
                activetroop.sichtbarMachen();
                activeX = xField+1;
                activeY = yField+4;
            }
        }
        else if(ID == 242)
        {
            // System.out.println("Behälter3x5");
            int workX = xField+2;
            int workY = yField+4;
            if((activeX+1) == workX||(activeX-1) == workX)
            {
                IFX(workX,workY);
            }
            else if((activeY+1) == workY||(activeY-1) == workY)
            {
                IFY(workX,workY);
            }
            else if(a[(xField+2)] [(yField+4)] == activePlayer)
            {
                activetroop.setzePosition(192,380);
                activetroop.sichtbarMachen();
                activeX = xField+2;
                activeY = yField+4;
            }
        }
        else if(ID == 243)
        {
            // System.out.println("Behälter4x5");
            int workX = xField+3;
            int workY = yField+4;
            if((activeX+1) == workX||(activeX-1) == workX)
            {
                IFX(workX,workY);
            }
            else if((activeY+1) == workY||(activeY-1) == workY)
            {
                IFY(workX,workY);
            }
            else if(a[(xField+3)] [(yField+4)] == activePlayer)
            {
                activetroop.setzePosition(272,380);
                activetroop.sichtbarMachen();
                activeX = xField+3;
                activeY = yField+4;
            }
        }
        else if(ID == 244)
        {
            // System.out.println("Behälter5x5");
            int workX = xField+4;
            int workY = yField+4;
            if((activeX+1) == workX||(activeX-1) == workX)
            {
                IFX(workX,workY);
            }
            else if((activeY+1) == workY||(activeY-1) == workY)
            {
                IFY(workX,workY);
            }
            else if(a[(xField+4)] [(yField+4)] == activePlayer)
            {
                activetroop.setzePosition(352,380);
                activetroop.sichtbarMachen();
                activeX = xField+4;
                activeY = yField+4;
            }
        }
        else if(ID == 245)
        {
            // System.out.println("Behälter6x5");
            int workX = xField+5;
            int workY = yField+4;
            if((activeX+1) == workX||(activeX-1) == workX)
            {
                IFX(workX,workY);
            }
            else if((activeY+1) == workY||(activeY-1) == workY)
            {
                IFY(workX,workY);
            }
            else if(a[(xField+5)] [(yField+4)] == activePlayer)
            {
                activetroop.setzePosition(432,380);
                activetroop.sichtbarMachen();
                activeX = xField+5;
                activeY = yField+4;
            }
        }
        else if(ID == 246)
        {
            // System.out.println("Behälter7x5");
            int workX = xField+6;
            int workY = yField+4;
            if((activeX+1) == workX||(activeX-1) == workX)
            {
                IFX(workX,workY);
            }
            else if((activeY+1) == workY||(activeY-1) == workY)
            {
                IFY(workX,workY);
            }
            else if(a[(xField+6)] [(yField+4)] == activePlayer)
            {
                activetroop.setzePosition(512,380);
                activetroop.sichtbarMachen();
                activeX = xField+6;
                activeY = yField+4;
            }
        }
        else if(ID == 247)
        {
            // System.out.println("Behälter8x5");
            int workX = xField+7;
            int workY = yField+4;
            if((activeX+1) == workX||(activeX-1) == workX)
            {
                IFX(workX,workY);
            }
            else if((activeY+1) == workY||(activeY-1) == workY)
            {
                IFY(workX,workY);
            }
            else if(a[(xField+7)] [(yField+4)] == activePlayer)
            {
                activetroop.setzePosition(592,380);
                activetroop.sichtbarMachen();
                activeX = xField+7;
                activeY = yField+4;
            }
        }
        else if(ID == 248)
        {
            // System.out.println("Behälter9x5");
            int workX = xField+8;
            int workY = yField+4;
            if((activeX+1) == workX||(activeX-1) == workX)
            {
                IFX(workX,workY);
            }
            else if((activeY+1) == workY||(activeY-1) == workY)
            {
                IFY(workX,workY);
            }
            else if(a[(xField+8)] [(yField+4)] == activePlayer)
            {
                activetroop.setzePosition(672,380);
                activetroop.sichtbarMachen();
                activeX = xField+8;
                activeY = yField+4;
            }
        }
        else if(ID == 250) //6.Reihe
        {
            // System.out.println("Behälter1x6");
            int workX = xField;
            int workY = yField+5;
            if((activeX+1) == workX||(activeX-1) == workX)
            {
                IFX(workX,workY);
            }
            else if((activeY+1) == workY||(activeY-1) == workY)
            {
                IFY(workX,workY);
            }
            else if(a[(xField)] [(yField+5)] == activePlayer)
            {
                activetroop.setzePosition(32,460);
                activetroop.sichtbarMachen();
                activeX = xField;
                activeY = yField+5;
            }
        }
        else if(ID == 251)
        {
            // System.out.println("Behälter2x6");
            int workX = xField+1;
            int workY = yField+5;
            if((activeX+1) == workX||(activeX-1) == workX)
            {
                IFX(workX,workY);
            }
            else if((activeY+1) == workY||(activeY-1) == workY)
            {
                IFY(workX,workY);
            }
            else if(a[(xField+1)] [(yField+5)] == activePlayer)
            {
                activetroop.setzePosition(112,460);
                activetroop.sichtbarMachen();
                activeX = xField+1;
                activeY = yField+5;
            }
        }
        else if(ID == 252)
        {
            // System.out.println("Behälter3x6");
            int workX = xField+2;
            int workY = yField+5;
            if((activeX+1) == workX||(activeX-1) == workX)
            {
                IFX(workX,workY);
            }
            else if((activeY+1) == workY||(activeY-1) == workY)
            {
                IFY(workX,workY);
            }
            else if(a[(xField+2)] [(yField+5)] == activePlayer)
            {
                activetroop.setzePosition(192,460);
                activetroop.sichtbarMachen();
                activeX = xField+2;
                activeY = yField+5;
            }
        }
        else if(ID == 253)
        {
            // System.out.println("Behälter4x6");
            int workX = xField+3;
            int workY = yField+5;
            if((activeX+1) == workX||(activeX-1) == workX)
            {
                IFX(workX,workY);
            }
            else if((activeY+1) == workY||(activeY-1) == workY)
            {
                IFY(workX,workY);
            }
            else if(a[(xField+3)] [(yField+5)] == activePlayer)
            {
                activetroop.setzePosition(272,460);
                activetroop.sichtbarMachen();
                activeX = xField+3;
                activeY = yField+5;
            }
        }
        else if(ID == 254)
        {
            // System.out.println("Behälter5x6");
            int workX = xField+4;
            int workY = yField+5;
            if((activeX+1) == workX||(activeX-1) == workX)
            {
                IFX(workX,workY);
            }
            else if((activeY+1) == workY||(activeY-1) == workY)
            {
                IFY(workX,workY);
            }
            else if(a[(xField+4)] [(yField+5)] == activePlayer)
            {
                activetroop.setzePosition(352,460);
                activetroop.sichtbarMachen();
                activeX = xField+4;
                activeY = yField+5;
            }
        }
        else if(ID == 255)
        {
            // System.out.println("Behälter6x6");
            int workX = xField+5;
            int workY = yField+5;
            if((activeX+1) == workX||(activeX-1) == workX)
            {
                IFX(workX,workY);
            }
            else if((activeY+1) == workY||(activeY-1) == workY)
            {
                IFY(workX,workY);
            }
            else if(a[(xField+5)] [(yField+5)] == activePlayer)
            {
                activetroop.setzePosition(432,460);
                activetroop.sichtbarMachen();
                activeX = xField+5;
                activeY = yField+5;
            }
        }
        else if(ID == 256)
        {
            // System.out.println("Behälter7x6");
            int workX = xField+6;
            int workY = yField+5;
            if((activeX+1) == workX||(activeX-1) == workX)
            {
                IFX(workX,workY);
            }
            else if((activeY+1) == workY||(activeY-1) == workY)
            {
                IFY(workX,workY);
            }
            else if(a[(xField+6)] [(yField+5)] == activePlayer)
            {
                activetroop.setzePosition(512,460);
                activetroop.sichtbarMachen();
                activeX = xField+6;
                activeY = yField+5;
            }
        }
        else if(ID == 257)
        {
            // System.out.println("Behälter8x6");
            int workX = xField+7;
            int workY = yField+5;
            if((activeX+1) == workX||(activeX-1) == workX)
            {
                IFX(workX,workY);
            }
            else if((activeY+1) == workY||(activeY-1) == workY)
            {
                IFY(workX,workY);
            }
            else if(a[(xField+7)] [(yField+5)] == activePlayer)
            {
                activetroop.setzePosition(592,460);
                activetroop.sichtbarMachen();
                activeX = xField+7;
                activeY = yField+5;
            }
        }
        else if(ID == 258)
        {
            // System.out.println("Behälter9x6");
            int workX = xField+8;
            int workY = yField+5;
            if((activeX+1) == workX||(activeX-1) == workX)
            {
                IFX(workX,workY);
            }
            else if((activeY+1) == workY||(activeY-1) == workY)
            {
                IFY(workX,workY);
            }
            else if(a[(xField+8)] [(yField+5)] == activePlayer)
            {
                activetroop.setzePosition(672,460);
                activetroop.sichtbarMachen();
                activeX = xField+8;
                activeY = yField+5;
            }
        }
        else if(ID == 260) //7.Reihe
        {
            // System.out.println("Behälter1x7");
            int workX = xField;
            int workY = yField+6;
            if((activeX+1) == workX||(activeX-1) == workX)
            {
                IFX(workX,workY);
            }
            else if((activeY+1) == workY||(activeY-1) == workY)
            {
                IFY(workX,workY);
            }
            else if(a[(xField)] [(yField+6)] == activePlayer)
            {
                activetroop.setzePosition(32,540);
                activetroop.sichtbarMachen();
                activeX = xField;
                activeY = yField+6;
            }
        }
        else if(ID == 261)
        {
            // System.out.println("Behälter2x7");
            int workX = xField+1;
            int workY = yField+6;
            if((activeX+1) == workX||(activeX-1) == workX)
            {
                IFX(workX,workY);
            }
            else if((activeY+1) == workY||(activeY-1) == workY)
            {
                IFY(workX,workY);
            }
            else if(a[(xField+1)] [(yField+6)] == activePlayer)
            {
                activetroop.setzePosition(112,540);
                activetroop.sichtbarMachen();
                activeX = xField+1;
                activeY = yField+6;
            }
        }
        else if(ID == 262)
        {
            // System.out.println("Behälter3x7");
            int workX = xField+2;
            int workY = yField+6;
            if((activeX+1) == workX||(activeX-1) == workX)
            {
                IFX(workX,workY);
            }
            else if((activeY+1) == workY||(activeY-1) == workY)
            {
                IFY(workX,workY);
            }
            else if(a[(xField+2)] [(yField+6)] == activePlayer)
            {
                activetroop.setzePosition(192,540);
                activetroop.sichtbarMachen();
                activeX = xField+2;
                activeY = yField+6;
            }
        }
        else if(ID == 263)
        {
            // System.out.println("Behälter4x7");
            int workX = xField+3;
            int workY = yField+6;
            if((activeX+1) == workX||(activeX-1) == workX)
            {
                IFX(workX,workY);
            }
            else if((activeY+1) == workY||(activeY-1) == workY)
            {
                IFY(workX,workY);
            }
            else if(a[(xField+3)] [(yField+6)] == activePlayer)
            {
                activetroop.setzePosition(272,540);
                activetroop.sichtbarMachen();
                activeX = xField+3;
                activeY = yField+6;
            }
        }
        else if(ID == 264)
        {
            // System.out.println("Behälter5x7");
            int workX = xField+4;
            int workY = yField+6;
            if((activeX+1) == workX||(activeX-1) == workX)
            {
                IFX(workX,workY);
            }
            else if((activeY+1) == workY||(activeY-1) == workY)
            {
                IFY(workX,workY);
            }
            else if(a[(xField+4)] [(yField+6)] == activePlayer)
            {
                activetroop.setzePosition(352,540);
                activetroop.sichtbarMachen();
                activeX = xField+4;
                activeY = yField+6;
            }
        }
        else if(ID == 265)
        {
            // System.out.println("Behälter6x7");
            int workX = xField+5;
            int workY = yField+6;
            if((activeX+1) == workX||(activeX-1) == workX)
            {
                IFX(workX,workY);
            }
            else if((activeY+1) == workY||(activeY-1) == workY)
            {
                IFY(workX,workY);
            }
            else if(a[(xField+5)] [(yField+6)] == activePlayer)
            {
                activetroop.setzePosition(432,540);
                activetroop.sichtbarMachen();
                activeX = xField+5;
                activeY = yField+6;
            }
        }
        else if(ID == 266)
        {
            // System.out.println("Behälter7x7");
            int workX = xField+6;
            int workY = yField+6;
            if((activeX+1) == workX||(activeX-1) == workX)
            {
                IFX(workX,workY);
            }
            else if((activeY+1) == workY||(activeY-1) == workY)
            {
                IFY(workX,workY);
            }
            else if(a[(xField+6)] [(yField+6)] == activePlayer)
            {
                activetroop.setzePosition(512,540);
                activetroop.sichtbarMachen();
                activeX = xField+6;
                activeY = yField+6;
            }
        }
        else if(ID == 267)
        {
            // System.out.println("Behälter8x7");
            int workX = xField+7;
            int workY = yField+6;
            if((activeX+1) == workX||(activeX-1) == workX)
            {
                IFX(workX,workY);
            }
            else if((activeY+1) == workY||(activeY-1) == workY)
            {
                IFY(workX,workY);
            }
            else if(a[(xField+7)] [(yField+6)] == activePlayer)
            {
                activetroop.setzePosition(592,540);
                activetroop.sichtbarMachen();
                activeX = xField+7;
                activeY = yField+6;
            }
        }
        else if(ID == 268)
        {
            // System.out.println("Behälter9x7");
            int workX = xField+8;
            int workY = yField+6;
            if((activeX+1) == workX||(activeX-1) == workX)
            {
                IFX(workX,workY);
            }
            else if((activeY+1) == workY||(activeY-1) == workY)
            {
                IFY(workX,workY);
            }
            else if(a[(xField+8)] [(yField+6)] == activePlayer)
            {
                activetroop.setzePosition(672,540);
                activetroop.sichtbarMachen();
                activeX = xField+8;
                activeY = yField+6;
            }
        }
        else if(ID == 270) //8.Reihe
        {
            // System.out.println("Behälter1x8");
            int workX = xField;
            int workY = yField+7;
            if((activeX+1) == workX||(activeX-1) == workX)
            {
                IFX(workX,workY);
            }
            else if((activeY+1) == workY||(activeY-1) == workY)
            {
                IFY(workX,workY);
            }
            else if(a[(xField)] [(yField+7)] == activePlayer)
            {
                activetroop.setzePosition(32,620);
                activetroop.sichtbarMachen();
                activeX = xField;
                activeY = yField+7;
            }
        }
        else if(ID == 271)
        {
            // System.out.println("Behälter2x8");
            int workX = xField+1;
            int workY = yField+7;
            if((activeX+1) == workX||(activeX-1) == workX)
            {
                IFX(workX,workY);
            }
            else if((activeY+1) == workY||(activeY-1) == workY)
            {
                IFY(workX,workY);
            }
            else if(a[(xField+1)] [(yField+7)] == activePlayer)
            {
                activetroop.setzePosition(112,620);
                activetroop.sichtbarMachen();
                activeX = xField+1;
                activeY = yField+7;
            }
        }
        else if(ID == 272)
        {
            // System.out.println("Behälter3x8");
            int workX = xField+2;
            int workY = yField+7;
            if((activeX+1) == workX||(activeX-1) == workX)
            {
                IFX(workX,workY);
            }
            else if((activeY+1) == workY||(activeY-1) == workY)
            {
                IFY(workX,workY);
            }
            else if(a[(xField+2)] [(yField+7)] == activePlayer)
            {
                activetroop.setzePosition(192,620);
                activetroop.sichtbarMachen();
                activeX = xField+2;
                activeY = yField+7;
            }
        }
        else if(ID == 273)
        {
            // System.out.println("Behälter4x8");
            int workX = xField+3;
            int workY = yField+7;
            if((activeX+1) == workX||(activeX-1) == workX)
            {
                IFX(workX,workY);
            }
            else if((activeY+1) == workY||(activeY-1) == workY)
            {
                IFY(workX,workY);
            }
            else if(a[(xField+3)] [(yField+7)] == activePlayer)
            {
                activetroop.setzePosition(272,620);
                activetroop.sichtbarMachen();
                activeX = xField+3;
                activeY = yField+7;
            }
        }
        else if(ID == 274)
        {
            // System.out.println("Behälter5x8");
            int workX = xField+4;
            int workY = yField+7;
            if((activeX+1) == workX||(activeX-1) == workX)
            {
                IFX(workX,workY);
            }
            else if((activeY+1) == workY||(activeY-1) == workY)
            {
                IFY(workX,workY);
            }
            else if(a[(xField+4)] [(yField+7)] == activePlayer)
            {
                activetroop.setzePosition(352,620);
                activetroop.sichtbarMachen();
                activeX = xField+4;
                activeY = yField+7;
            }
        }
        else if(ID == 275)
        {
            // System.out.println("Behälter6x8");
            int workX = xField+5;
            int workY = yField+7;
            if((activeX+1) == workX||(activeX-1) == workX)
            {
                IFX(workX,workY);
            }
            else if((activeY+1) == workY||(activeY-1) == workY)
            {
                IFY(workX,workY);
            }
            else if(a[(xField+5)] [(yField+7)] == activePlayer)
            {
                activetroop.setzePosition(432,620);
                activetroop.sichtbarMachen();
                activeX = xField+5;
                activeY = yField+7;
            }
        }
        else if(ID == 276)
        {
            // System.out.println("Behälter7x8");
            int workX = xField+6;
            int workY = yField+7;
            if((activeX+1) == workX||(activeX-1) == workX)
            {
                IFX(workX,workY);
            }
            else if((activeY+1) == workY||(activeY-1) == workY)
            {
                IFY(workX,workY);
            }
            else if(a[(xField+6)] [(yField+7)] == activePlayer)
            {
                activetroop.setzePosition(512,620);
                activetroop.sichtbarMachen();
                activeX = xField+6;
                activeY = yField+7;
            }
        }
        else if(ID == 277)
        {
            // System.out.println("Behälter8x8");
            int workX = xField+7;
            int workY = yField+7;
            if((activeX+1) == workX||(activeX-1) == workX)
            {
                IFX(workX,workY);
            }
            else if((activeY+1) == workY||(activeY-1) == workY)
            {
                IFY(workX,workY);
            }
            else if(a[(xField+7)] [(yField+7)] == activePlayer)
            {
                activetroop.setzePosition(592,620);
                activetroop.sichtbarMachen();
                activeX = xField+7;
                activeY = yField+7;
            }
        }
        else if(ID == 278)
        {
            // System.out.println("Behälter9x8");
            int workX = xField+8;
            int workY = yField+7;
            if((activeX+1) == workX||(activeX-1) == workX)
            {
                IFX(workX,workY);
            }
            else if((activeY+1) == workY||(activeY-1) == workY)
            {
                IFY(workX,workY);
            }
            else if(a[(xField+8)] [(yField+7)] == activePlayer)
            {
                activetroop.setzePosition(672,620);
                activetroop.sichtbarMachen();
                activeX = xField+8;
                activeY = yField+7;
            }
        }
        else if(ID == 280) //9.Reihe
        {
            // System.out.println("Behälter1x9");
            int workX = xField;
            int workY = yField+8;
            if((activeX+1) == workX||(activeX-1) == workX)
            {
                IFX(workX,workY);
            }
            else if((activeY+1) == workY||(activeY-1) == workY)
            {
                IFY(workX,workY);
            }
            else if(a[(xField)] [(yField+8)] == activePlayer)
            {
                activetroop.setzePosition(32,700);
                activetroop.sichtbarMachen();
                activeX = xField;
                activeY = yField+8;
            }
        }
        else if(ID == 281)
        {
            // System.out.println("Behälter2x9");
            int workX = xField+1;
            int workY = yField+8;
            if((activeX+1) == workX||(activeX-1) == workX)
            {
                IFX(workX,workY);
            }
            else if((activeY+1) == workY||(activeY-1) == workY)
            {
                IFY(workX,workY);
            }
            else if(a[(xField+1)] [(yField+8)] == activePlayer)
            {
                activetroop.setzePosition(112,700);
                activetroop.sichtbarMachen();
                activeX = xField+1;
                activeY = yField+8;
            }
        }
        else if(ID == 282)
        {
            // System.out.println("Behälter3x9");
            int workX = xField+2;
            int workY = yField+8;
            if((activeX+1) == workX||(activeX-1) == workX)
            {
                IFX(workX,workY);
            }
            else if((activeY+1) == workY||(activeY-1) == workY)
            {
                IFY(workX,workY);
            }
            else if(a[(xField+2)] [(yField+8)] == activePlayer)
            {
                activetroop.setzePosition(192,700);
                activetroop.sichtbarMachen();
                activeX = xField+2;
                activeY = yField+8;
            }
        }
        else if(ID == 283)
        {
            // System.out.println("Behälter4x9");
            int workX = xField+3;
            int workY = yField+8;
            if((activeX+1) == workX||(activeX-1) == workX)
            {
                IFX(workX,workY);
            }
            else if((activeY+1) == workY||(activeY-1) == workY)
            {
                IFY(workX,workY);
            }
            else if(a[(xField+3)] [(yField+8)] == activePlayer)
            {
                activetroop.setzePosition(272,700);
                activetroop.sichtbarMachen();
                activeX = xField+3;
                activeY = yField+8;
            }
        }
        else if(ID == 284)
        {
            // System.out.println("Behälter5x9");
            int workX = xField+4;
            int workY = yField+8;
            if((activeX+1) == workX||(activeX-1) == workX)
            {
                IFX(workX,workY);
            }
            else if((activeY+1) == workY||(activeY-1) == workY)
            {
                IFY(workX,workY);
            }
            else if(a[(xField+4)] [(yField+8)] == activePlayer)
            {
                activetroop.setzePosition(352,700);
                activetroop.sichtbarMachen();
                activeX = xField+4;
                activeY = yField+8;
            }
        }
        else if(ID == 285)
        {
            // System.out.println("Behälter6x9");
            int workX = xField+5;
            int workY = yField+8;
            if((activeX+1) == workX||(activeX-1) == workX)
            {
                IFX(workX,workY);
            }
            else if((activeY+1) == workY||(activeY-1) == workY)
            {
                IFY(workX,workY);
            }
            else if(a[(xField+5)] [(yField+8)] == activePlayer)
            {
                activetroop.setzePosition(432,700);
                activetroop.sichtbarMachen();
                activeX = xField+5;
                activeY = yField+8;
            }
        }
        else if(ID == 286)
        {
            // System.out.println("Behälter7x9");
            int workX = xField+6;
            int workY = yField+8;
            if((activeX+1) == workX||(activeX-1) == workX)
            {
                IFX(workX,workY);
            }
            else if((activeY+1) == workY||(activeY-1) == workY)
            {
                IFY(workX,workY);
            }
            else if(a[(xField+6)] [(yField+8)] == activePlayer)
            {
                activetroop.setzePosition(512,700);
                activetroop.sichtbarMachen();
                activeX = xField+6;
                activeY = yField+8;
            }
        }
        else if(ID == 287)
        {
            // System.out.println("Behälter8x9");
            int workX = xField+7;
            int workY = yField+8;
            if((activeX+1) == workX||(activeX-1) == workX)
            {
                IFX(workX,workY);
            }
            else if((activeY+1) == workY||(activeY-1) == workY)
            {
                IFY(workX,workY);
            }
            else if(a[(xField+7)] [(yField+8)] == activePlayer)
            {
                activetroop.setzePosition(592,700);
                activetroop.sichtbarMachen();
                activeX = xField+7;
                activeY = yField+8;
            }
        }
        else if(ID == 288)
        {
            // System.out.println("Behälter9x9");
            int workX = xField+8;
            int workY = yField+8;
            if((activeX+1) == workX||(activeX-1) == workX)
            {
                IFX(workX,workY);
            }
            else if((activeY+1) == workY||(activeY-1) == workY)
            {
                IFY(workX,workY);
            }
            else if(a[(xField+8)] [(yField+8)] == activePlayer)
            {
                activetroop.setzePosition(672,700);
                activetroop.sichtbarMachen();
                activeX = xField+8;
                activeY = yField+8;
            }
        }
        else if(ID == 500)
        {
            updateTroops();
        }
    }

    public void tastenAktion(String rueckgabe)
    {
        if(rueckgabe.equals("Y"))
        {
            hen = 1;
        }
        else if(rueckgabe.equals("QUIT"))
        {
            tuWas(108);
        }
        else if(rueckgabe.equals("SETTINGS"))
        {
            tuWas(101);
            System.out.println(""+xField);
            System.out.println(""+yField);
        }
        else if(rueckgabe.equals("SHORTCUTS"))
        {
            tuWas(102);
        }
        else if(rueckgabe.equals("NEW GAME"))
        {
            tuWas(103);
        }
        else if(rueckgabe.equals("SAVE GAME"))
        {
            tuWas(104);
        }
        else if(rueckgabe.equals("LOAD GAME"))
        {
            tuWas(105);
        }
        else if(rueckgabe.equals("END TURN"))
        {
            if(cooldown == false)
            {
                cooldown = true;
                tuWas(138);
                StaticTools.warte(2000);
                cooldown = false;
            }
        }
        else if(rueckgabe.equals("LEFT"))
        {
            if(xField > 0)
            {
                xField--;
                map.horizontalBewegen(80);
                castles_pic.moveLEFT(1);
                mapcursor.horizontalBewegen(-4);
                for(int fy = 0;fy < 9;fy++)
                {
                    for(int fx = 0;fx < 9;fx++)
                    {
                        troops.troops[fx] [fy].unsichtbarMachen();
                    }
                }
                activetroop.unsichtbarMachen();
                activeX = -7000;
                activeY = -7000;
            }
        }
        else if(rueckgabe.equals("RIGHT"))
        {
            if(xField < 103)
            {
                xField++;
                map.horizontalBewegen(-80);
                castles_pic.moveRIGHT(1);
                mapcursor.horizontalBewegen(4);
                for(int fy = 0;fy < 9;fy++)
                {
                    for(int fx = 0;fx < 9;fx++)
                    {
                        troops.troops[fx] [fy].unsichtbarMachen();
                    }
                }
                activetroop.unsichtbarMachen();
                activeX = -7000;
                activeY = -7000;
            }
        }
        else if(rueckgabe.equals("UP"))
        {
            if(yField > 0)
            {
                yField--;
                map.vertikalBewegen(80);
                castles_pic.moveUP(1);
                mapcursor.vertikalBewegen(-4);
                for(int fy = 0;fy < 9;fy++)
                {
                    for(int fx = 0;fx < 9;fx++)
                    {
                        troops.troops[fx] [fy].unsichtbarMachen();
                    }
                }
                activetroop.unsichtbarMachen();
                activeX = -7000;
                activeY = -7000;
            }
        }
        else if(rueckgabe.equals("DOWN"))
        {
            if(yField < 147)
            {
                yField++;
                map.vertikalBewegen(-80);
                castles_pic.moveDOWN(1);
                mapcursor.vertikalBewegen(4);
                for(int fy = 0;fy < 9;fy++)
                {
                    for(int fx = 0;fx < 9;fx++)
                    {
                        troops.troops[fx] [fy].unsichtbarMachen();
                    }
                }
                activetroop.unsichtbarMachen();
                activeX = -7000;
                activeY = -7000;
            }
        }
    }

    private void DropdownClear()
    {
        Bar_QBG.unsichtbarMachen();
        Bar_Game.unsichtbarMachen();
        Bar_Order.unsichtbarMachen();
        Bar_Report.unsichtbarMachen();
        Bar_Hero.unsichtbarMachen();
        Bar_View.unsichtbarMachen();
        Bar_History.unsichtbarMachen();
        Bar_Turn.unsichtbarMachen();
        qbg_about.setzePosition(-200,-200);
        game_settings.setzePosition(-200,-200);
        game_shortcuts.setzePosition(-200,-200);
        game_new_game.setzePosition(-200,-200);
        game_save_game.setzePosition(-200,-200);
        game_load_game.setzePosition(-200,-200);
        game_save_map.setzePosition(-200,-200);
        game_load_map.setzePosition(-200,-200);
        game_quit.setzePosition(-200,-200);
        order_fight_order.setzePosition(-200,-200);
        order_move_all.setzePosition(-200,-200);
        order_disbund.setzePosition(-200,-200);
        order_signpost.setzePosition(-200,-200);
        order_resign.setzePosition(-200,-200);
        report_army.setzePosition(-200,-200);
        report_city.setzePosition(-200,-200);
        report_gold.setzePosition(-200,-200);
        report_production.setzePosition(-200,-200);
        report_winning.setzePosition(-200,-200);
        report_diplomacy.setzePosition(-200,-200);
        report_quest.setzePosition(-200,-200);
        hero_inspect.setzePosition(-200,-200);
        hero_plant_flag.setzePosition(-200,-200);
        hero_levels.setzePosition(-200,-200);
        hero_search.setzePosition(-200,-200);
        view_army_bonus.setzePosition(-200,-200);
        view_items.setzePosition(-200,-200);
        view_build.setzePosition(-200,-200);
        view_cities.setzePosition(-200,-200);
        view_production.setzePosition(-200,-200);
        view_vectoring.setzePosition(-200,-200);
        view_ruins.setzePosition(-200,-200);
        view_stack.setzePosition(-200,-200);
        history_city.setzePosition(-200,-200);
        history_events.setzePosition(-200,-200);
        history_gold.setzePosition(-200,-200);
        history_winners.setzePosition(-200,-200);
        history_triumphs.setzePosition(-200,-200);
        turn_end_turn.setzePosition(-200,-200);
    }

    public void updateCastles()
    {
        for(int cas=0;cas<80;cas++)
        {
            if(castles[cas] == 1)
            {
                castles_pic.changeCastle(cas,1);
            }
            if(castles[cas] == 2)
            {
                castles_pic.changeCastle(cas,2);
            }
            if(castles[cas] == 3)
            {
                castles_pic.changeCastle(cas,3);
            }
            if(castles[cas] == 4)
            {
                castles_pic.changeCastle(cas,4);
            }
            if(castles[cas] == 5)
            {
                castles_pic.changeCastle(cas,5);
            }
            if(castles[cas] == 6)
            {
                castles_pic.changeCastle(cas,6);
            }
            if(castles[cas] == 7)
            {
                castles_pic.changeCastle(cas,7);
            }
            if(castles[cas] == 8)
            {
                castles_pic.changeCastle(cas,8);
            }
        }
    }

    public void whichPlayerNext()
    {
        if(activePlayer == 1)
        {
            activePlayer = 2;
            marker.setzePosition(912+138,0);
            if(playerinfo.onoff[1] == 1)
            {
                jumpTo(44,117);
            }
            else
            {
                whichPlayerNext();
            }
        }
        else if(activePlayer == 2)
        {
            activePlayer = 3;
            marker.setzePosition(912+170,0);
            if(playerinfo.onoff[2] == 1)
            {
                jumpTo(38,82);
            }
            else
            {
                whichPlayerNext();
            }
        }
        else if(activePlayer == 3)
        {
            activePlayer = 4;
            marker.setzePosition(912+202,0);
            if(playerinfo.onoff[3] == 1)
            {
                jumpTo(10,133);
            }
            else
            {
                whichPlayerNext();
            }
        }
        else if(activePlayer == 4)
        {
            activePlayer = 5;
            marker.setzePosition(912+234,0);
            if(playerinfo.onoff[4] == 1)
            {
                jumpTo(99,61);
            }
            else
            {
                whichPlayerNext();
            }
        }
        else if(activePlayer == 5)
        {
            activePlayer = 6;
            marker.setzePosition(912+266,0);
            if(playerinfo.onoff[5] == 1)
            {
                jumpTo(37,44);
            }
            else
            {
                whichPlayerNext();
            }
        }
        else if(activePlayer == 6)
        {
            activePlayer = 7;
            marker.setzePosition(912+298,0);
            if(playerinfo.onoff[6] == 1)
            {
                jumpTo(81,66);
            }
            else
            {
                whichPlayerNext();
            }
        }
        else if(activePlayer == 7)
        {
            activePlayer = 8;
            marker.setzePosition(912+330,0);
            if(playerinfo.onoff[7] == 1)
            {
                jumpTo(14,16);
            }
            else
            {
                whichPlayerNext();
            }
        }
        else if(activePlayer == 8)
        {
            activePlayer = 1;
            round++;
            Display_Turn.setzeAusgabetext(""+round);
            marker.setzePosition(912+106,0);
            if(playerinfo.onoff[0] == 1)
            {
                jumpTo(82,4);
            }
            else
            {
                whichPlayerNext();
            }
            for(int i = 0;i < 80;i++)
            {
                if(castles[i]>0)
                {
                    if(a[castles_pic.xcoordinate[i]][castles_pic.ycoordinate[i]] == 0)
                    {
                        a[castles_pic.xcoordinate[i]][castles_pic.ycoordinate[i]] = castles[i];
                    }
                    else if(b[castles_pic.xcoordinate[i]][castles_pic.ycoordinate[i]] == 0)
                    {
                        b[castles_pic.xcoordinate[i]][castles_pic.ycoordinate[i]] = castles[i];
                    }
                    else if(c[castles_pic.xcoordinate[i]][castles_pic.ycoordinate[i]] == 0)
                    {
                        c[castles_pic.xcoordinate[i]][castles_pic.ycoordinate[i]] = castles[i];
                    }
                    else if(d[castles_pic.xcoordinate[i]][castles_pic.ycoordinate[i]] == 0)
                    {
                        d[castles_pic.xcoordinate[i]][castles_pic.ycoordinate[i]] = castles[i];
                    }
                    else if(e[castles_pic.xcoordinate[i]][castles_pic.ycoordinate[i]] == 0)
                    {
                        e[castles_pic.xcoordinate[i]][castles_pic.ycoordinate[i]] = castles[i];
                    }
                    else if(f[castles_pic.xcoordinate[i]][castles_pic.ycoordinate[i]] == 0)
                    {
                        f[castles_pic.xcoordinate[i]][castles_pic.ycoordinate[i]] = castles[i];
                    }
                    else if(g[castles_pic.xcoordinate[i]][castles_pic.ycoordinate[i]] == 0)
                    {
                        g[castles_pic.xcoordinate[i]][castles_pic.ycoordinate[i]] = castles[i];
                    }
                    else if(h[castles_pic.xcoordinate[i]][castles_pic.ycoordinate[i]] == 0)
                    {
                        h[castles_pic.xcoordinate[i]][castles_pic.ycoordinate[i]] = castles[i];
                    }
                }
            }
        }
        zuege = 50;
    }

    public void updateTroops()
    {
        for(int fy = 0;fy < 9;fy++)
        {
            for(int fx = 0;fx < 9;fx++)
            {
                if(a[xField+fx] [yField+fy] >= 1)
                {
                    troops.troops[fx] [fy].sichtbarMachen();
                    if(a[xField+fx] [yField+fy] == 1)
                    {
                        troops.troops[fx] [fy].wechsleBild("graphics/Troops/Soldier_white.png");
                    }
                    else if(a[xField+fx] [yField+fy] == 2)
                    {
                        troops.troops[fx] [fy].wechsleBild("graphics/Troops/Soldier_yellow.png");
                    }
                    else if(a[xField+fx] [yField+fy] == 3)
                    {
                        troops.troops[fx] [fy].wechsleBild("graphics/Troops/Soldier_orange.png");
                    }
                    else if(a[xField+fx] [yField+fy] == 4)
                    {
                        troops.troops[fx] [fy].wechsleBild("graphics/Troops/Soldier_red.png");
                    }
                    else if(a[xField+fx] [yField+fy] == 5)
                    {
                        troops.troops[fx] [fy].wechsleBild("graphics/Troops/Soldier_green.png");
                    }
                    else if(a[xField+fx] [yField+fy] == 6)
                    {
                        troops.troops[fx] [fy].wechsleBild("graphics/Troops/Soldier_blue.png");
                    }
                    else if(a[xField+fx] [yField+fy] == 7)
                    {
                        troops.troops[fx] [fy].wechsleBild("graphics/Troops/Soldier_lightblue.png");
                    }
                    else if(a[xField+fx] [yField+fy] == 8)
                    {
                        troops.troops[fx] [fy].wechsleBild("graphics/Troops/Soldier_black.png");
                    }
                }
            }
        }
    }

    public int getCastle(int gCx, int gCy)
    {
        int gCr = 5000;
        for(int i=0;i<80;i++)
        {
            if(castles_pic.xcoordinate[i] == gCx && castles_pic.ycoordinate[i] == gCy)
            {
                gCr = i;
            }
        }
        return gCr;
    }

    public int getTroopcount(int gTx, int gTy)
    {
        int gTr = 0;
        if(a[gTx][gTy] > 0)
        {
            gTr++;
        }
        else if(b[gTx][gTy] > 0)
        {
            gTr++;
        }
        else if(c[gTx][gTy] > 0)
        {
            gTr++;
        }
        else if(d[gTx][gTy] > 0)
        {
            gTr++;
        }
        else if(e[gTx][gTy] > 0)
        {
            gTr++;
        }
        else if(f[gTx][gTy] > 0)
        {
            gTr++;
        }
        else if(g[gTx][gTy] > 0)
        {
            gTr++;
        }
        else if(h[gTx][gTy] > 0)
        {
            gTr++;
        }
        return gTr;
    }
    public void IFX(int workX,int workY)
    {
        if(getCastle(workX,workY)== 5000)
                {
                    a[workX][workY] = a[activeX][activeY];
                    b[workX][workY] = b[activeX][activeY];
                    c[workX][workY] = c[activeX][activeY];
                    d[workX][workY] = d[activeX][activeY];
                    e[workX][workY] = e[activeX][activeY];
                    f[workX][workY] = f[activeX][activeY];
                    g[workX][workY] = g[activeX][activeY];
                    h[workX][workY] = h[activeX][activeY];
                    troops.troops[activeX-xField][activeY-yField].unsichtbarMachen();
                    a[activeX][activeY] = 0;
                    b[activeX][activeY] = 0;
                    c[activeX][activeY] = 0;
                    d[activeX][activeY] = 0;
                    e[activeX][activeY] = 0;
                    f[activeX][activeY] = 0;
                    g[activeX][activeY] = 0;
                    h[activeX][activeY] = 0;
                }
                else if(castles[getCastle(workX,workY)] <= 8 && !(castles[getCastle(workX,workY)] == activePlayer))
                {
                    if((getTroopcount(workX,workY)+getTroopcount(workX+1,workY)+getTroopcount(workX,workY+1)+getTroopcount(workX+1,workY+1)) >= (getTroopcount(activeX,activeY)))
                    {
                        a[activeX][activeY] = 0;
                        b[activeX][activeY] = 0;
                        c[activeX][activeY] = 0;
                        d[activeX][activeY] = 0;
                        e[activeX][activeY] = 0;
                        f[activeX][activeY] = 0;
                        g[activeX][activeY] = 0;
                        h[activeX][activeY] = 0;
                        activetroop.unsichtbarMachen();
                    }
                    else if((getTroopcount(workX,workY)+getTroopcount(workX+1,workY)+getTroopcount(workX,workY+1)+getTroopcount(workX+1,workY+1)) < (getTroopcount(activeX,activeY)))
                    {
                        a[workX][workY] = a[activeX][activeY];
                        b[workX][workY] = b[activeX][activeY];
                        c[workX][workY] = c[activeX][activeY];
                        d[workX][workY] = d[activeX][activeY];
                        e[workX][workY] = e[activeX][activeY];
                        f[workX][workY] = f[activeX][activeY];
                        g[workX][workY] = g[activeX][activeY];
                        h[workX][workY] = h[activeX][activeY];
                        a[workX+1][workY] = 0;
                        b[workX+1][workY] = 0;
                        c[workX+1][workY] = 0;
                        d[workX+1][workY] = 0;
                        e[workX+1][workY] = 0;
                        f[workX+1][workY] = 0;
                        g[workX+1][workY] = 0;
                        h[workX+1][workY] = 0;
                        a[workX][workY+1] = 0;
                        b[workX][workY+1] = 0;
                        c[workX][workY+1] = 0;
                        d[workX][workY+1] = 0;
                        e[workX][workY+1] = 0;
                        f[workX][workY+1] = 0;
                        g[workX][workY+1] = 0;
                        h[workX][workY+1] = 0;
                        a[workX+1][workY+1] = 0;
                        b[workX+1][workY+1] = 0;
                        c[workX+1][workY+1] = 0;
                        d[workX+1][workY+1] = 0;
                        e[workX+1][workY+1] = 0;
                        f[workX+1][workY+1] = 0;
                        g[workX+1][workY+1] = 0;
                        h[workX+1][workY+1] = 0;
                        troops.troops[activeX][activeY].unsichtbarMachen();
                        a[activeX][activeY] = 0;
                        b[activeX][activeY] = 0;
                        c[activeX][activeY] = 0;
                        d[activeX][activeY] = 0;
                        e[activeX][activeY] = 0;
                        f[activeX][activeY] = 0;
                        g[activeX][activeY] = 0;
                        h[activeX][activeY] = 0;
                    }
                }
                else
                {
                    a[workX][workY] = a[activeX][activeY];
                    b[workX][workY] = b[activeX][activeY];
                    c[workX][workY] = c[activeX][activeY];
                    d[workX][workY] = d[activeX][activeY];
                    e[workX][workY] = e[activeX][activeY];
                    f[workX][workY] = f[activeX][activeY];
                    g[workX][workY] = g[activeX][activeY];
                    h[workX][workY] = h[activeX][activeY];
                    troops.troops[activeX-xField][activeY-yField].unsichtbarMachen();
                    a[activeX][activeY] = 0;
                    b[activeX][activeY] = 0;
                    c[activeX][activeY] = 0;
                    d[activeX][activeY] = 0;
                    e[activeX][activeY] = 0;
                    f[activeX][activeY] = 0;
                    g[activeX][activeY] = 0;
                    h[activeX][activeY] = 0;
                }
                activeX = workX;
                activeY = workY;
                activetroop.setzePosition((workX - xField)*80+32, (workY - yField)*80+60);
    }
    public void IFY(int workX,int workY)
    {
        if(getCastle(workX,workY)== 5000)
                {
                    a[workX][workY] = a[activeX][activeY];
                    b[workX][workY] = b[activeX][activeY];
                    c[workX][workY] = c[activeX][activeY];
                    d[workX][workY] = d[activeX][activeY];
                    e[workX][workY] = e[activeX][activeY];
                    f[workX][workY] = f[activeX][activeY];
                    g[workX][workY] = g[activeX][activeY];
                    h[workX][workY] = h[activeX][activeY];
                    troops.troops[activeX-xField][activeY-yField].unsichtbarMachen();
                    a[activeX][activeY] = 0;
                    b[activeX][activeY] = 0;
                    c[activeX][activeY] = 0;
                    d[activeX][activeY] = 0;
                    e[activeX][activeY] = 0;
                    f[activeX][activeY] = 0;
                    g[activeX][activeY] = 0;
                    h[activeX][activeY] = 0;
                }
                else if(castles[getCastle(workX,workY)] <= 8 && !(castles[getCastle(workX,workY)] == activePlayer))
                {
                    System.out.println("IF");
                    if((getTroopcount(workX,workY)+getTroopcount(workX+1,workY)+getTroopcount(workX,workY+1)+getTroopcount(workX+1,workY+1)) >= (getTroopcount(activeX,activeY)))
                    {
                        a[activeX][activeY] = 0;
                        b[activeX][activeY] = 0;
                        c[activeX][activeY] = 0;
                        d[activeX][activeY] = 0;
                        e[activeX][activeY] = 0;
                        f[activeX][activeY] = 0;
                        g[activeX][activeY] = 0;
                        h[activeX][activeY] = 0;
                    }
                    else if((getTroopcount(workX,workY)+getTroopcount(workX+1,workY)+getTroopcount(workX,workY+1)+getTroopcount(workX+1,workY+1)) < (getTroopcount(activeX,activeY)))
                    {
                        a[workX][workY] = a[activeX][activeY];
                        b[workX][workY] = b[activeX][activeY];
                        c[workX][workY] = c[activeX][activeY];
                        d[workX][workY] = d[activeX][activeY];
                        e[workX][workY] = e[activeX][activeY];
                        f[workX][workY] = f[activeX][activeY];
                        g[workX][workY] = g[activeX][activeY];
                        h[workX][workY] = h[activeX][activeY];
                        a[workX+1][workY] = 0;
                        b[workX+1][workY] = 0;
                        c[workX+1][workY] = 0;
                        d[workX+1][workY] = 0;
                        e[workX+1][workY] = 0;
                        f[workX+1][workY] = 0;
                        g[workX+1][workY] = 0;
                        h[workX+1][workY] = 0;
                        a[workX][workY+1] = 0;
                        b[workX][workY+1] = 0;
                        c[workX][workY+1] = 0;
                        d[workX][workY+1] = 0;
                        e[workX][workY+1] = 0;
                        f[workX][workY+1] = 0;
                        g[workX][workY+1] = 0;
                        h[workX][workY+1] = 0;
                        a[workX+1][workY+1] = 0;
                        b[workX+1][workY+1] = 0;
                        c[workX+1][workY+1] = 0;
                        d[workX+1][workY+1] = 0;
                        e[workX+1][workY+1] = 0;
                        f[workX+1][workY+1] = 0;
                        g[workX+1][workY+1] = 0;
                        h[workX+1][workY+1] = 0;
                        troops.troops[activeX][activeY].unsichtbarMachen();
                        a[activeX][activeY] = 0;
                        b[activeX][activeY] = 0;
                        c[activeX][activeY] = 0;
                        d[activeX][activeY] = 0;
                        e[activeX][activeY] = 0;
                        f[activeX][activeY] = 0;
                        g[activeX][activeY] = 0;
                        h[activeX][activeY] = 0;
                    }
                }
                activeX = workX;
                activeY = workY;
                activetroop.setzePosition((workX - xField)*80+32, (workY - yField)*80+60);
    }
}
