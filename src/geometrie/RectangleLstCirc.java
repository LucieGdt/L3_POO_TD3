/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geometrie;

/**
 *
 * @author Nicol
 */
public class RectangleLstCirc extends PolygoneLstCirc {
    /**
     * Constructeur prenant deux points en paramètre (point supérieur gauche et
     * point inférieur droit )
     *
     * @param sg Point supérieur gauche du rectangle
     * @param id Point inférieur droit du rectangle
     */
    public RectangleLstCirc(Point sg, Point id) {
        super(sg, new Point(id.getX(), sg.getY()), id, new Point(sg.getX(), id.getY()));
    }

    /**
     * Constructeur prenant quatre points en paramètre
     *
     * @param a Point
     * @param b Point
     * @param c Point
     * @param d Point
     */
    public RectangleLstCirc(Point a, Point b, Point c, Point d) {
        super(a, b, c, d);
    }

    /**
     * Calcule la surface d'un rectangle
     *
     * @return la surface du rectangle
     *
    @Override
    public double surface() {
        return ((this.getSommets()[0].distance(this.getSommets()[1]))
                * (this.getSommets()[0].distance(this.getSommets()[3])));
    }
*/
    /**
     * Affiche les informations d'un rectangle
     *
     * @return les informations du rectangle
     */
    @Override
    public String toString() {
          //new string builder
        StringBuilder sb = new StringBuilder();
        // etendre buff avec le message qui suit :
        sb.append("Rectangle à plat : ");
        sb.append(this.texteSommets());
        // Renvoie de la chaîne :
        return sb.toString();  
        //return "Rectangle à plat :\n" + this.texteSommets();
    }

}