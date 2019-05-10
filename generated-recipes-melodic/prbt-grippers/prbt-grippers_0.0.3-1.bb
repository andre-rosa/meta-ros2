# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "The package provides gripper support for the pilz_robots package."
AUTHOR = "Alexander Gutenkunst <a.gutenkunst@pilz.de>"
HOMEPAGE = "http://ros.org/wiki/prbt_grippers"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

ROS_CN = "prbt_grippers"
ROS_BPN = "prbt_grippers"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    prbt-pg70-support \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/PilzDE/prbt_grippers-release/archive/release/melodic/prbt_grippers/0.0.3-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "310ae24aeffc06b0875b882bee4fb4fe"
SRC_URI[sha256sum] = "f623ce025264f9a4407ee7687efc7dc058aaee1d80f1c81eeaa5e569c1c519dc"
S = "${WORKDIR}/prbt_grippers-release-release-melodic-prbt_grippers-0.0.3-1"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('prbt-grippers', d)}"
ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('prbt-grippers', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/prbt-grippers/prbt-grippers_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/prbt-grippers/prbt-grippers-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/prbt-grippers/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/prbt-grippers/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
