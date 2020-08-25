<?xml version = '1.0' encoding = 'ISO-8859-1' ?>
<asm version="1.0" name="0">
	<cp>
		<constant value="computeVelocity"/>
		<constant value="links"/>
		<constant value="NTransientLinkSet;"/>
		<constant value="col"/>
		<constant value="J"/>
		<constant value="main"/>
		<constant value="A"/>
		<constant value="OclParametrizedType"/>
		<constant value="#native"/>
		<constant value="Collection"/>
		<constant value="J.setName(S):V"/>
		<constant value="OclSimpleType"/>
		<constant value="OclAny"/>
		<constant value="J.setElementType(J):V"/>
		<constant value="TransientLinkSet"/>
		<constant value="A.__matcher__():V"/>
		<constant value="A.__exec__():V"/>
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
		<constant value="A.__matchparticle2Velocity():V"/>
		<constant value="__exec__"/>
		<constant value="particle2Velocity"/>
		<constant value="NTransientLinkSet;.getLinksByRule(S):QNTransientLink;"/>
		<constant value="A.__applyparticle2Velocity(NTransientLink;):V"/>
		<constant value="__matchparticle2Velocity"/>
		<constant value="Feature"/>
		<constant value="particleCRA"/>
		<constant value="IN1"/>
		<constant value="MMOF!Classifier;.allInstancesFrom(S):QJ"/>
		<constant value="IN2"/>
		<constant value="id"/>
		<constant value="J.=(J):J"/>
		<constant value="classname"/>
		<constant value="J.&lt;&gt;(J):J"/>
		<constant value="J.and(J):J"/>
		<constant value="B.not():B"/>
		<constant value="51"/>
		<constant value="TransientLink"/>
		<constant value="NTransientLink;.setRule(MATL!Rule;):V"/>
		<constant value="ft1"/>
		<constant value="NTransientLink;.addSourceElement(SJ):V"/>
		<constant value="ft2"/>
		<constant value="p"/>
		<constant value="Point"/>
		<constant value="velocityVector"/>
		<constant value="NTransientLink;.addTargetElement(SJ):V"/>
		<constant value="NTransientLinkSet;.addLink2(NTransientLink;B):V"/>
		<constant value="8:4-8:7"/>
		<constant value="8:4-8:10"/>
		<constant value="8:11-8:14"/>
		<constant value="8:11-8:17"/>
		<constant value="8:4-8:17"/>
		<constant value="8:22-8:25"/>
		<constant value="8:22-8:35"/>
		<constant value="8:37-8:40"/>
		<constant value="8:37-8:50"/>
		<constant value="8:22-8:50"/>
		<constant value="8:4-8:50"/>
		<constant value="10:3-13:4"/>
		<constant value="__applyparticle2Velocity"/>
		<constant value="NTransientLink;"/>
		<constant value="NTransientLink;.getSourceElement(S):J"/>
		<constant value="3"/>
		<constant value="NTransientLink;.getTargetElement(S):J"/>
		<constant value="4"/>
		<constant value="X"/>
		<constant value="6"/>
		<constant value="J.length():J"/>
		<constant value="J.substring(JJ):J"/>
		<constant value="J.toInteger():J"/>
		<constant value="Y"/>
		<constant value="11:9-11:12"/>
		<constant value="11:9-11:15"/>
		<constant value="11:4-11:15"/>
		<constant value="12:9-12:12"/>
		<constant value="12:9-12:22"/>
		<constant value="12:33-12:34"/>
		<constant value="12:36-12:39"/>
		<constant value="12:36-12:49"/>
		<constant value="12:36-12:58"/>
		<constant value="12:9-12:59"/>
		<constant value="12:9-12:71"/>
		<constant value="12:4-12:71"/>
		<constant value="link"/>
	</cp>
	<field name="1" type="2"/>
	<field name="3" type="4"/>
	<operation name="5">
		<context type="6"/>
		<parameters>
		</parameters>
		<code>
			<getasm/>
			<push arg="7"/>
			<push arg="8"/>
			<new/>
			<dup/>
			<push arg="9"/>
			<pcall arg="10"/>
			<dup/>
			<push arg="11"/>
			<push arg="8"/>
			<new/>
			<dup/>
			<push arg="12"/>
			<pcall arg="10"/>
			<pcall arg="13"/>
			<set arg="3"/>
			<getasm/>
			<push arg="14"/>
			<push arg="8"/>
			<new/>
			<set arg="1"/>
			<getasm/>
			<pcall arg="15"/>
			<getasm/>
			<pcall arg="16"/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="0" name="17" begin="0" end="24"/>
		</localvariabletable>
	</operation>
	<operation name="18">
		<context type="6"/>
		<parameters>
			<parameter name="19" type="4"/>
		</parameters>
		<code>
			<load arg="19"/>
			<getasm/>
			<get arg="3"/>
			<call arg="20"/>
			<if arg="21"/>
			<getasm/>
			<get arg="1"/>
			<load arg="19"/>
			<call arg="22"/>
			<dup/>
			<call arg="23"/>
			<if arg="24"/>
			<load arg="19"/>
			<call arg="25"/>
			<goto arg="26"/>
			<pop/>
			<load arg="19"/>
			<goto arg="27"/>
			<push arg="28"/>
			<push arg="8"/>
			<new/>
			<load arg="19"/>
			<iterate/>
			<store arg="29"/>
			<getasm/>
			<load arg="29"/>
			<call arg="30"/>
			<call arg="31"/>
			<enditerate/>
			<call arg="32"/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="2" name="33" begin="23" end="27"/>
			<lve slot="0" name="17" begin="0" end="29"/>
			<lve slot="1" name="34" begin="0" end="29"/>
		</localvariabletable>
	</operation>
	<operation name="35">
		<context type="6"/>
		<parameters>
			<parameter name="19" type="4"/>
			<parameter name="29" type="36"/>
		</parameters>
		<code>
			<getasm/>
			<get arg="1"/>
			<load arg="19"/>
			<call arg="22"/>
			<load arg="19"/>
			<load arg="29"/>
			<call arg="37"/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="0" name="17" begin="0" end="6"/>
			<lve slot="1" name="34" begin="0" end="6"/>
			<lve slot="2" name="38" begin="0" end="6"/>
		</localvariabletable>
	</operation>
	<operation name="39">
		<context type="6"/>
		<parameters>
		</parameters>
		<code>
			<getasm/>
			<pcall arg="40"/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="0" name="17" begin="0" end="1"/>
		</localvariabletable>
	</operation>
	<operation name="41">
		<context type="6"/>
		<parameters>
		</parameters>
		<code>
			<getasm/>
			<get arg="1"/>
			<push arg="42"/>
			<call arg="43"/>
			<iterate/>
			<store arg="19"/>
			<getasm/>
			<load arg="19"/>
			<pcall arg="44"/>
			<enditerate/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="1" name="33" begin="5" end="8"/>
			<lve slot="0" name="17" begin="0" end="9"/>
		</localvariabletable>
	</operation>
	<operation name="45">
		<context type="6"/>
		<parameters>
		</parameters>
		<code>
			<push arg="46"/>
			<push arg="47"/>
			<findme/>
			<push arg="48"/>
			<call arg="49"/>
			<iterate/>
			<store arg="19"/>
			<push arg="46"/>
			<push arg="47"/>
			<findme/>
			<push arg="50"/>
			<call arg="49"/>
			<iterate/>
			<store arg="29"/>
			<load arg="19"/>
			<get arg="51"/>
			<load arg="29"/>
			<get arg="51"/>
			<call arg="52"/>
			<load arg="19"/>
			<get arg="53"/>
			<load arg="29"/>
			<get arg="53"/>
			<call arg="54"/>
			<call arg="55"/>
			<call arg="56"/>
			<if arg="57"/>
			<getasm/>
			<get arg="1"/>
			<push arg="58"/>
			<push arg="8"/>
			<new/>
			<dup/>
			<push arg="42"/>
			<pcall arg="59"/>
			<dup/>
			<push arg="60"/>
			<load arg="19"/>
			<pcall arg="61"/>
			<dup/>
			<push arg="62"/>
			<load arg="29"/>
			<pcall arg="61"/>
			<dup/>
			<push arg="63"/>
			<push arg="64"/>
			<push arg="65"/>
			<new/>
			<pcall arg="66"/>
			<pusht/>
			<pcall arg="67"/>
			<enditerate/>
			<enditerate/>
		</code>
		<linenumbertable>
			<lne id="68" begin="14" end="14"/>
			<lne id="69" begin="14" end="15"/>
			<lne id="70" begin="16" end="16"/>
			<lne id="71" begin="16" end="17"/>
			<lne id="72" begin="14" end="18"/>
			<lne id="73" begin="19" end="19"/>
			<lne id="74" begin="19" end="20"/>
			<lne id="75" begin="21" end="21"/>
			<lne id="76" begin="21" end="22"/>
			<lne id="77" begin="19" end="23"/>
			<lne id="78" begin="14" end="24"/>
			<lne id="79" begin="43" end="48"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="1" name="60" begin="6" end="50"/>
			<lve slot="2" name="62" begin="13" end="51"/>
			<lve slot="0" name="17" begin="0" end="52"/>
		</localvariabletable>
	</operation>
	<operation name="80">
		<context type="6"/>
		<parameters>
			<parameter name="19" type="81"/>
		</parameters>
		<code>
			<load arg="19"/>
			<push arg="60"/>
			<call arg="82"/>
			<store arg="29"/>
			<load arg="19"/>
			<push arg="62"/>
			<call arg="82"/>
			<store arg="83"/>
			<load arg="19"/>
			<push arg="63"/>
			<call arg="84"/>
			<store arg="85"/>
			<load arg="85"/>
			<dup/>
			<getasm/>
			<load arg="83"/>
			<get arg="51"/>
			<call arg="30"/>
			<set arg="86"/>
			<dup/>
			<getasm/>
			<load arg="83"/>
			<get arg="53"/>
			<pushi arg="87"/>
			<load arg="83"/>
			<get arg="53"/>
			<call arg="88"/>
			<call arg="89"/>
			<call arg="90"/>
			<call arg="30"/>
			<set arg="91"/>
			<pop/>
		</code>
		<linenumbertable>
			<lne id="92" begin="15" end="15"/>
			<lne id="93" begin="15" end="16"/>
			<lne id="94" begin="13" end="18"/>
			<lne id="95" begin="21" end="21"/>
			<lne id="96" begin="21" end="22"/>
			<lne id="97" begin="23" end="23"/>
			<lne id="98" begin="24" end="24"/>
			<lne id="99" begin="24" end="25"/>
			<lne id="100" begin="24" end="26"/>
			<lne id="101" begin="21" end="27"/>
			<lne id="102" begin="21" end="28"/>
			<lne id="103" begin="19" end="30"/>
			<lne id="79" begin="12" end="31"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="4" name="63" begin="11" end="31"/>
			<lve slot="2" name="60" begin="3" end="31"/>
			<lve slot="3" name="62" begin="7" end="31"/>
			<lve slot="0" name="17" begin="0" end="31"/>
			<lve slot="1" name="104" begin="0" end="31"/>
		</localvariabletable>
	</operation>
</asm>
