package Prac14.P50;

/*
 *                                          city
 *
 *        dungeon           forest        safezone       mountain
 *
 *                                          home
 */

public enum Places {
    /**
     * N -> none
     * E -> safezone
     * S -> none
     * W -> dungeon
     */
    FOREST,
    /**
     * starting point
     * N -> city
     * E -> mountain
     * S -> home
     * W -> forest
     */
    SAFEZONE,
    /**
     * N -> none
     * E -> none
     * S -> none
     * W -> safezone
     */
    MOUNTAIN,
    /**
     * N -> none
     * E -> none
     * S -> safezone
     * W -> none
     *
     */
    CITY,
    /**
     * N -> safezone
     * E -> none
     * S -> none
     * W -> none
     */
    HOME,
    /**
     * N -> none
     * E -> forest
     * S -> none
     * W -> none
     */
    DUNGEON
}
