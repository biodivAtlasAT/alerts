class UrlMappings {

	static mappings = {

	"/admin"(controller:'admin', action: 'index')
    "/admin/user/$userId"(controller:'admin', action: 'showUsersAlerts')
    "/admin/user/debug/$userId"(controller:'admin', action: 'debugAlertsForUser')
    "/admin/debug/all"(controller:'admin', action: 'debugAllAlerts')

		"/$controller/$action?/$id?"{
			constraints {
				// apply constraints here
			}
		}

	"/ws/alerts/user/$userId"(controller:'notification', action: 'getUserAlerts')
    "/ws/$action"(controller:'webservice')
    "/ws/noauth/$action"(controller:'webservice')
		"/"(controller:'notification', action:'index')
		"500"(view:'/error')
	}
}
