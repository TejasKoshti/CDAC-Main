using System;
using System.Collections.Generic;

namespace Rishi.Models;

public partial class Book
{
    public int BookId { get; set; }

    public string Bname { get; set; } = null!;

    public string? Author { get; set; }

    public string? Category { get; set; }

    public decimal? Price { get; set; }

    public int UserId { get; set; }

    public virtual User User { get; set; } = null!;
}
