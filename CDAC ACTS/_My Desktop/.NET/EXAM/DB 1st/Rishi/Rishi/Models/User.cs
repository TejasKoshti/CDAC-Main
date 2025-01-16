using System;
using System.Collections.Generic;

namespace Rishi.Models;

public partial class User
{
    public int UserId { get; set; }

    public string? Email { get; set; }

    public string? MobileNo { get; set; }

    public string? Password { get; set; }

    public string? Role { get; set; }

    public virtual ICollection<Book>? Books { get; set; } = new List<Book>();
}
