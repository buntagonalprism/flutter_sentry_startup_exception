package com.example.flutter_sentry_startup_exception

import io.flutter.embedding.android.FlutterActivity
import io.flutter.embedding.engine.FlutterEngine
import kotlin.random.Random

class MainActivity: FlutterActivity() {
  override fun configureFlutterEngine(flutterEngine: FlutterEngine) {
    super.configureFlutterEngine(flutterEngine)
    if (Random.nextDouble() < 0.5) {
      throw Exception("Test Startup Exception")
    }
  }
}
