class Complex
{
	private:
		int real;
		int img;
		static int count;

	public:
		Complex();
		Complex(int real, int img);
		
		static int counter();
		void Accept(int, int);
		void Display();
};
