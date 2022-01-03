package src.main

enum class Tile (val value:Int){
    INVALID(-1),

    EAST(1),
    SOUTH(2),
    WEST(3),
    NORTH(4),

    RED(7),
    GREEN(8),
    WHITE(9),

    DOT_1(11),
    DOT_2(12),
    DOT_3(13),
    DOT_4(14),
    DOT_5(15),
    DOT_6(16),
    DOT_7(17),
    DOT_8(18),
    DOT_9(19),

    BAMBOO_1(21),
    BAMBOO_2(22),
    BAMBOO_3(23),
    BAMBOO_4(24),
    BAMBOO_5(25),
    BAMBOO_6(26),
    BAMBOO_7(27),
    BAMBOO_8(28),
    BAMBOO_9(29),

    CHARACTER_1(31),
    CHARACTER_2(32),
    CHARACTER_3(33),
    CHARACTER_4(34),
    CHARACTER_5(35),
    CHARACTER_6(36),
    CHARACTER_7(37),
    CHARACTER_8(38),
}