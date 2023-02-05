class Magazine extends Publication {

    private String company;
    private String typeOfMagazine;

    public Magazine(String title, String author, int yearPublished, String company, String typeOfMagazine){
        super(title, author, yearPublished);
        this.company = company;
        this.typeOfMagazine = typeOfMagazine;
    }


       public String getCompany(){
        return company;
    }
        public void setCompany(String newCompany){
            company = newCompany;
        }

        public String getTypeOfMagazine(){
            return typeOfMagazine;
        }

        public void setTopic(String newTypeOfMagazine){
            typeOfMagazine = newTypeOfMagazine;
        }

        public String toString(){
            return super.toString()+" Company: "+company+"\n"+" topic: "+typeOfMagazine+"\n";
        }

}
