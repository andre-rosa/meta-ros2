# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "The ros_reflexxes package"
AUTHOR = "Daniel Zumkeller <daniel.zumkeller@live.de>"
HOMEPAGE = "https://gitlab.ira.uka.de/iirob/ros_reflexxes"
SECTION = "devel"
LICENSE = "LGPL-2"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=b691248d2f70cdaeeaf13696ada5d47c"

ROS_CN = "ipr_extern"
ROS_BPN = "ros_reflexxes"

ROS_BUILD_DEPENDS = " \
    cmake-modules \
    libreflexxestype2 \
    roscpp \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    libreflexxestype2 \
    roscpp \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    libreflexxestype2 \
    roscpp \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/KITrobotics/ipr_extern-release/archive/release/melodic/ros_reflexxes/0.8.8-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "8fffb3fa73dbc65e4c7269b14a051d66"
SRC_URI[sha256sum] = "76626c036fcf97fd86efb214887ddffe715d343b660a6117eddd0f833ef11fda"
S = "${WORKDIR}/ipr_extern-release-release-melodic-ros_reflexxes-0.8.8-1"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('ipr-extern', d)}"
ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('ipr-extern', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/ipr-extern/ipr-extern_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/ipr-extern/ipr-extern-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/ipr-extern/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/ipr-extern/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}