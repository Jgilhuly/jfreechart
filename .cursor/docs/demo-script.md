# JFreeChart Demo Script

## Java OSS Repo Modernization Demonstration

**Dependencies Upgrade (Java 11 to 21)**
- "Upgrade this project from Java 11 to Java 21. Update pom.xml, identify any deprecated APIs that need refactoring, and create a migration plan."

**Understanding and Planning Refactoring for New Developers**
- "I'm new to this codebase. Explain the architecture of JFreeChart, identify the main entry points, and create a refactoring plan for improving the chart rendering pipeline."

**Industry-Specific Context**
- "Explain the charting terminology used in this codebase (e.g., renderer, plot, axis, dataset) and how it relates to financial charting concepts like OHLC bars and candlestick charts."

**Test Case Creation from Scratch**
- "Analyze the ChartFactory class and create comprehensive unit tests covering all chart creation methods. Include edge cases and null handling."

**Technical Debt Identification and Remediation**
- "Scan the codebase for technical debt: find deprecated methods, code duplication, missing null checks, and classes that violate single responsibility principle. Prioritize fixes."

**Troubleshooting and Issue Resolution within IDE**
- "The build is failing with compilation errors. Analyze the errors, identify root causes, and fix them. Explain what changed and why."

**Performance Optimization Guidance**
- "Identify performance bottlenecks in chart rendering. Analyze memory usage patterns and suggest optimizations for large datasets."

## JIRA Tech Debt Planning Workflow

**Analyze Existing Tickets Labeled as Tech Debt**
- "Connect to JIRA and analyze all tickets labeled 'tech-debt'. Summarize patterns, categorize by type, and identify dependencies between tickets."

**Identify Missing Technical Debt Through Code Analysis**
- "Perform static analysis to find technical debt not yet tracked in JIRA. Create a prioritized list of issues with severity ratings and estimated effort."

**Incorporate Tribal Knowledge into Planning**
- "Review commit history and pull requests to identify recurring issues mentioned in comments. Add context to existing tech debt tickets based on this historical knowledge."

Widespread Unsafe Type Casting with @SuppressWarnings("unchecked")

**Create Augmented Tickets with Prioritization**
- "Create JIRA tickets for the top 10 technical debt items found. Include code references, impact analysis, suggested solutions, and priority based on risk and effort."
