package zaur.chak.lesson4.My;

public class MyWork {
	Integer id;
	String name;
	String surname;
	Integer year;
	Double matematik;
	Double ekonomik;
	Double language;

	public MyWork(Integer id, String name, String surname, Integer year, Double matematik, Double ekonomik, Double language) {
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.year = year;
		this.matematik = matematik;
		this.ekonomik = ekonomik;
		this.language = language;
	}

	public MyWork(Integer id, String name, Double language) {
		this.id = id;
		this.name = name;
		this.language = language;
	}

	public MyWork() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public Double getMatematik() {
		return matematik;
	}

	public void setMatematik(Double matematik) {
		this.matematik = matematik;
	}

	public Double getEkonomik() {
		return ekonomik;
	}

	public void setEkonomik(Double ekonomik) {
		this.ekonomik = ekonomik;
	}

	public Double getLanguage() {
		return language;
	}

	public void setLanguage(Double language) {
		this.language = language;
	}
}
