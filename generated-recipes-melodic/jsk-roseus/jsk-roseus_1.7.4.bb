# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_superflore_generated

DESCRIPTION = "<p>Metapackage that contains roseus package for jsk-ros-pkg</p>"
AUTHOR = "Kei Okada <k-okada@jsk.t.u-tokyo.ac.jp>"
ROS_AUTHOR = "Ryohei Ueda <ueda@jsk.t.u-tokyo.ac.jp>"
HOMEPAGE = "http://ros.org/wiki/jsk_roseus"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "jsk_roseus"
ROS_BPN = "jsk_roseus"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    euslisp \
    geneus \
    roseus \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    euslisp \
    geneus \
    roseus \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/tork-a/jsk_roseus-release/archive/release/melodic/jsk_roseus/1.7.4-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "7039d74a248ed9e5afc636fceb7ef9ca"
SRC_URI[sha256sum] = "c72f89169571ed31e8051108300d8c87d656c9f72df5d91e96bd8ec808c796a4"
S = "${WORKDIR}/jsk_roseus-release-release-melodic-jsk_roseus-1.7.4-0"

ROS_BUILD_TYPE = "catkin"
ROS_COMPONENT_TYPE = "${@ros_common__get_component_type('jsk-roseus', d)}"

# Allow the above settings to be overridden.
ROS_RECIPES_TREE := "${@ros_superflore_generated__get_recipes_tree('jsk-roseus', d)}"
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/jsk-roseus/jsk-roseus_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/jsk-roseus/jsk-roseus-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/jsk-roseus/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/jsk-roseus/${BPN}-${PV}.inc

inherit ros_distro_${ROS_DISTRO}
inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
