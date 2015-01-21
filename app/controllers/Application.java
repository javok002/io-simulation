package controllers;

import com.fasterxml.jackson.databind.node.ObjectNode;
import play.*;
import play.api.libs.json.Json;
import play.mvc.*;

import scala.util.parsing.combinator.Parsers;
import scala.util.parsing.json.JSON;
import scala.util.parsing.json.JSONObject;
import views.html.*;

import static play.libs.Json.*;

public class Application extends Controller {

    public static Result index() {
        return ok(index.render("Your new application is ready."));
    }

    public static Result sim() {
        final ObjectNode object = newObject();
        object.put("status", "ok");
        return ok(object);
    }
}
