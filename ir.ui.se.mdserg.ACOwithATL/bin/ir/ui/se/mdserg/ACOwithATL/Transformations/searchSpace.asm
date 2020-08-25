<?xml version = '1.0' encoding = 'ISO-8859-1' ?>
<asm version="1.0" name="0">
	<cp>
		<constant value="searchSpace"/>
		<constant value="links"/>
		<constant value="NTransientLinkSet;"/>
		<constant value="col"/>
		<constant value="J"/>
		<constant value="id"/>
		<constant value="main"/>
		<constant value="A"/>
		<constant value="OclParametrizedType"/>
		<constant value="#native"/>
		<constant value="Collection"/>
		<constant value="J.setName(S):V"/>
		<constant value="OclSimpleType"/>
		<constant value="OclAny"/>
		<constant value="J.setElementType(J):V"/>
		<constant value="0"/>
		<constant value="TransientLinkSet"/>
		<constant value="A.__matcher__():V"/>
		<constant value="A.__exec__():V"/>
		<constant value="6:29-6:30"/>
		<constant value="self"/>
		<constant value="__resolve__"/>
		<constant value="1"/>
		<constant value="J.oclIsKindOf(J):B"/>
		<constant value="18"/>
		<constant value="NTransientLinkSet;.getLinkBySourceElement(S):QNTransientLink;"/>
		<constant value="J.oclIsUndefined():B"/>
		<constant value="15"/>
		<constant value="NTransientLink;.getTargetFromSource(J):J"/>
		<constant value="17"/>
		<constant value="30"/>
		<constant value="Sequence"/>
		<constant value="2"/>
		<constant value="A.__resolve__(J):J"/>
		<constant value="QJ.including(J):QJ"/>
		<constant value="QJ.flatten():QJ"/>
		<constant value="e"/>
		<constant value="value"/>
		<constant value="resolveTemp"/>
		<constant value="S"/>
		<constant value="NTransientLink;.getNamedTargetFromSource(JS):J"/>
		<constant value="name"/>
		<constant value="__matcher__"/>
		<constant value="A.__matchatt2att():V"/>
		<constant value="A.__matchmethod2method():V"/>
		<constant value="__exec__"/>
		<constant value="att2att"/>
		<constant value="NTransientLinkSet;.getLinksByRule(S):QNTransientLink;"/>
		<constant value="A.__applyatt2att(NTransientLink;):V"/>
		<constant value="method2method"/>
		<constant value="A.__applymethod2method(NTransientLink;):V"/>
		<constant value="__matchatt2att"/>
		<constant value="Attribute"/>
		<constant value="architectureCRA"/>
		<constant value="IN"/>
		<constant value="MMOF!Classifier;.allInstancesFrom(S):QJ"/>
		<constant value="Class"/>
		<constant value="TransientLink"/>
		<constant value="NTransientLink;.setRule(MATL!Rule;):V"/>
		<constant value="ft"/>
		<constant value="NTransientLink;.addSourceElement(SJ):V"/>
		<constant value="class"/>
		<constant value="State"/>
		<constant value="pathCRA"/>
		<constant value="NTransientLink;.addTargetElement(SJ):V"/>
		<constant value="NTransientLinkSet;.addLink2(NTransientLink;B):V"/>
		<constant value="12:3-15:4"/>
		<constant value="__applyatt2att"/>
		<constant value="NTransientLink;"/>
		<constant value="NTransientLink;.getSourceElement(S):J"/>
		<constant value="3"/>
		<constant value="NTransientLink;.getTargetElement(S):J"/>
		<constant value="4"/>
		<constant value="classname"/>
		<constant value="J.+(J):J"/>
		<constant value="13:12-13:14"/>
		<constant value="13:12-13:19"/>
		<constant value="13:4-13:19"/>
		<constant value="14:17-14:22"/>
		<constant value="14:17-14:27"/>
		<constant value="14:4-14:27"/>
		<constant value="18:4-18:14"/>
		<constant value="18:21-18:31"/>
		<constant value="18:21-18:34"/>
		<constant value="18:37-18:38"/>
		<constant value="18:21-18:38"/>
		<constant value="18:4-18:39"/>
		<constant value="19:4-19:9"/>
		<constant value="19:16-19:26"/>
		<constant value="19:16-19:29"/>
		<constant value="19:4-19:30"/>
		<constant value="17:2-20:3"/>
		<constant value="link"/>
		<constant value="__matchmethod2method"/>
		<constant value="Method"/>
		<constant value="cm"/>
		<constant value="27:3-32:4"/>
		<constant value="__applymethod2method"/>
		<constant value="28:12-28:14"/>
		<constant value="28:12-28:19"/>
		<constant value="28:4-28:19"/>
		<constant value="29:17-29:22"/>
		<constant value="29:17-29:27"/>
		<constant value="29:4-29:27"/>
		<constant value="34:4-34:14"/>
		<constant value="34:21-34:31"/>
		<constant value="34:21-34:34"/>
		<constant value="34:37-34:38"/>
		<constant value="34:21-34:38"/>
		<constant value="34:4-34:39"/>
		<constant value="35:4-35:9"/>
		<constant value="35:16-35:26"/>
		<constant value="35:16-35:29"/>
		<constant value="35:4-35:30"/>
		<constant value="33:2-36:3"/>
	</cp>
	<field name="1" type="2"/>
	<field name="3" type="4"/>
	<field name="5" type="4"/>
	<operation name="6">
		<context type="7"/>
		<parameters>
		</parameters>
		<code>
			<getasm/>
			<push arg="8"/>
			<push arg="9"/>
			<new/>
			<dup/>
			<push arg="10"/>
			<pcall arg="11"/>
			<dup/>
			<push arg="12"/>
			<push arg="9"/>
			<new/>
			<dup/>
			<push arg="13"/>
			<pcall arg="11"/>
			<pcall arg="14"/>
			<set arg="3"/>
			<getasm/>
			<pushi arg="15"/>
			<set arg="5"/>
			<getasm/>
			<push arg="16"/>
			<push arg="9"/>
			<new/>
			<set arg="1"/>
			<getasm/>
			<pcall arg="17"/>
			<getasm/>
			<pcall arg="18"/>
		</code>
		<linenumbertable>
			<lne id="19" begin="17" end="17"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="0" name="20" begin="0" end="27"/>
		</localvariabletable>
	</operation>
	<operation name="21">
		<context type="7"/>
		<parameters>
			<parameter name="22" type="4"/>
		</parameters>
		<code>
			<load arg="22"/>
			<getasm/>
			<get arg="3"/>
			<call arg="23"/>
			<if arg="24"/>
			<getasm/>
			<get arg="1"/>
			<load arg="22"/>
			<call arg="25"/>
			<dup/>
			<call arg="26"/>
			<if arg="27"/>
			<load arg="22"/>
			<call arg="28"/>
			<goto arg="29"/>
			<pop/>
			<load arg="22"/>
			<goto arg="30"/>
			<push arg="31"/>
			<push arg="9"/>
			<new/>
			<load arg="22"/>
			<iterate/>
			<store arg="32"/>
			<getasm/>
			<load arg="32"/>
			<call arg="33"/>
			<call arg="34"/>
			<enditerate/>
			<call arg="35"/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="2" name="36" begin="23" end="27"/>
			<lve slot="0" name="20" begin="0" end="29"/>
			<lve slot="1" name="37" begin="0" end="29"/>
		</localvariabletable>
	</operation>
	<operation name="38">
		<context type="7"/>
		<parameters>
			<parameter name="22" type="4"/>
			<parameter name="32" type="39"/>
		</parameters>
		<code>
			<getasm/>
			<get arg="1"/>
			<load arg="22"/>
			<call arg="25"/>
			<load arg="22"/>
			<load arg="32"/>
			<call arg="40"/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="0" name="20" begin="0" end="6"/>
			<lve slot="1" name="37" begin="0" end="6"/>
			<lve slot="2" name="41" begin="0" end="6"/>
		</localvariabletable>
	</operation>
	<operation name="42">
		<context type="7"/>
		<parameters>
		</parameters>
		<code>
			<getasm/>
			<pcall arg="43"/>
			<getasm/>
			<pcall arg="44"/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="0" name="20" begin="0" end="3"/>
		</localvariabletable>
	</operation>
	<operation name="45">
		<context type="7"/>
		<parameters>
		</parameters>
		<code>
			<getasm/>
			<get arg="1"/>
			<push arg="46"/>
			<call arg="47"/>
			<iterate/>
			<store arg="22"/>
			<getasm/>
			<load arg="22"/>
			<pcall arg="48"/>
			<enditerate/>
			<getasm/>
			<get arg="1"/>
			<push arg="49"/>
			<call arg="47"/>
			<iterate/>
			<store arg="22"/>
			<getasm/>
			<load arg="22"/>
			<pcall arg="50"/>
			<enditerate/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="1" name="36" begin="5" end="8"/>
			<lve slot="1" name="36" begin="15" end="18"/>
			<lve slot="0" name="20" begin="0" end="19"/>
		</localvariabletable>
	</operation>
	<operation name="51">
		<context type="7"/>
		<parameters>
		</parameters>
		<code>
			<push arg="52"/>
			<push arg="53"/>
			<findme/>
			<push arg="54"/>
			<call arg="55"/>
			<iterate/>
			<store arg="22"/>
			<push arg="56"/>
			<push arg="53"/>
			<findme/>
			<push arg="54"/>
			<call arg="55"/>
			<iterate/>
			<store arg="32"/>
			<getasm/>
			<get arg="1"/>
			<push arg="57"/>
			<push arg="9"/>
			<new/>
			<dup/>
			<push arg="46"/>
			<pcall arg="58"/>
			<dup/>
			<push arg="59"/>
			<load arg="22"/>
			<pcall arg="60"/>
			<dup/>
			<push arg="61"/>
			<load arg="32"/>
			<pcall arg="60"/>
			<dup/>
			<push arg="62"/>
			<push arg="52"/>
			<push arg="63"/>
			<new/>
			<pcall arg="64"/>
			<pusht/>
			<pcall arg="65"/>
			<enditerate/>
			<enditerate/>
		</code>
		<linenumbertable>
			<lne id="66" begin="30" end="35"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="1" name="59" begin="6" end="37"/>
			<lve slot="2" name="61" begin="13" end="38"/>
			<lve slot="0" name="20" begin="0" end="39"/>
		</localvariabletable>
	</operation>
	<operation name="67">
		<context type="7"/>
		<parameters>
			<parameter name="22" type="68"/>
		</parameters>
		<code>
			<load arg="22"/>
			<push arg="59"/>
			<call arg="69"/>
			<store arg="32"/>
			<load arg="22"/>
			<push arg="61"/>
			<call arg="69"/>
			<store arg="70"/>
			<load arg="22"/>
			<push arg="62"/>
			<call arg="71"/>
			<store arg="72"/>
			<load arg="72"/>
			<dup/>
			<getasm/>
			<load arg="32"/>
			<get arg="41"/>
			<call arg="33"/>
			<set arg="41"/>
			<dup/>
			<getasm/>
			<load arg="70"/>
			<get arg="41"/>
			<call arg="33"/>
			<set arg="73"/>
			<pop/>
			<getasm/>
			<getasm/>
			<get arg="5"/>
			<pushi arg="22"/>
			<call arg="74"/>
			<set arg="5"/>
			<load arg="72"/>
			<getasm/>
			<get arg="5"/>
			<set arg="5"/>
		</code>
		<linenumbertable>
			<lne id="75" begin="15" end="15"/>
			<lne id="76" begin="15" end="16"/>
			<lne id="77" begin="13" end="18"/>
			<lne id="78" begin="21" end="21"/>
			<lne id="79" begin="21" end="22"/>
			<lne id="80" begin="19" end="24"/>
			<lne id="66" begin="12" end="25"/>
			<lne id="81" begin="26" end="26"/>
			<lne id="82" begin="27" end="27"/>
			<lne id="83" begin="27" end="28"/>
			<lne id="84" begin="29" end="29"/>
			<lne id="85" begin="27" end="30"/>
			<lne id="86" begin="26" end="31"/>
			<lne id="87" begin="32" end="32"/>
			<lne id="88" begin="33" end="33"/>
			<lne id="89" begin="33" end="34"/>
			<lne id="90" begin="32" end="35"/>
			<lne id="91" begin="26" end="35"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="4" name="62" begin="11" end="35"/>
			<lve slot="2" name="59" begin="3" end="35"/>
			<lve slot="3" name="61" begin="7" end="35"/>
			<lve slot="0" name="20" begin="0" end="35"/>
			<lve slot="1" name="92" begin="0" end="35"/>
		</localvariabletable>
	</operation>
	<operation name="93">
		<context type="7"/>
		<parameters>
		</parameters>
		<code>
			<push arg="94"/>
			<push arg="53"/>
			<findme/>
			<push arg="54"/>
			<call arg="55"/>
			<iterate/>
			<store arg="22"/>
			<push arg="56"/>
			<push arg="53"/>
			<findme/>
			<push arg="54"/>
			<call arg="55"/>
			<iterate/>
			<store arg="32"/>
			<getasm/>
			<get arg="1"/>
			<push arg="57"/>
			<push arg="9"/>
			<new/>
			<dup/>
			<push arg="49"/>
			<pcall arg="58"/>
			<dup/>
			<push arg="95"/>
			<load arg="22"/>
			<pcall arg="60"/>
			<dup/>
			<push arg="61"/>
			<load arg="32"/>
			<pcall arg="60"/>
			<dup/>
			<push arg="62"/>
			<push arg="94"/>
			<push arg="63"/>
			<new/>
			<pcall arg="64"/>
			<pusht/>
			<pcall arg="65"/>
			<enditerate/>
			<enditerate/>
		</code>
		<linenumbertable>
			<lne id="96" begin="30" end="35"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="1" name="95" begin="6" end="37"/>
			<lve slot="2" name="61" begin="13" end="38"/>
			<lve slot="0" name="20" begin="0" end="39"/>
		</localvariabletable>
	</operation>
	<operation name="97">
		<context type="7"/>
		<parameters>
			<parameter name="22" type="68"/>
		</parameters>
		<code>
			<load arg="22"/>
			<push arg="95"/>
			<call arg="69"/>
			<store arg="32"/>
			<load arg="22"/>
			<push arg="61"/>
			<call arg="69"/>
			<store arg="70"/>
			<load arg="22"/>
			<push arg="62"/>
			<call arg="71"/>
			<store arg="72"/>
			<load arg="72"/>
			<dup/>
			<getasm/>
			<load arg="32"/>
			<get arg="41"/>
			<call arg="33"/>
			<set arg="41"/>
			<dup/>
			<getasm/>
			<load arg="70"/>
			<get arg="41"/>
			<call arg="33"/>
			<set arg="73"/>
			<pop/>
			<getasm/>
			<getasm/>
			<get arg="5"/>
			<pushi arg="22"/>
			<call arg="74"/>
			<set arg="5"/>
			<load arg="72"/>
			<getasm/>
			<get arg="5"/>
			<set arg="5"/>
		</code>
		<linenumbertable>
			<lne id="98" begin="15" end="15"/>
			<lne id="99" begin="15" end="16"/>
			<lne id="100" begin="13" end="18"/>
			<lne id="101" begin="21" end="21"/>
			<lne id="102" begin="21" end="22"/>
			<lne id="103" begin="19" end="24"/>
			<lne id="96" begin="12" end="25"/>
			<lne id="104" begin="26" end="26"/>
			<lne id="105" begin="27" end="27"/>
			<lne id="106" begin="27" end="28"/>
			<lne id="107" begin="29" end="29"/>
			<lne id="108" begin="27" end="30"/>
			<lne id="109" begin="26" end="31"/>
			<lne id="110" begin="32" end="32"/>
			<lne id="111" begin="33" end="33"/>
			<lne id="112" begin="33" end="34"/>
			<lne id="113" begin="32" end="35"/>
			<lne id="114" begin="26" end="35"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="4" name="62" begin="11" end="35"/>
			<lve slot="2" name="95" begin="3" end="35"/>
			<lve slot="3" name="61" begin="7" end="35"/>
			<lve slot="0" name="20" begin="0" end="35"/>
			<lve slot="1" name="92" begin="0" end="35"/>
		</localvariabletable>
	</operation>
</asm>
