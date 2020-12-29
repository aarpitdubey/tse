public XMLParserSAX
{
	public static void main(String[] args) 
	{
		SAXParserFactory saxParserFactory=SAXParserFactory.newInstance();
		try
		{
			SAXParser saxParser=saxParserFactory.newSaxParser();
			MyHandler handler=new MyHandler();
			saxParser parse(new File("/Employees.xml"), handler);

			List<Employees> empList=handler.getEmpList();

			for (Employee emp : empList ) {
				System.out.println(emp);
			}
		}
		catch(ParserConfigurationException | SAXException)
		{

		}
	}
}