# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_superflore_generated

DESCRIPTION = "Package with launch files for demonstrations with the ECA A9 AUV"
AUTHOR = "Thibault Pelletier <thp@eca.fr>"
ROS_AUTHOR = "Thibault Pelletier <thp@eca.fr>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=17;endline=17;md5=82f0323c08605e5b6f343b05213cf7cc"

ROS_CN = "eca_a9"
ROS_BPN = "eca_a9_gazebo"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    eca-a9-control \
    eca-a9-description \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/uuvsimulator/eca_a9-release/archive/release/melodic/eca_a9_gazebo/0.1.6-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "f94987f00d700f237233aea9da99fe4c"
SRC_URI[sha256sum] = "e2dce04036c923f6df2b176be5b73ffc2f2f7002fb0c2db7f54d2ea686499d9e"
S = "${WORKDIR}/eca_a9-release-release-melodic-eca_a9_gazebo-0.1.6-0"

ROS_BUILD_TYPE = "catkin"
ROS_COMPONENT_TYPE = "${@ros_common__get_component_type('eca-a9', d)}"

# Allow the above settings to be overridden.
ROS_RECIPES_TREE := "${@ros_superflore_generated__get_recipes_tree('eca-a9', d)}"
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/eca-a9/eca-a9_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/eca-a9/eca-a9-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/eca-a9/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/eca-a9/${BPN}-${PV}.inc

inherit ros_distro_${ROS_DISTRO}
inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
