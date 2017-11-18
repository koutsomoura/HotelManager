/*
  This file is part of HotelManager.

    HotelManager is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    HotelManager is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with HotelManager.  If not, see <http://www.gnu.org/licenses/>.



    Copyright 2017 Angelis Zotis
 */
package hotelmanager;

class Hrooms{
    
    boolean rent;
    boolean forclean;
    
    String problems;

    private int roomnum;
    private int beds;

    
    // Setter and Getter 
    
    
    public boolean isRent() {
        return rent;
    }

    public void setRent(boolean rent) {
        this.rent = rent;
    }

    public boolean isForclean() {
        return forclean;
    }

    public void setForclean(boolean forclean) {
        this.forclean = forclean;
    }

    public String getProblems() {
        return problems;
    }

    public void setProblems(String problems) {
        this.problems = problems;
    }

    public int getRoomnum() {
        return roomnum;
    }

    public void setRoomnum(int roomnum) {
        this.roomnum = roomnum;
    }

    public int getBeds() {
        return beds;
    }

    public void setBeds(int beds) {
        this.beds = beds;
    }

    
    
    
    
}
