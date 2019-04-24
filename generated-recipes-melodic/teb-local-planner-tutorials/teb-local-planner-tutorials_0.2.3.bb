# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "The teb_local_planner_tutorials package"
AUTHOR = "Christoph Rösmann <christoph.roesmann@tu-dortmund.de>"
ROS_AUTHOR = "Christoph Rösmann <christoph.roesmann@tu-dortmund.de>"
HOMEPAGE = "http://wiki.ros.org/teb_local_planner_tutorials"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "teb_local_planner_tutorials"
ROS_BPN = "teb_local_planner_tutorials"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    amcl \
    map-server \
    move-base \
    stage-ros \
    teb-local-planner \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    amcl \
    map-server \
    move-base \
    stage-ros \
    teb-local-planner \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/rst-tu-dortmund/teb_local_planner_tutorials-release/archive/release/melodic/teb_local_planner_tutorials/0.2.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "8a0971930fc8c6d1d92428931b271ee0"
SRC_URI[sha256sum] = "0a565d87f210b89666efd8a62608439a79462561b64a5fa731756ec5af290b37"
S = "${WORKDIR}/teb_local_planner_tutorials-release-release-melodic-teb_local_planner_tutorials-0.2.3-0"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('teb-local-planner-tutorials', d)}"
ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('teb-local-planner-tutorials', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/teb-local-planner-tutorials/teb-local-planner-tutorials_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/teb-local-planner-tutorials/teb-local-planner-tutorials-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/teb-local-planner-tutorials/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/teb-local-planner-tutorials/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
