# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_superflore_generated

DESCRIPTION = "The people stack holds algorithms for perceiving people from a number of sensors."
AUTHOR = "Dan Lazewatsky <dan@lazewatsky.com>"
HOMEPAGE = "http://ros.org/wiki/people"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_BPN = "people"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    face-detector \
    leg-detector \
    people-msgs \
    people-tracking-filter \
    people-velocity-tracker \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/OSUrobotics/people-release/archive/release/melodic/people/1.1.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "ddbbfaf947d9f1629c2e7ea6e6b23cc1"
SRC_URI[sha256sum] = "c9e1e3a253e0a4674504cf974f66e24d91ae6552eca545cd8fde925c94dd7bdc"
S = "${WORKDIR}/people-release-release-melodic-people-1.1.2-0"

ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_RECIPES_TREE := "${@ros_superflore_generated__get_recipes_tree('people', d)}"
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/people/people_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/people/people-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/people/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/people/${BPN}-${PV}.inc

inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
