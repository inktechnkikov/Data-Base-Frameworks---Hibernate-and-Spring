using Microsoft.Owin;
using Owin;

[assembly: OwinStartupAttribute(typeof(WebApplExample.Startup))]
namespace WebApplExample
{
    public partial class Startup
    {
        public void Configuration(IAppBuilder app)
        {
            ConfigureAuth(app);
        }
    }
}
